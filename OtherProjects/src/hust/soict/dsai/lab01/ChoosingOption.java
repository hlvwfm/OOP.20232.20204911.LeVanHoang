package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class ChoosingOption{
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null, "Do u want to change to the first class ticket?");

        JOptionPane.showMessageDialog(null, "you've chosen: " + (option == JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}