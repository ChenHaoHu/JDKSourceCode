package Integer;

import java.util.concurrent.locks.ReentrantLock;

public class Main{  
 
    public static void main(String[] args) {
        Integer i = new Integer(100);
        System.out.println(i);
        System.out.println(i.SIZE);  //32 
        System.out.println(i.toString());
        System.out.println(Integer.toUnsignedString(1000,20));
        System.out.println(Integer.toHexString(1000));
        System.out.println(Integer.toHexString(-1000));
        System.out.println(Integer.toString(1000,16));
        System.out.println(i.hashCode());  //重点
        System.out.println(Integer.decode("02132312")); //解码 自行

        

    }
}