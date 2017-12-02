import java.util.Scanner;

public class Exercise3_7 {
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
        int previousNumber = 0;
        int nextNumber = 0;
        int numberFibonacci = 0;
        while (i < number){
            if (i == 0){
                System.out.println(numberFibonacci);
                i++;
            }else if(i == 1){
                numberFibonacci = 1;
                System.out.println(numberFibonacci);
                i++;
                nextNumber = numberFibonacci;
            }
            else{
                numberFibonacci = nextNumber + previousNumber;
                System.out.println(numberFibonacci);
                previousNumber = nextNumber;
                nextNumber = numberFibonacci;
                i++;

            }
        }
    }
}
