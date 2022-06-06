import java.io.IOException;
import java.io.FileWriter;
import java.util.*;

class Series<T>{
    Object objs[];
    int size;
    public Series(int size) {
    this.size = size;
    objs=new Object[size];
    }
    public Object get(int index){
    return objs[index];
    }
    public void set(int index,Object obj){
    objs[index]=obj;
    }
}

class FloatSeries<Float> extends Series<Float> {
    float ob[];

    public FloatSeries(int size){
        super(size);
        ob = new float[size];
    }
    public float getSum(){
        float sum = 0;
        for (int i = 0; i<this.size; i++)
        {
            sum = sum + ob[i];
        }
        return sum;
    }
    public Object get(int index){
        return ob[index];
        }
    public void set(int index,float obj){
        ob[index]=obj;
        }
}


public class OOPJVTH41 {
    public static void main(String[] args) throws Exception {
    //     Series<Integer> s = new Series(2);
    //     s.set(0, 2);
    //     s.set(1, 3);
    // try {
    //     FileWriter myWriter = new FileWriter("output.txt");
    //     myWriter.write((s.get(1))+""+s.get(0));
    //     myWriter.close();
    //     } catch (IOException e) {
    //     e.printStackTrace();
    //     }

        FloatSeries b = new FloatSeries(3);
        b.set(0, 2.4f);
        b.set(1, 3.3f);
        b.set(2,4.5f);
    try {
        FileWriter myWriter = new FileWriter("output.txt");
        myWriter.write(b.getSum()+"");
        myWriter.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    }
}
