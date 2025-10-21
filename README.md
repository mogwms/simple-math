# Project Reflection
Week 2 - Project 3

Learned how to use basic Java operators such as addition, subtraction, multiplication, division, as well as calling one Java class in another.

# Pseudocode

```
  CLASS BasicMathSolver
    FUNCTION Subtract (double num1, double num2)
      RETURN NUM1 - NUM2
    END FUNCTION

    FUNCTION Add (double num1, double num2)
      RETURN NUM1 + NUM2
    END FUNCTION

    FUNCTION Divide (double num1, double num2)
      RETURN NUM1 / NUM2
    END FUNCTION

    FUNCTION Multiply (double num1, double num2)
      RETURN NUM1 * NUM2
    END FUNCTION
  END CLASS

  START
    PROPERTY mathSolver = NEW BasicMathSolver()
    INT numberOne = 5
    INT numberTwo = 4

    PRINT mathSolver.Add(numberOne, numberTwo)
    PRINT mathSolver.Subtract(numberOne, numberTwo)
    PRINT mathSolver.Multiply(numberOne, numberTwo)
    PRINT mathSolver.Divide(numberOne, numberTwo)
  END
```
