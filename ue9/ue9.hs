data Optional = Empty | Present

mapOptional::(a ->b) -> Optional a-> Optional b
mapOptional x Empty = Empty

