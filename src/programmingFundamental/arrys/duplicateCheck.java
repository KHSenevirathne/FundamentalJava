package programmingFundamental.arrys;

import java.util.Scanner;

public class duplicateCheck {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = input.nextLine();
        String [] letters = new String[26];
        int [] count = new int[26];
        int place = 0;
        for(int i = 0; i<name.length(); i++){
            char temp = name.charAt(i);
            String letter = Character.toString(temp);
            checkLet(letter,letters,count,place);
            place++;

        }

        ResPrint(letters,count);


    }

    public static void checkLet(String letter, String [] letters, int [] count, int place){
        int temp = 0;
        for(int i=0; i<letters.length; i++){

            if(letters[i]==null){break;}
            if(letters[i].equals(letter)){

                addCount(i,count);
                temp=1;

            }

        }
        if(temp==0){letters[place] = letter;} else{letters[place]=" ";}
    }

    public static void addCount(int index, int [] count){
        count[index] += 1;

    }

    public static void ResPrint(String [] letters, int [] count){
        for(int i=0; i<letters.length; i++){
            if(letters[i]==null){break;}
            if(!letters[i].equals(" ")){
                System.out.println(letters[i]+" - "+(count[i]+1));}
        }
    }
}
