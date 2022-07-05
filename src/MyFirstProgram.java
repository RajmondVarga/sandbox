package src;

public class MyFirstProgram {

    static void run() {
        String text1 = "8";
        String text2 = "hallo";
        print( text1 + " .. " + text2 );

        int a = 3;
        int b = 4;
        print( a + b );
        print( a * b );
    }

    public static void main(String[] args) {
        run();
    }

    public static void print( int a){
        System.out.println(a);
    }

    public static void print (String s){
        System.out.println(s);
    }


}
