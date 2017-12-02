import java.util.Scanner;

public class Exercise4_3 {
    public static void main(String[] args) {
        int [][] array = new int[5][5];
//        Scanner scanner = new Scanner(System.in);
//        int number;
//        System.out.println("Vvedite celoe chislo ");
//        if(scanner.hasNextInt()){
//            number = scanner.nextInt();
//        }else{
//            System.out.println("Vi vveli neceloe chislo");
//            return;
//        }
        int number = 1;
        int nextNumber = number + 1;
        array [0][0] = number;
        int max = 4;
        int k = 1;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {

                if (k == 1){
                    array[i][j] = number;
                }


                if (i == 0 && j ==0){
                    array[i][j] = number;
                }else{
                    array[i][j] = nextNumber;
                    if (j == max){
                        i = j;

                        array[j][i] = max;
                    }
                    nextNumber ++;

                }

            }
        }


        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

    }
}
