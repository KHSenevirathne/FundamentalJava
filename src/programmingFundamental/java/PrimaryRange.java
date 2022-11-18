package programmingFundamental.java;

import java.util.Scanner;

public class PrimaryRange {
    public static void main(String[] args) {
        getInput();

    }

    public static void getInput(){
        Scanner input = new Scanner(System.in);

        System.out.println("Get Primary Numbers");
        System.out.println();
        System.out.print("Enter the Start Point : ");
        int start = input.nextInt();
        System.out.print("Enter the End Point : ");
        int end = input.nextInt();

        if (start>end){
            System.out.println("Invalid Input please reEnter..!");
            getInput();
        }else{
            genNum(start,end);

        }
    }

    public static void genNum(int start, int end){

        for (int i = start; i<=end; i++){
            if(i>1){
                chekPrimary(i);
            }
        }
    }

    public static void chekPrimary(int num){
        int temp = 0;
        for (int i = num-1; i>1; i--){
            if (num%i==0){
                //not primary
                temp++;
            }
        }
        if (temp == 0 ){
            System.out.println(num);
        }
    }
}
