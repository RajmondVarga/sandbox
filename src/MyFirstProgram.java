package src;

public class MyFirstProgram {
    void run() {
        System.out.println( "Ahoj Rajmond!" );

        int a = 3;
        int b = 4;
        System.out.println( a + b );
        System.out.println( a * b );
    }


    /**
     * Driver
     */
    public static void main(String[] args) {
        System.out.println();

        new MyFirstProgram().run();
    }
}
