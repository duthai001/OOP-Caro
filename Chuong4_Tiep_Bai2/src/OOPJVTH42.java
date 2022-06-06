import java.io.FileWriter;
import java.io.IOException;

public class OOPJVTH42 {
    public static void main(String[] args) throws Exception {
        try {
            FileWriter myWriter = new FileWriter("output.txt");
            Agent a=new Agent();
            int x=a.running(0, 1,1);
            int y=a.running(1,1,1);
            int z=a.running(1, 0,1);
            myWriter.write(x+" "+y+" "+z);
            myWriter.close();
            } catch (IOException e) {
            e.printStackTrace();
            }
           
    }
}
