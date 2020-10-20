/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author midga
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int choice = menu();
        Scanner sc = new Scanner(System.in);
                
        while (choice != 0) {
            switch(choice){
                case 1: 
                    Binary();
                    choice = menu();
                    break;
                case 2: 
                    Denary();
                    choice = menu();
                    break; 
                case 3:
                    Octal();
                    choice = menu();
                    break;
                case 4:
                    BinaryToOctal();
                    choice = menu();
                    break;
            }//end of switch
        }//end of while 
    }//end of main
        
        static int menu(){
        int iChoice;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Select an option \n" +
                          "1.  Convert Binary To Denary \n" +
                          "2.  Convert Denary To Binary \n"+ 
                          "3.  Convert Octal To Binary \n"+
                          "4.  Convert Binary To Octal \n" +
                          "0.  Exit \n");
            
            iChoice = sc.nextInt();
        } while (iChoice < 0 || iChoice > 4); //when the user input is equal to 0, the program will close
        
        return iChoice;//returning menu choice 
    }
        public static void Binary(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter A 8 Digit Binary Number: ");
           int input = in.nextInt();
            int a = input / 10000000 % 10;
            int b = input / 1000000 % 10;
            int c = input / 100000 % 10;
            int d = input / 10000 % 10;
            int e = input / 1000 % 10;
            int f = input / 100 % 10;
            int g = input / 10 % 10;
            int h = input % 10;
            
            int one = (h*1);
            int two = (g*2);
            int three = (f*4);
            int four = (e*8);
            int five = (d*16);
            int six = (c*32);
            int seven = (b*64);
            int eight = (a*128);
            
            int denary = (one+two+three+four+five+six+seven+eight);
            
            System.out.println("Denary Number Is: " + denary);
        }
        public static void Denary(){
        int denary;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please Enter A Denary Number 255 or Below: ");
        
        denary = sc.nextInt();
        
        int qone = (denary/2);
        int rone = (denary%2);
        
        //System.out.println("remainder is: " + rone + " quote is: " + qone);
        
        int qtwo = (qone/2);
        int rtwo = (qone%2);
        
        //System.out.println("remainder is: " + rtwo +  " quote is: " + qtwo);
        
        int qthree = (qtwo/2);
        int rthree = (qtwo%2);
        
        //System.out.println("remainder is: " + rthree + " quote is: " + qthree);
        
        int qfour = (qthree/2);
        int rfour = (qthree%2);
        
        //System.out.println("remainder is: " + rfour + " qoute is: " + qfour);
        
        int qfive = (qfour/2);
        int rfive = (qfour%2);
        
        //System.out.println("remainder is: " + rfive + " quote is: " + qfive);
        
        int qsix = (qfive/2);
        int rsix = (qfive%2);
        
       //System.out.println("remainder is: " + rsix + " quote is: " + qsix);
        
        int qseven = (qsix/2);
        int rseven = (qsix%2);
        
        //System.out.println("remainder is: " + rseven + " quote is: " + qseven);
        
        int qeight = (qseven/2);
        int reight = (qseven%2);
        
        //System.out.println("remainder is: " + reight + " quote is: " + qeight);
        
        System.out.println("Your Binary Number Is: " + reight + rseven + rsix + rfive + rfour + rthree + rtwo + rone);
        }
        public static void Octal(){
            Scanner in = new Scanner(System.in);
        
        System.out.println("Please Enter A 3 Digit Octal Number: ");
        
        int input = in.nextInt();
            int a = input / 100 % 10;
            int b = input / 10 % 10;
            int c = input % 10;
            
        System.out.print("Your Binary Number Is: ");
            
            if (a == 0){
                System.out.print("000");
            } else if (a == 1){
                System.out.print("001");
            } else if (a == 2){
                System.out.print("010");
            } else if (a == 3){
                System.out.print("011");
            } else if (a == 4){
                System.out.print("100");
            } else if (a == 5){
                System.out.print("101");
            } else if (a == 6){
                System.out.print("110");
            } else if (a == 7){
                System.out.print("111");
            } else {
                System.out.print("Invalid Number");
            }
            
            if (b == 0){
                System.out.print("000");
            } else if (b == 1){
                System.out.print("001");
            } else if (b == 2){
                System.out.print("010");
            } else if (b == 3){
                System.out.print("011");
            } else if (b == 4){
                System.out.print("100");
            } else if (b == 5){
                System.out.print("101");
            } else if (b == 6){
                System.out.print("110");
            } else if (b == 7){
                System.out.print("111");
            } else {
                System.out.print("Invalid Number");
            }
            
            if (c == 0){
                System.out.println("000");
            } else if (c == 1){
                System.out.println("001");
            } else if (c == 2){
                System.out.println("010");
            } else if (c == 3){
                System.out.println("011");
            } else if (c == 4){
                System.out.println("100");
            } else if (c == 5){
                System.out.println("101");
            } else if (c == 6){
                System.out.println("110");
            } else if (c == 7){
                System.out.println("111");
            } else {
                System.out.println("Invalid Number");
            }
        
            
        }
        public static void BinaryToOctal(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please Enter A Binary Number As Three Seprate parts with spaces (For Example: 101 111 101) Maximum 9 Digits only: ");
        
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        
        if (first == 000){
                System.out.print("");
            } else if (first == 001){
                System.out.print("1");
            } else if (first == 010){
                System.out.print("2");
            } else if (first == 011){
                System.out.print("3");
            } else if (first == 100){
                System.out.print("4");
            } else if (first == 101){
                System.out.print("5");
            } else if (first == 110){
                System.out.print("6");
            } else if (first == 111){
                System.out.print("7");
            } else {
                System.out.print("Invalid Number");
            }
        
        if (second == 000){
                System.out.print("");
            } else if (second == 001){
                System.out.print("1");
            } else if (second == 010){
                System.out.print("2");
            } else if (second == 011){
                System.out.print("3");
            } else if (second == 100){
                System.out.print("4");
            } else if (second == 101){
                System.out.print("5");
            } else if (second == 110){
                System.out.print("6");
            } else if (second == 111){
                System.out.print("7");
            } else {
                System.out.print("Invalid Number");
            }
        if (third == 000){
                System.out.println("");
            } else if (third == 001){
                System.out.println("1");
            } else if (third == 010){
                System.out.println("2");
            } else if (third == 011){
                System.out.println("3");
            } else if (third == 100){
                System.out.println("4");
            } else if (third == 101){
                System.out.println("5");
            } else if (third == 110){
                System.out.println("6");
            } else if (third == 111){
                System.out.println("7");
            } else {
                System.out.println("Invalid Number");
            }
    }
}
