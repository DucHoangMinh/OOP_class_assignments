package lab2;
import javax.swing.JOptionPane;
public class lab2_1 {
    public static void main(String [] args){
        int option = JOptionPane.showConfirmDialog(null,
            "Do you want to change to first class ticket?");
            JOptionPane.showMessageDialog(null,"You've chosen: " +(option == JOptionPane.YES_OPTION?"Yes" : "No"));
            System.exit(0);
        }
    }
    // What happens if users choose “Cancel”?
    // How to customize the options to users, e.g. only two options: “Yes” and “No”, OR “I do” and “I don’t” (Suggestion: Use Javadocs or using Eclipse/Netbean IDE help).
    
    //Answer:
    // a.Khi người dùng chọn Cancel,chương trình sẽ tự hiểu như việc người dùng chọn No
    // b.Để customize các tiêu đề các option,ta có thể sử dụng phương thức 
    // showOptionDialog() thay vì dùng showConfirmDialog().Cụ thể,ta dùng showOptionDialog()
    // như sau :
        /* Object [] options = {"I do", "I don't"};
        int option = JOptionPane.showOptionDialog(null,
        "Do you want to change your first ticket class?",
        "Confirm",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[0]); */
    
