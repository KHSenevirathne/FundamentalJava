package programmingFundamental.arrys;

import javax.swing.*;
import java.util.Arrays;

public class copyArray {
    public static void main(String[] args) {
        int [] x = {23,43,11,67,88,90};
        int [] y = new int[x.length];
//        for (int i=0; i<x.length; i++){
//            y[i]=x[i];
//        }
        int i =0;
        for (int num : x){
            y[i] = num;
            i++;
        }

        System.out.println(Arrays.toString(y));
    }




}
