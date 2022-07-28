package src;

import java.util.List;

public class CitySkyLine {
    List<Integer> data = List.of( 8, 7, 3, 4);
    char block = '\u2588';
    char space = ' ';

    void generateSkyLine(){
        int aktuell = maxNumber();
        String row = "";

        while( aktuell > 0){
            for( Integer i : data){
                if(i < aktuell){
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

    int maxNumber(){
        int max = 0;
        for( Integer i : data){

            if( i > max){
                max = i;
            }
        }
        return max;
    }
    void printRow(String row){
        System.out.println(row);
    }

    void line(){
        System.out.println();
    }
    public static void main(String[] args) {
        CitySkyLine skyLine = new CitySkyLine();
        skyLine.line();
        skyLine.generateSkyLine();
    }
}
