import java.util.Scanner;

public class Exercise4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Vvedite celoe chislo ");
        if(scanner.hasNextInt()){
                number = scanner.nextInt();
            }else{
                System.out.println("Vi vveli neceloe chislo");
                return;
            }
        int number2 = 0;
        int ostatok = 0;
        int i = number;
        while(i > 0){
            ostatok = i % 10;
            number2 = number2 * 10 + ostatok;
            i /= 10;
        }
        if (number2 == number) System.out.println("Polindrom");
        else System.out.println("Nie polindrom");
    }
}
