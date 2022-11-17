package programmingFundamental.java;

import java.util.Scanner;

public class PrintMinToMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Numbers : ");
        int x  = input.nextInt();
        int y  = input.nextInt();
        int z  = input.nextInt();

        int min1, min2, min3;

        if (x<=y){
            if (x<=z){
                min1 = x;
                if (y<=z){
                    min2 = y;
                    min3 = z;
                }else {
                    min2 = z;
                    min3 = y;
                }
            }else{
                min1 = z;
                min2 = x;
                min3 = y;
            }
        }else if (y<=z){
            min1 = y;
            if (x<=z){
                min2 = x;
                min3 = z;
            }else {
                min2 = z;
                min3 = x;
            }
        }else{
            min1 = z;
            min2 = y;
            min3 = x;
        }
        System.out.println(min1+","+min2+","+min3);
    }
}
