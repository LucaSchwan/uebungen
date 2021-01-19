isMatrix :: [[Int]] -> Bool
isMatrix [] = True
isMatrix [_] = True
isMatrix (e1 : e2 : matrix) = if length e1 == length e2 then isMatrix (e2 : matrix)

-- dimensions :: [[Int]] -> (Int, Int)
-- dimensions matrix = if isMatrix matrix then (numCol matrix, numRow matrix)
                    -- else (-1, -1)

-- numRows :: [[Int]] -> Int
-- numRows matrix = if isMatrix matrix then length matrix

-- numCol :: [[Int]] -> Int
-- numCol matrix = if isMatrix matrix then length matrix !! 0

-- isQuadratic :: [[Int]] -> Bool
-- isQuadratic matrix = if isMatrix matrix then if length matrix == length (matrix !! 1) then True
