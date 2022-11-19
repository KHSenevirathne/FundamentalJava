package programmingFundamental.java;

public class printStar {
    public static void main(String args[]){
        int space = 5;
        int star = 0;
        for(int i = 0; i<5; i++){

            for(int j = space; j>0; j--){
                System.out.print(" ");
            }

            for(int x = 0; x<=star;x++ ){
                System.out.print("* ");
            }
            space--;
            star++;
            System.out.println();
        }

        space = 1;
        star = 3;
        for(int i = 0; i<4; i++){

            for(int j = space; j>0; j--){
                System.out.print(" ");
            }


            for(int x = star; x>=0; x--){
                System.out.print(" *");

            }
            space++;
            star--;
            System.out.println();
        }

    }

}
