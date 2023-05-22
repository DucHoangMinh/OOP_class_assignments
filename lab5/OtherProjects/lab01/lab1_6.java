package lab01;

import javax.swing.JOptionPane;
public class lab1_6 {
    //Ham giai phuong trinh bac nhat mot an
    public static String one_var_linear_equa(double a,double b,double c){
        //The first degree equation (linear equation) with one variable
        double result = -b / a;
        return ("Nghiem cua phuong trinh la : " + result);
    }
    //Ham giai phuong trinh bac nhat hai an
    public static String two_var_linear_equa(double a1,double b1,double c1,
        double a2,double b2,double c2){
        //The first degree equation (linear equation) with one variable
        String results;
        double d = a1*b2 - a2*b1;
        double dx = c1*b2 - c2*b1;
        double dy = a1*c2 - a2*c1;
        if(d == 0){
            if(dx == dy && dx == 0){
                results = "Phuong trinh vo so nghiem !!!";
            }
            else {
                results = "Phuong trinh vo nghiem !!!";
            }
        }
        else{
            double x = dx/d;
            double y = dy/d;
            results = "Nghiem cua phuong trinh la : \nx = " + x 
                + "\ny = " + y;
        }
        return results;
    }
    //Ham giai phuong trinh bac hai
    public static String second_degree_equation(double a,double b,double c){
        String result = "";
        if (a == 0) {
            if (b == 0) {
                result = "Phuong trinh vo nghiem!!!";
            } 
            else {
                result = "Phuong trinh co mot nghiem: "
                + "x = " + (-c / b);
            }
        }
        else{
            double delta = b*b - 4*a*c;
            double x1;
            double x2;
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                result = "Phuong trinh co hai nghiem la: "
                + "x1 = " + x1 + " và x2 = " + x2;
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                result = "Phuong trinh co nghiem kep: "
                + "x1 = x2 = " + x1;
            } else {
                result = "Phuong trinh vo nghiem";
            }
        }
        return result;
    }
    public static void main(String [] args){
        Object[] options = {"Phuong trinh bac nhat 1 an",
            "Phuong trinh bac nhat hai an",
            "Phuong trinh bac hai"};
            int option = JOptionPane.showOptionDialog(null,
            "Chon dang phuong trinh ma ban muon giai: ",
            "Chon mot phuong an",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);//Hien thi option lua chon phuong trinh de giai
            if(option == 0){
                int tmp = JOptionPane.showConfirmDialog(null, "Ban muon giai phuong trinh ax + b = c?");
                if(tmp == 0){
                    double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap vao a : "));
                    double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap vao b : "));
                    double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap vao c : "));
                    JOptionPane.showMessageDialog(null,one_var_linear_equa(a, b, c));
                }
            }
            else if(option == 1){
                int tmp = JOptionPane.showConfirmDialog(null, "Ban muon giai he phuong trinh \na1x + b1y = c1\na2x + b2y = c2?");
                if(tmp == 0){
                    double a1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap vao a1 : "));
                    double b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap vao b1 : "));
                    double c1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap vao c1 : "));
                    double a2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap vao a2 : "));
                    double b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap vao b2 : "));
                    double c2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap vao c2 : "));
                    JOptionPane.showMessageDialog(null,two_var_linear_equa(a1, b1, c1,a2,b2,c2));
                }
            }
            else if(option == 2){
                int tmp = JOptionPane.showConfirmDialog(null, "Ban muon giai phuong trinh ax^2 + bx = c?");
                if(tmp == 0){
                    double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap vao a : "));
                    double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap vao b : "));
                    double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap vao c : "));
                    JOptionPane.showMessageDialog(null,second_degree_equation(a, b, c));
                }
            }
    }
}
