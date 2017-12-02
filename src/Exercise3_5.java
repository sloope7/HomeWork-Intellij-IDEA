import java.util.Scanner;

public class Exercise3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int number;
        int sum = 0;
        while (i < 10){
            System.out.println("Vvedite celoe chetnoe chislo " + (i + 1));
            if(scanner.hasNextInt()){
                number = scanner.nextInt();
                if (number % 2 != 0){
                    System.out.println("Vi vveli nechetnoe chislo");
                    return;
                }
            }else{
                System.out.println("Vi vveli neceloe chislo");
                return;
            }
            sum += number;
            i++;
        }
        System.out.println(sum);
    }
}
