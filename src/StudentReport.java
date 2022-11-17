import dto.Mark;
import dto.Student;

import java.util.Scanner;

public class StudentReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        Student s1 = new Student();
        Mark m1 = new Mark();
        System.out.print("Enter your name : ");
        s1.setName(input.nextLine());
        System.out.print("Where are you from : ");
        s1.setAddress(input.nextLine());
        System.out.print("How old are you : ");
        s1.setAge(input.nextInt());


        System.out.print("Enter your Chemistry Marks : ");
        m1.setChem(input.nextInt());
        System.out.print("Enter your Physics Marks : ");
        m1.setPhy(input.nextInt());
        System.out.print("Enter your Mathematics Marks : ");
        m1.setMath(input.nextInt());

        System.out.println("hi, "+s1.getName()+",\nYou are born in "+(2022-s1.getAge())+". in "+s1.getAddress()+".");
        System.out.println("Chemistry : "+m1.getChem());
        System.out.println("Physics : "+m1.getPhy());
        System.out.println("Mathematics : "+m1.getMath());

    }
}

