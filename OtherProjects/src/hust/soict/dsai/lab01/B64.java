package hust.soict.dsai.lab01;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class B64{
    public static void main(String[] args){
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter month number from 1 to 12");
        month = sc.nextInt();
        if(month == 1|| month == 3|| month == 5|| month == 7|| month == 8|| month == 10||month==12)
            System.out.println("31 days in this month");
        else if(month == 4|| month == 6|| month == 9|| month == 11)
            System.out.println("30 days in this month");
        else{
            int year;
            System.out.println("Please enter year number");
            year = sc.nextInt();
            if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
                System.out.println("29 days in this month");
            }
            else
                System.out.println("28 days in this month");
        }
    }
}