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

-- isHumanEatable :: Product -> Bool
-- isHumanEatable (Product s ) = if s == "Dog Food" then False else True

-- adjustPrice :: Product -> Product
-- adjustPrice (Product s p) = if p < 1000 then Product(s (p * 2)) else Product(s p)
