package programmingFundamental.arrys;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] x = {12,67,43,54,22,67,89};

        int [] reverve = new int[x.length];
        int temp = 0;
        for (int i = x.length-1; i>=0; i--){

            reverve[i]=x[temp];
            temp++;
        }

        System.out.println(Arrays.toString(reverve));
    }
}
