import java.util.Arrays;

public class Revision {
    public static void main(String[] args) {

        // print array

        int [] x = new int[10];

        for (int i = 0; i<10; i++){
            x [i] = i+1;
        }

        System.out.println(Arrays.toString(x));
        int y [] = new int[10];
        int index = 0;
        for (int i = 9; i>=0; i--){
            y[index] = x[i];
            index++;
        }

        System.out.println(Arrays.toString(y));


    }
}
