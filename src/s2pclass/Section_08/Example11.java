package s2pclass.Section_08;

public class Example11 {
    public static void main(String[] args) {
        int x=0b1000;
        int y=0b000101;
        int z;

        z=x & y;
        System.out.println(z);

        z=x | y;
        System.out.println(z);

        z= x^y;
        System.out.println(z);

        x=0b101;
        System.out.println(x);
    }
}
