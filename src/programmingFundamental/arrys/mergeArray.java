package programmingFundamental.arrys;

import java.util.Arrays;

public class mergeArray {
    public static void main(String[] args) {
        int [] x = {23,45,22,11,67};
        int [] y = {56,89,39,49,90};

        int [] merge = new int[x.length+y.length];

        for (int i = 0; i<x.length; i++){
            merge[i] = x[i];
        }
        int temp = 0;
        for (int i = x.length; i<merge.length; i++){
            merge[i]=y[temp];
            temp++;
        }

        System.out.println(Arrays.toString(merge));
    }
}
