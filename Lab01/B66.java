import java.util.Scanner;
public class B66{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows in matrix");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns in matrix");
        int columns = sc.nextInt();
        int matrix1[][] = new int[rows][columns];
        int matrix2[][] = new int[rows][columns];
        System.out.println("enter the elements in first matrix:");
        for(int i = 0;i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix1[i][j] = sc.nextInt();
            }    
        }
        System.out.println("enter the elements in second matrix:");
        for(int i = 0;i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix2[i][j] = sc.nextInt();
            }    
        }
        int resultMatrix[][] = new int[rows][columns];
        for(int i = 0;i < rows; i++){
            for(int j = 0; j < columns; j++){
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }    
        }
        System.out.println("The sum of the two matrices is : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
            }
    }
}