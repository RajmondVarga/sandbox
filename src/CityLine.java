package src;

import java.util.List;

public class CityLine {
  List<Integer> list = List.of(2, 3, 1, 4, 1);
  char space = ' ';
  char roof = '_';
  char window = '°';
  char wall = '|';
  int aktuell;
  int number;
  int next;

  void generateSkyLine() {
    aktuell = maxNumber() + 1;
    String row = "";
    while(aktuell > 0) {
      for(int index = 0; index < list.size(); index++) {
        number = list.get(index);
        next = index + 1 < list.size() ? list.get(index + 1) : 0;

        // 1. First Wall
        if(index == 0) {
          if(aktuell > number) {
            row += space;
          } else {
            row += wall;
          }
        }

        // 2. Buildings
        if(aktuell > number + 1) {
          row += space;
        } else if(aktuell == number + 1) {
          row += roof;
        } else {
          row += window;
        }

        // 3. Walls
        if(up() || down()) {
          row += wall;
        } else {
          row += space;
        }

      }
      print(row);
      row = "";
      aktuell--;
    }
  }

  boolean up() {
    return aktuell > number && aktuell <= next;
  }

  boolean down() {
    return aktuell <= number && aktuell > next;
  }

  void print(String row) {
    System.out.println(row);
  }

  int maxNumber() {
    int max = 0;
    for(int i : list) {
      if(i > max) {
        max = i;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    CityLine skyLine = new CityLine();
    skyLine.generateSkyLine();
  }
}

