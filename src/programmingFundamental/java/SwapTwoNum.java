package programmingFundamental.java;

public class SwapTwoNum {

    public static void main(String[] args) {

        // using 3rd variable
        {
            int x = 10;
            int y = 20;

            System.out.println("x  = "+x);
            System.out.println("y  = "+y);

            int temp = x;
            x=y;
            y=temp;

            System.out.println("number swap using 3rd");

            System.out.println("x  = "+x);
            System.out.println("y  = "+y);
        }
        System.out.println();
        // without using 3rd variable
        {
            int x  = 10;
            int y  = 20;

            System.out.println("x  = "+x);
            System.out.println("y  = "+y);

            x = x+y;
            y = x-y;
            x = x-y;

            System.out.println("number swap without 3rd");

            System.out.println("x  = "+x);
            System.out.println("y  = "+y);
        }

    }
}
