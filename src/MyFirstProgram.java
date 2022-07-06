package src;

public class MyFirstProgram {

    static void robota() {
        String text1 = "3";
        String text2 = "4";
        print( text1 + " .. " + text2 );

        int a = 3;
        int b = 4;
        print( a + b );
        print( a * b );

        print();
    }

    public static void main(String[] args) {
        robota();
    }

    static void print( int i ) {
        System.out.println(i);
    }

    static void print( String text ) {
        System.out.println(text);
    }

    static void print() {
        System.out.println();
    }


}

