package garbage;

public class GarbageCreator {
    public static void main(String [] args){
        try{
            //Liên tục tạo ra các Garbage mới cho tới khi nào hết bộ nhớ thì bắn ra lỗi Out of memory
            for(;;){
                new Garbage();
            }
        }catch(OutOfMemoryError e){
            System.out.println("Out of memory");
        }
    }
}
class Garbage{
    int a = 6;
}