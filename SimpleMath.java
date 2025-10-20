public class SimpleMath {

public static void main(String[] args) {
        BasicMathSolver mathSolver = new BasicMathSolver();

        int numberOne = 5;
        int numberTwo = 4;
     
        System.out.print(mathSolver.Add(numberOne, numberTwo));
        System.out.print(mathSolver.Subtract(numberOne, numberTwo));
        System.out.print(mathSolver.Multiply(numberOne, numberTwo));
        System.out.print(mathSolver.Divide(numberOne, numberTwo));
    }
};
