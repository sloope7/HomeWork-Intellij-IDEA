import java.util.Scanner;

public class Exercise4_2 {
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
        int ostatok;
        int sum = 0;
        int i = number;
        while (i > 0){
            ostatok = i % 10;
            sum += ostatok;
            i /= 10;
        }
        System.out.println("Summa cifr chisla " + sum);
    }
}
