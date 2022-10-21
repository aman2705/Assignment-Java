package Assignment_5_question_2;

import java.util.*;
public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Cricket Format :");
        System.out.println("1.ODI");
        System.out.println("2.T20");
        System.out.println("3.Test");
        int ch = in.nextInt();
        switch (ch){
            case 1 :
                odi oObj = new odi();
                System.out.println("Enter the Current Score");
                oObj.setCurrentScore(in.nextInt());
                System.out.println("Enter the Current Over");
                oObj.setCurrentOver(in.nextFloat());
                System.out.println("Enter the target");
                oObj.setTarget(in.nextInt());
                oObj.display();
                break;
            case 2 :
                t20 tObj = new t20();
                System.out.println("Enter the Current Score");
                tObj.setCurrentScore(in.nextInt());
                System.out.println("Enter the Current Over");
                tObj.setCurrentOver(in.nextFloat());
                System.out.println("Enter the target");
                tObj.setTarget(in.nextInt());
                tObj.display();
                break;
            case 3 :
                test teObj = new test();
                System.out.println("Enter the Current Score");
                teObj.setCurrentScore(in.nextInt());
                System.out.println("Enter the Current Over");
                teObj.setCurrentOver(in.nextFloat());
                System.out.println("Enter the target");
                teObj.setTarget(in.nextInt());
                teObj.display();
                break;
            default :
                System.out.println("Invalid Format type");
                break;
        }
    }
}
