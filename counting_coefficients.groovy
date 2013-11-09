def factorial(int n) { n == 0 ? 1 : n * factorial(n - 1) }

/**
 * Computes falling factorials for a set of n elements
 * and subsets of k size. It is the number of k-permutations
 * of an n-set
 */
def fallingFactorials(int n, int k) {
    int end = (n - k + 1)    
    helper = { int num ->
       num <= end ? num : num * helper (num -1) 
    }
    
    helper n
}

assert fallingFactorials(5, 2) == 20
assert fallingFactorials(4, 2) == 12
assert fallingFactorials(5, 5) == factorial(5)
/**
 * Computes 
 */
def setPartitionsOrdered(n, k) {
    fallingFactorials(n, k) / factorial(k)
}

println setPartitionsOrdered(5, 2)