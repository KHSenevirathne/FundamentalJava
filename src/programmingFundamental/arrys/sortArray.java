package programmingFundamental.arrys;

import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Array Size : ");
        int size = input.nextInt();

        int [] x = new int[size];
        System.out.print("Enter Values\n");

        for (int i = 0; i<size; i++){
            System.out.print("["+(i+1)+"] : ");
            x[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(x));

        System.out.print("[1] min to max\n[2] max to min :");
        int sort = input.nextInt();

        if (sort==1){
            sortMax(x);
            System.out.println(Arrays.toString(x));
        }else {
            sortMin(x);
            System.out.println(Arrays.toString(x));
        }

        /*Arrays.sort(x);
        System.out.println(Arrays.toString(x));*/



    }

    public static void sortMin(int [] x){
        for (int i = 0; i< x.length; i++){
            for (int j = 0; j<x.length; j++){
                if (x[i]>x[j]){
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }

    public static void sortMax(int [] x){
        for (int i = 0; i< x.length; i++){
            for (int j = 0; j<x.length; j++){
                if (x[i]<x[j]){
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }
}
