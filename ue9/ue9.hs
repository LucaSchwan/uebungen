data Optional a = Empty | Present a deriving Show
data Product = Article String Int deriving Show

mapOptional :: (a -> b) -> Optional a -> Optional b
mapOptional f Empty = Empty
mapOptional f (Present o) = Present (f o)

filterOptional :: (a -> Bool) -> Optional a -> Optional a
filterOptional f Empty = Empty
filterOptional f (Present o) = if f o then Present o else Empty

foldOptional :: (a -> b) -> b -> Optional a -> b
foldOptional f s Empty = s
foldOptional f s (Present o) = f o

isHumanEatable :: Product -> Bool
isHumanEatable (Article s _) = if s == "Dog Food" then False else True

adjustPrice :: Product -> Product
adjustPrice (Article s p) = if p < 1000 then Article s (p * 2) else Article s p

stringify :: Product -> String
stringify (Article s p) = "The article named '" ++ s ++ "' costs " ++ show p ++ " Cent."

filterHumanEatable :: Product -> Optional Product
filterHumanEatable a = filterOptional isHumanEatable (Present a)

adjustPriceO :: Optional Product -> Optional Product
adjustPriceO a = mapOptional adjustPrice a

stringifyO :: Optional Product -> String
stringifyO a = foldOptional stringify "This article is unavailable." a

toPriceTag :: Product -> String
toPriceTag a = stringifyO (adjustPriceO (filterHumanEatable a))
