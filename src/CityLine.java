package src;

import java.util.List;

public class CityLine {

  List<Integer> data = List.of(2, 3, 1, 4, 1, 5, 1, 4, 3, 2, 9, 7, 4, 3, 1, 0, 8, 5, 6, 6);

  char space = ' ';
  char roof = '_';
  char window = '°';
  char wall = '|';

  void generate() {
    int aktuell = maxNumber() + 1;

    while(aktuell > 0) {
      StringBuilder row = new StringBuilder();
      for(int index = 0; index < data.size(); index++) {
        int number = data.get(index);
        int next = nextNumber(index);
        firstWall(row, aktuell, number, index);
        buildings(row, aktuell, number);
        walls(row, aktuell, number, next);
      }
      print(row.toString());
      aktuell--;
    }
  }

  private void firstWall(StringBuilder row, int aktuell, int number, int i) {
    if(i == 0) {
      if(aktuell <= number) {
        row.append(wall);
      } else {
        row.append(space);
      }
    }
  }

  private void buildings(StringBuilder row, int aktuell, int number) {
    if(aktuell == number + 1) {
      row.append(roof);
    } else if(aktuell < number + 1) {
      row.append(window);
    } else {
      row.append(space);
    }
  }

  private void walls(StringBuilder row, int aktuell, int number, int next) {
    if(up(aktuell, number, next) || down(aktuell, number, next)) {
      row.append(wall);
    } else {
      row.append(space);
    }
  }

  private boolean up(int aktuell, int number, int next) {
    return aktuell > number && aktuell <= next;
  }

  private boolean down(int aktuell, int number, int next) {
    return aktuell <= number && aktuell > next;
  }

  int nextNumber(int index) {
    int next = 0;
    if(index < data.size() - 1) {
      next = data.get(index + 1);
    }
    return next;
  }

  void print(String string) {
    System.out.println(string);
  }

  int maxNumber() {
    int max = 0;
    for(int i : data) {
      if(i > max) {
        max = i;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    CityLine cityLine = new CityLine();
    cityLine.generate();
  }
}
