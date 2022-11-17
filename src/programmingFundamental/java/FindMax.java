package programmingFundamental.java;

import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter numbers :");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if(x>=y){
            if (x>=z){
                System.out.println(x);
            }
            else {
                System.out.println(z);
            }
        }
        else if (z>=y){
            System.out.println(z);
        }
        else {
            System.out.println(y);
        }

    }



}
