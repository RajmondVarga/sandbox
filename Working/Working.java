package Working;

import java.util.ArrayList;
import java.util.List;

public class Working {
  public static void main(String[] args) {
    Working stress = new Working();
    stress.div(1, 100);
    stress.div(100, 200);
  }

  private void div(int von, int bis) {
    int n = von;
    List<Integer> list = new ArrayList<>();
    while(n++ <= bis) {
      if(isDivisible(n)) {
        list.add(n);
      }
    }
    print(list);
  }

  private boolean isDivisible(int number) {
    int dreiD = number / 3;
    int fünfD = number / 5;
    int dreiR = dreiD * 3;
    int fünfR = fünfD * 5;

    if(dreiR == number && fünfR == number) {
      return true;
    }
    return false;
  }

  private void print(List<Integer> list) {
    System.out.println(list);
  }

}
