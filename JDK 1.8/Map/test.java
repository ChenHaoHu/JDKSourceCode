
public class test{
    public static void main(String[] args) {
     
        System.out.println(tableSizeFor(1)); // ---1
        System.out.println(tableSizeFor(2)); // ---2
        System.out.println(tableSizeFor(3)); // ---4
        System.out.println(tableSizeFor(5)); // ---8
        System.out.println(tableSizeFor(6)); // ---8
        System.out.println(tableSizeFor(7)); // ---8
        System.out.println(tableSizeFor(8)); // ---8
        System.out.println(tableSizeFor(9312321)); // ---16

    }

    static  int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= 64) ? 64 : n + 1;
    }
}