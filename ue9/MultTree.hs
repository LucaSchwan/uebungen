data MultTree a = Index a a [MultTree a] | Daten a deriving Show


t1 :: MultTree Int 
t1 = Index 53 1 [Index 3 15 [Daten 7, Daten 11, Daten 12], Index 19 42 [Daten 42, Daten 18]]

t2::MultTree Int
t2 = Index 3 5 [Daten 5]

verzweigungsgrad:: MultTree a-> Int
verzweigungsgrad (Daten d) = 1
verzweigungsgrad  (Index _ _ (l:ls)) =  1 + max (verzweigungsgrad l) (verzweigungsgradListe ls) 

verzweigungsgradListe::[MultTree a]-> Int
verzweigungsgradListe (a:as) = max (verzweigungsgrad a) (verzweigungsgradListe as)
verzweigungsgradListe [] = 0


datenListe:: MultTree a -> [a]
datenListe (Daten d) = [d]
datenListe (Index _ _ (x:xs)) = datenListe x ++ datenListen xs

datenListen::[MultTree a]-> [a]
datenListen ((Daten d) :xs ) = [d] ++ datenListen xs
datenListen [] = []
datenListen ((Index _ _ d) :xs ) = datenListen d

datenIntervalle:: MultTree Int -> MultTree Int
datenIntervalle (Daten d) = Daten d
datenIntervalle (Index _ _ a) = (Index (minDaten a) (maxDaten a) (datenIntervalleListe a))

datenIntervalleListe:: [MultTree Int] -> [MultTree Int]
datenIntervalleListe ((Daten d): xs) = if null xs then [Daten d] else Daten d:datenIntervalleListe xs
datenIntervalleListe ((Index a b x): xs) = if null xs then [datenIntervalle (Index a b x)] else datenIntervalle (Index a b x) : datenIntervalleListe xs


minDaten:: [MultTree Int] -> Int 
minDaten ((Daten d) :xs) = if null xs then d else min d (minDaten xs)
minDaten ((Index _ _ a): xs) = if null xs then minDaten a else min (minDaten a) (minDaten xs) 

maxDaten:: [MultTree Int] -> Int 
maxDaten ((Daten d) :xs) = if null xs then d else max d (maxDaten xs)
maxDaten ((Index _ _ a): xs) = if null xs then maxDaten a else max (maxDaten a) (maxDaten xs)


contains:: MultTree Int -> Int ->Bool 
contains (Daten d) i = d==i
contains (Index x y (a:as)) i = if x <=y then if x<=i&&y>=i then (contains a i)||(containsListe as i)else False
                                else if y<=i&&x>=i then (contains a i)||(containsListe as i)else False

containsListe:: [MultTree Int] -> Int -> Bool 
containsListe (x:xs) i = (contains x i) || (containsListe xs i)
containsListe [] _ = False 