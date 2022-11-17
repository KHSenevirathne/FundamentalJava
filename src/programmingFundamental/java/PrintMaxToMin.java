package programmingFundamental.java;

import java.util.Scanner;

public class PrintMaxToMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your numbers : ");
        int x  = input.nextInt();
        int y  = input.nextInt();
        int z  = input.nextInt();

        int max1,max2,max3;

        if (x>=y){
            if(x>=z){
                max1 = x;
                if (y>=z){
                    max2 = y;
                    max3 = z;
                }else{
                    max2 = z;
                    max3 = y;
                }
            }else{
                max1 = z;
                max2 = x;
                max3 = y;
            }
        }else if(y>=z){
            max1 = y;
            if(z>=x){
                max2 = z;
                max3 = x;
            }else {
                max2 = x;
                max3 = z;
            }
        }else{
            max1 = z;
            max2 = y;
            max3 = x;
        }

        System.out.println(max1+","+max2+","+max3);
    }
}
