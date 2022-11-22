package programmingFundamental.arrys;

import java.util.Scanner;

public class checkStringDuplication {
    private static int index;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] letters = new String[26]; //store letters
        int[] dupCount = new int[26]; //store duplication count

        //get input
        System.out.print("Enter Sentence : ");
        String sentence = input.nextLine();
        //remove spaces
        sentence = sentence.replaceAll("\\s", "");
        //split letter by letter
        splitLetters(sentence, letters, dupCount);
        //get output
        printResult(letters, dupCount);
    }

    private static void printResult(String[] letters, int[] dupCount) {
        System.out.print("\n* Letter - Count\n\n");
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != null) {
                System.out.println((i + 1) + ")  " + letters[i] + "     -   " + (dupCount[i] + 1));
            }
        }
    }

    private static void splitLetters(String sentence, String[] letters, int[] dupCount) {

        for (int i = 0; i < sentence.length(); i++) {
            char temp = sentence.charAt(i);
            String letter = Character.toString(temp); //convert to string
            //check letter already in system
            checkLetters(letter, letters, dupCount);
        }
    }

    private static void checkLetters(String letter, String[] letters, int[] dupCount) {

        boolean letterDup = false; //for check letter already duplicated?
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != null && letters[i].equals(letter)) {
                addDuplicate(i, dupCount); //already have increment count of duplicate
                letterDup = true;
            }
        }
        if (!letterDup) {
            addLetter(letter, letters); //if letter not duplicated then add to system
        }

    }

    private static void addLetter(String letter, String[] letters) {
        letters[index] = letter;
        index++;
    }

    private static void addDuplicate(int i, int[] dupCount) {
        dupCount[i] += 1;
    }

}
//kaveesh