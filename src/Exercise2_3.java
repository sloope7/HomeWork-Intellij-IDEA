import java.util.Scanner;

public class Exercise2_3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите первое число");
        double firstNumber = scanner1.nextDouble();
        System.out.println("Введите второе число");
        double secondNumber = scanner1.nextDouble();
        System.out.println("Введите симол операции");
        String symbol = scanner2.nextLine();
        switch (symbol){
            case "+":{
                System.out.println(firstNumber + secondNumber);
                break;
            }
            case "-":{
                System.out.println(firstNumber - secondNumber);
                break;
            }
            case "*":{
                System.out.println(firstNumber * secondNumber);
                break;
            }
            case "/":{
                System.out.println(firstNumber / secondNumber);
                break;
            }
            default:{
                System.out.println("Вы ввели неверный символ операции");
            }
        }
    }
}
