package hust.soict.dsai.lab01;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class B226{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("what equation do u want to solve?");
        System.out.println("1 for fisrt-degree \n2 for system of first-degree \n3 for second-degree ");
        int Num = keyboard.nextInt();
        switch(Num){
            case 1:
                System.out.print("A = ");
                Double A = keyboard.nextDouble();
                System.out.print("B = ");
                Double B = keyboard.nextDouble();
                if( A != 0){
                    double kq = -B/A;
                    System.out.println("x = " + kq);
                }
                else 
                    System.out.println("None");
                break;
            case 2:
                System.out.print("a1 = ");
                Double a1 = keyboard.nextDouble();
                System.out.print("a2 = ");
                Double a2 = keyboard.nextDouble();
                System.out.print("a3 = ");
                Double a3 = keyboard.nextDouble();
                System.out.print("b1 = ");
                Double b1 = keyboard.nextDouble();
                System.out.print("b2 = ");
                Double b2 = keyboard.nextDouble();
                System.out.print("b3 = ");
                Double b3 = keyboard.nextDouble();
                Double d1 = a1*b2 - a2*b1;
                Double d2 = a3*b2 - b3*b1;
                Double d3 = a1*b3 - a2*a3;
                if(d1 == d2 && d3 == d1 && d1 == 0 ){
                    System.out.println("infinte");
                }
                else if(d1 == 0 && (d2 != 0 || d3 !=0) ){
                    System.out.println("NONE");
                }
                else{
                    Double x1 = d2/d1;
                    Double x2 = d3/d1;
                    System.out.println("first solution" + x1);
                    System.out.println("second solution" + x2);
                }
                break;
            case 3:
                System.out.print("a");
                Double a = keyboard.nextDouble();
                System.out.print("b");
                Double b = keyboard.nextDouble();
                System.out.print("c");
                Double c = keyboard.nextDouble();
                double d = b*b - 4.0*a*c;
                if (d> 0.0) {  
                    double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
                    double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
                    System.out.println("The roots are " + r1 + " and " + r2);  
                }   
                else if (d == 0.0)   {  
                    double r1 = -b / (2.0 * a);  
                    System.out.println("The root is " + r1);  
                }   
                else{  
                    System.out.println("Roots are not real."); 
                } 
                break;

        }
    }
}