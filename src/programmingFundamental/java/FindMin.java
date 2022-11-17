package programmingFundamental.java;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Numbers : ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (x<=y){
            if (x<=z){
                System.out.println(x);
            }else {
                System.out.println(z);
            }
        }else if(y<=z){
            System.out.println(y);
        }else {
            System.out.println(z);
        }
    }
}
