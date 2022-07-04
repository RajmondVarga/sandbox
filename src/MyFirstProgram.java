package src;

public class MyFirstProgram {
    void run() {
        String text1 = "3";
        String text2 = "4";
        print( text1 + " .. " + text2 );

        int a = 3;
        int b = 4;
        print( a + b );
        print( a * b );
    }


    /**
     * Driver
     */
    public static void main(String[] args) {
        new MyFirstProgram().run();
    }

    static void print() {
        System.out.println();
    }

    static void print(String string) {
        System.out.println(string);
    }

    void print(int i) {
        System.out.println(i);
    }

    void print(long i) {
        System.out.println(i);
    }

}
