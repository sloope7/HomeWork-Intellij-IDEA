import java.util.Scanner;

public class Exercise3_7_2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int number = 0;
        System.out.println("Vvedite celoe chislo");
        if (scanner1.hasNextInt()) {
            number = scanner1.nextInt();
        } else {
            System.out.println("Vi vveli neceloe chislo");
            return;
        }
        int i = 0;
        int previousNumber;
        int nextNumber = 0;
        int numberFibonacci = 1;
        while (i < number){
            System.out.print(numberFibonacci + " ");
            previousNumber = nextNumber;
            nextNumber = numberFibonacci;
            numberFibonacci = previousNumber + nextNumber;
            i++;
            }
        }
    }

