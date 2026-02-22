# Easy Explanations — Logical Java Programs

This file explains each small Java program in simple language so you can learn the logic quickly.

- Always compile all programs from the folder:

```bash
javac *.java
```

- Run an example program:

```bash
java PalindromeCheck
```

1) PalindromeCheck
- Purpose: Check whether a string reads the same forwards and backwards.
- How it works: reverse the string and compare with original.
- Example: Input `racecar` → Output `Palindrome`.

2) PrimeCheck
- Purpose: Decide if a number is prime (only divisors 1 and itself).
- How it works: test divisibility from 2 up to sqrt(n). If none divide, it's prime.
- Example: Input `29` → Output `29 is prime`.

3) Factorial
- Purpose: Compute n! = 1*2*...*n.
- How it works: loop multiplying numbers 2..n into a running product.
- Example: Input `10` → Output `Factorial of 10 = 3628800`.

4) Fibonacci
- Purpose: Print first n numbers in Fibonacci sequence (0,1,1,2,3...).
- How it works: start with a=0, b=1 and repeatedly set (a,b)=(b,a+b).
- Example: First 10 numbers → `0, 1, 1, 2, 3, 5, 8, 13, 21, 34`.

5) BubbleSortDemo
- Purpose: Demonstrate bubble sort on a small integer array.
- How it works: repeatedly pass through the array, swapping adjacent out-of-order items until sorted.
- Example: Input `{5,2,9,1,5,6}` → Output `{1,2,5,5,6,9}`.

6) AnagramCheck
- Purpose: Tell if two words/phrases use the same letters.
- How it works: remove spaces, lowercase, sort letters of both strings, compare equality.
- Example: `Listen` & `Silent` → `Anagram`.

7) ArmstrongNumber
- Purpose: Check if a number equals the sum of its digits each raised to the number of digits. (e.g., 153 = 1^3 + 5^3 + 3^3)
- How it works: count digits, extract each digit, raise to power, sum, compare to original.
- Example: `153` → `153 is an Armstrong number`.

8) ReverseWords
- Purpose: Reverse the order of words in a sentence (not reversing letters inside words).
- How it works: split sentence by whitespace and join parts in reverse order.
- Example: `The quick brown fox` → `fox brown quick The`.

9) GcdLcm
- Purpose: Compute GCD (greatest common divisor) and LCM (least common multiple).
- How it works: GCD via Euclid's algorithm (remainder loop); LCM = |a*b|/GCD.
- Example: `12` and `18` → `GCD=6`, `LCM=36`.

10) MatrixMultiplication
- Purpose: Multiply two matrices (A × B) when sizes match.
- How it works: result[i][j] = sum over k of A[i][k] * B[k][j]. Triple nested loops.
- Example: `[[1,2],[3,4]] × [[5,6],[7,8]]` → `[[19,22],[43,50]]`.

Tips for learning the logic
- Read each `main` to see the example inputs used.
- Add print statements or change example values to experiment.
- Trace small examples on paper to follow loops and calculations.

If you want, I can:
- Add inline comments inside each Java file, or
- Run each program and show outputs here.
