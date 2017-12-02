package Exercixe14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask {
    public static ArrayList<Integer> list = new ArrayList<Integer>();
    public static HashSet<Integer> hashSet = new HashSet<Integer>();


    public static void main(String[] args) {
       fillArray();
       maxNumber();
       minNumber();

    }

    public static void fillArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite kolichestvo elementov");
        int number = scanner.nextInt();
        Random r = new Random();
        while (hashSet.size() < number){
            hashSet.add(r.nextInt(number *2));
        }
        for (Integer i : hashSet) {
            list.add(i);
        }
        System.out.print("Elementi massiva: ");
        for (Integer i : hashSet) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void maxNumber(){
        int max = list.get(0);
        for (int j : list) {
            if (j > max) max = j;
        }
        System.out.println("Maksimalnoe chislo " + max);
    }
    public static void minNumber(){
        int min = list.get(0);
        for (int j : list) {
            if (j < min) min = j;
        }
        System.out.println("Minimalnoe chislo " + min);
    }

}
