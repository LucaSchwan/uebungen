data Optional a = Empty|Present

mapOptional::(a ->b) -> Optional a-> Optional b
mapOptional x Empty = Empty

