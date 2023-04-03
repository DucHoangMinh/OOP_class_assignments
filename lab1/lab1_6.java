import javax.swing.JOptionPane;
public class lab1_6 {
    public static String one_var_linear_equa(double a,double b,double c){
        //The first degree equation (linear equation) with one variable
        double result = -b / a;
        return ("Nghiem cua phuong trinh la : " + result);
    }
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
    public static String second_degree_equation(double a,double b,double c){
        String result = "";
        if (a == 0) {
            if (b == 0) {
                result = "Phuong trinh vo nghiem!!!";
            } 
            else {
                result = "Phương trình có một nghiệm: "
                + "x = " + (-c / b);
            }
        }
        double delta = b*b - 4*a*c;
        double x1;
        double x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            result = "Phương trình có 2 nghiệm là: "
            + "x1 = " + x1 + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            result = "Phương trình có nghiệm kép: "
            + "x1 = x2 = " + x1;
        } else {
            result = "Phuong trinh vo nghiem!!!";
        }
        return result;
    }
    public static void main(String [] args){
        
    }
}
