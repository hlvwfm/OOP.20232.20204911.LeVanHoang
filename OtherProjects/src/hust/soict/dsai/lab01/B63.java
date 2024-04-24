package hust.soict.dsai.lab01;
import java.util.Scanner;
public class B63{
    public static void main(String agrs[]){
        Scanner key = new Scanner(System.in);
        System.out.print("n = ");
        int N = key.nextInt();
        for(int i = 0; i < N; i++ ){
            for( int j = 0; j < 2*N; j++){
                if( j >= N - i  && j <= N + i  )
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}