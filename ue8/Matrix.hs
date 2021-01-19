isMatrix :: [[Int]] -> Bool
isMatrix [] = True
isMatrix [_] = True
isMatrix (e1 : e2 : matrix) = length e1 == length e2 && isMatrix (e2 : matrix)

dimensions :: [[Int]] -> (Int, Int)
dimensions matrix = if isMatrix matrix then (numRows matrix, numCol matrix) else (-1, -1)

numRows :: [[Int]] -> Int
numRows = length

numCol :: [[Int]] -> Int
numCol matrix = length (matrix !! 0)

isQuadratic :: [[Int]] -> Bool
isQuadratic matrix = if isMatrix matrix then
                       if length matrix == length (matrix !! 1) then True else False
                     else False

getRow :: [[Int]] -> Int -> [Int]
getRow [] _ = []
getRow (e : matrix) i = if isMatrix matrix then (e !! i) : (getRow matrix i) else [] 

getCol :: [[Int]] -> Int -> [Int]
getCol matrix i = if isMatrix matrix then matrix !! i else [] 
