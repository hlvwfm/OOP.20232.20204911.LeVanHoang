package hust.soict.dsai.lab01;
import java.util.Scanner;
public class B65{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array n=");
        n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("");
        System.out.println("enter elements of array");
        int sum = 0;
        for(int i = 0; i<n; i++){
            ar[i]= sc.nextInt();
            sum += ar[i];
        }
        int tempSort;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (ar[i] > ar[j]) {
                    tempSort = ar[i];
                    ar[i] = ar[j];
                    ar[j] = tempSort;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + "\t");
        }
        System.out.println("");
        System.out.println("sum " + sum);
        double average = sum/n;
        System.out.println("average " + average);
}
}