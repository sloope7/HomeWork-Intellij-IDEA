package Other;

import java.util.Scanner;

public class FibonachchiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            b = scanner.nextInt();
        } else {
            System.out.println("Vi vveli neceloe chislo");
            return;
        }
        int [][] array = new int[a][b];
        int previousNumber;
        int nextNumber = 0;
        int numberFibonacci = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = numberFibonacci;
                previousNumber = nextNumber;
                nextNumber = numberFibonacci;
                numberFibonacci = previousNumber + nextNumber;
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.println();
            for (int j = 0; j < b; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}