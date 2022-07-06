package src;

public class Aufgabe {
    public static void main(String[] args) {
        zwei();
        zwei();
        zwei();
        summe();
    }

    static void summe() {
        int a = 3;
        int b = 8;
        int c = 9;

        print(a + b + c);
    }

    static void zwei(){
        int a = 3;
        int k = 12;
        print(a + k);
    }

    static void print( int n) {
        System.out.println(n);
    }
}
