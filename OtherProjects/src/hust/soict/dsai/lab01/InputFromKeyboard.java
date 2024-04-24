package hust.soict.dsai.lab01;
import java.util.Scanner;
public class InputFromKeyboard{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name?");
        String strName = keyboard.nextLine();
        System.out.println("how old are u?");
        int age = keyboard.nextInt();
        System.out.println("How tall are u?(m)");
        double dheight = keyboard.nextDouble();
        System.out.println("mrs/ms."+ strName+ ", " + age +" year old." + "Your height is " + dheight +"m." );
    }
}
