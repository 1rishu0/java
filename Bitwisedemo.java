package bitwisedemo;

public class Bitwisedemo {

    public static void main(String[] args) {
//        int x=10, y=6, z;
//        z=x&y;
//        System.out.println(z);

//          int x=0b1010;
//          int y=0b0110;
//          int z;
//          z=x|y; //x^y
//          System.out.println(z);
//        int x = 0b1000;
//        int y;
//        y = x << 1; //x<<2 //x>>1 //x>>2
//        System.out.println(String.format("%s", Integer.toBinaryString(x)));
//        System.out.println(String.format("%32s", Integer.toBinaryString(y)));
//        System.out.println(y);

            int x=-0b1010; //try with + and -
            int y;
            y=x>>1; //~x
            System.out.println(String.format("%32s",Integer.toBinaryString(x) ));
            System.out.println(String.format("%32s",Integer.toBinaryString(y) ));
            System.out.println(y);
    }

}
