package lab01;

// Write a program to calculate sum, difference, product, and quotient of 2 double 
// numbers which are entered by users.
import javax.swing.JOptionPane;
public class lab1_5 {
    public static void main(String[] args){
        String strNum1 = JOptionPane.showInputDialog(null,
        "Input your first number : ","Input firt number",JOptionPane.INFORMATION_MESSAGE);
        String strNum2 = JOptionPane.showInputDialog(null,
        "Input your second number : ","Input second number",JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;double diff = num1 - num2;
        double prod = num1 * num2;double quot = num1 / num2;
        String ouputValue = "Sum : " + sum + "\nDifference : " + diff
            + "\nProduct : " + prod + "\nQuotient : " + quot;
        JOptionPane.showMessageDialog(null,ouputValue,"Sum, difference, product, and quotient values",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
