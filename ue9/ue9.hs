data Optional a = Empty | Present a deriving Show

mapOptional:: (a -> b) -> Optional a -> Optional b
mapOptional f Empty = Empty
mapOptional f o = f o

filterOptional::(a -> Bool) -> Optional a -> Optional a
filterOptional f Empty = Empty

