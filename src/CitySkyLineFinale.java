package src;

import java.util.List;

public class CitySkyLineFinale {
    List<Integer> data = List.of(5, 6, 1, 3, 4, 2, 5);
    char block = '\u2588';
    char space = ' ';

    void generateSkyLine() {
        int aktuell = maxNumber();
        String row = "";

        while (aktuell > 0) {
            for (Integer i : data) {
                if (i < aktuell) {
                    row += space;
                } else {
                    row += block;
                }
            }
            printRow(row);
            row = "";
            aktuell--;
        }
    }

    int maxNumber() {
        int max = 0;
        for (Integer i : data) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    void printRow(String row) {
        System.out.println(row);
    }

    void line() {
        System.out.println();
    }

    public static void main(String[] args) {
        CitySkyLineFinale skyLine = new CitySkyLineFinale();
        skyLine.line();
        skyLine.generateSkyLine();
    }
}
