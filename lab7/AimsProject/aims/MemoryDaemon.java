package aims;
import java.lang.Runtime;
public class MemoryDaemon implements java.lang.Runnable{
    long memoryUsed = 0;
    public void run(){
        Runtime rt = Runtime.getRuntime();
        long used;

        while(true){
            used = rt.totalMemory() - rt.freeMemory();
            if(used != memoryUsed){
                System.out.println("\tMemor used = " + used);
                memoryUsed = used;
            }
        }
    }
}
