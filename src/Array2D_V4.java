package src;


import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Array2D_V4 {

  void v4Stuff(int rows, int cols) {
    int[][] A = new int[rows][cols];
    int min1 = Integer.MAX_VALUE;
    int min2 = Integer.MAX_VALUE;
    int[] P = new int[4];

    for(int r = 0; r < rows; r++) {
      for(int c = 0; c < cols; c++) {
        int N = randomNumber();
        A[r][c] = N;
        if(N <= min1) {
          min2 = min1;
          min1 = N;

          P[2] = P[0];
          P[3] = P[1];

          P[0] = r;
          P[1] = c;
        }
      }
    }

    for( int[] row : A){
      System.out.println(Arrays.toString(row));
    }
    System.out.println( "Die beiden kleinsten Zahlen sind: " + min1 + "," + min2 );
    System.out.println( "Sie sind auf der Position: " + P[0] + ":" + P[1] + " - " + P[2] + ":" + P[3]);

    int distance = abs(P[2] - P[0]) + abs(P[3] - P[1]);
    System.out.println( "Sie sind " + distance + " Pixel voneinander entfernt.");
  }

  int abs(int N) {
    return N < 0 ? -N : N;
  }

  int randomNumber() {
    return ThreadLocalRandom.current().nextInt(0, 100);
  }

  public static void main(String[] args) {
    Array2D_V4 v4 = new Array2D_V4();
    v4.v4Stuff(9, 9);
  }
}
