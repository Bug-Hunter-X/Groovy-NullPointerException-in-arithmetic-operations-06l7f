# Groovy NullPointerException in Arithmetic Operations

This repository demonstrates a common error in Groovy involving null values and arithmetic operations.  The `myMethod` attempts to add two numbers, but doesn't handle the case where either input is null which could lead to a NullPointerException.

The `bug.groovy` file showcases the problem, while `bugSolution.groovy` provides a corrected version with improved null handling.

## Reproducing the Bug

1.  Clone this repository.
2.  Run `bug.groovy` using a Groovy interpreter (e.g., `groovy bug.groovy`).
3.  Observe the NullPointerException.

## Solution

The solution involves adding a null check before the arithmetic operation, effectively preventing the NullPointerException and returning an appropriate value (in this case, null).