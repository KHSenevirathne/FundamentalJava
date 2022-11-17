package programmingFundamental.java;

import java.util.Scanner;

public class PrimaryRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Range of Primary Numbers");
        System.out.print("Enter Start Point :");
        int start = input.nextInt();
        System.out.print("Enter End Point :");
        int end = input.nextInt();

        for (int i = start; i<=end; i++){

            if (i>1){
                for (int j = i-1; j>1; j--){
                    if (i%j==0){
                        System.out.println(i);
                        break;
                    }
                }
                System.out.println("dd");
            }
        }

    }
}
