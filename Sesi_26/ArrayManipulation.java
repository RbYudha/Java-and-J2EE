package Sesi_26;

public class ArrayManipulation {
    public static void main(String[] args) {
        char[] data1 = { 'a', 'b', 'c', 'd', 'e' };
        System.out.println(data1);

        char[] data2 = new char[3];
        System.out.println(data2);
        System.arraycopy(data1, 1, data2, 0, 3);
        System.out.println(data2);

        char[] data3 = { 'x', 'y', 'z', 'v', 'w' };
        // System.arraycopy(data1, 0, data3, 0, 3);
        System.arraycopy(data1, 0, data3, 2, 3);
        System.out.println(data3);
    }
}
