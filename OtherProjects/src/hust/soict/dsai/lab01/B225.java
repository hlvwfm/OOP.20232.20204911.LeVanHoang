package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class B225{
    public static void main(String[] args){
        String strNum1, strNum2;
        double SUM,DIF,PRODUCT,QUOTIENT;
        strNum1 = JOptionPane.showInputDialog(null," Please input the first number:", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input rhe second number:", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double Num1 = Double.parseDouble(strNum1);
        double Num2 = Double.parseDouble(strNum2);
        SUM = Num1 + Num2;
        DIF = Num1 - Num2;
        PRODUCT = Num1*Num2;
        QUOTIENT = Num1/Num2;
        JOptionPane.showMessageDialog(null, "the sum is: \n" + SUM,"sum", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"the differnce is: \n" + DIF,"diffenrce" , JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"the product is:\n" + PRODUCT,"product" , JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"the quotient is:\n" + QUOTIENT ,"qoutient", JOptionPane.INFORMATION_MESSAGE);
    
    }
}