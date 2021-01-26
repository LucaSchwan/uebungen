data Optional a = Empty | Present a

mapOptional::(a ->b) -> Optional a-> Optional b
mapOptional x Empty = Empty

