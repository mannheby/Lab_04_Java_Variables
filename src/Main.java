public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 1; //declaration and initial assignment integers
        int intOperandB = 5;
        int intSum = 2;
        int intProduct = 9;
        int intDifference = 14;
        int intQuotient = 6;
        int intModulo = 20;

        double doubleOperandA = 1.50; //declaration and initial assignment doubles
        double doubleOperandB = 6.10;
        double doubleSum = 10.50;
        double doubleProduct = 11.20;
        double doubleDifference = 15.70;
        double doubleQuotient = 12.50;
        double doubleModulo = 4.80;

        intSum = intOperandA + intOperandB; // int operations
        System.out.println("The sum using ints " + intOperandA + " and " + intOperandB + " is " + intSum); // prints
        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints " + intOperandA + " and " + intOperandB + " is " + intProduct);
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints " + intOperandA + " and " + intOperandB + " is " + intDifference);
        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints "  + intOperandA + " and " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB; // double operations
        System.out.println("The sum using doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum); // prints
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The modulo using doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);


    }
}