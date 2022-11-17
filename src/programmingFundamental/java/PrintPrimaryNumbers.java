package programmingFundamental.java;

import java.util.Scanner;

public class PrintPrimaryNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int number = input.nextInt();


        if (number==1){
            System.out.println("Not Primary");
        }else{
            for (int i = number-1; i>1; i--){
                if (number % i==0){
                    System.out.println("Not Primary");
                    return;
                }
            }
            System.out.println("Primary");
        }
    }
}
