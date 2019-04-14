


public class Main{
 
    public static void main(String[] args) {

       
        Thread t1 = new Thread(new Runnable(){
        
    
       
            ThreadLocal<Integer>  t = new ThreadLocal<>();
        

            @Override
            public void run() {
                t.set(1);
             System.out.println( t.get());
                
            }
        });
        t1.start();


    }
}