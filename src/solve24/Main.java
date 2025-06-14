package solve24;

import fonction.ArithmeticTest;
import fonction.CastFunction;
import fonction.CutNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer le nombre à tester : ");
        String nextedLine = scanner.nextLine();

        CastFunction castFunction= new CastFunction();
        int number = castFunction.StringToInt(nextedLine);

        CutNumber cutNumber = new CutNumber();
        int[] tableau = cutNumber.CutNombre(number);

        ArithmeticTest arithmeticTest = new ArithmeticTest();
        arithmeticTest.test24(tableau);
    }
}
