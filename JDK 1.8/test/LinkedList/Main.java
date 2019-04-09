package LinkedList;

import java.util.Iterator;

public class Main{
 
    public static void main(String[] args) {

        

        LinkedList<String> list = new LinkedList<String>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        list.addFirst("pre");
        list.addLast("last");

        Iterator<String> it =   list.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+"---");
            //pre---one---two---three---four---last---
        }
    }
}