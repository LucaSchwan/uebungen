from :: Int-> [Int]
from x = x : from(x+1)

drop_mult :: Int -> [Int] -> [Int]
drop_mult x xs = filter (\y -> mod y x /= 0) xs

dropall :: [Int] -> [Int]
dropall (x : xs) = x : dropall (drop_mult x xs)

primes :: [Int]
primes = dropall (from 2)

goodPrimes :: [Int]
goodPrimes = good primes
  where
    good (x : xs@(y : z : _)) = if y ^ 2 > x * z then y : good xs else good xs
