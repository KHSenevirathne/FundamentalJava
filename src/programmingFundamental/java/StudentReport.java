package programmingFundamental.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StudentReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Enter your stream");
        System.out.print("(1- maths, 2- bio) : ");
        int stream = input.nextInt();

        System.out.println("Enter your marks below");
        System.out.print("Chemistry : ");
        double chem = input.nextDouble();
        System.out.print("Physics : ");
        double phy = input.nextDouble();
        System.out.print(stream(stream));
        double strm = input.nextDouble();


        //report generate

        System.out.println("-------------------------");
        System.out.println("Student name : "+name);
        System.out.println("Stream : "+stream(stream));
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Chemistry : "+grade(chem));
        System.out.println("Physics : "+grade(phy));
        System.out.println(stream(stream)+grade(strm));
        System.out.println("-------------------------");
        DecimalFormat format = new DecimalFormat("##.0");
        System.out.println("Average : "+format.format(average(chem,phy,strm)));
        System.out.println("Result : "+result(grade(chem),grade(phy),grade(strm)));

    }

    public static String stream(int stream){
        if (stream == 1){
            return "Maths : ";
        }
        if (stream == 2){
            return "Bio : ";
        }else {
            return "Unknown : ";
        }
    }

    public static String grade(double marks){
        if (marks>=75){
            return "A";
        }
        if (marks>=65){
            return "B";
        }
        if (marks>=50){
            return "C";
        }
        if (marks>=35){
            return "S";
        }else {
            return "F";
        }

    }

    public static double average(double chem, double phy, double strm){
        return (chem+phy+strm)/3;
    }

    public static String result(String chem, String phy, String strm){
        if(chem.equals("F")|phy.equals("F")|strm.equals("F")){
            return "Fail";
        }else {
            return "Pass";
        }
    }
}
