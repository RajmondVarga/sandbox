package src;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Cubes {

  List<Integer> cubes1D(int l1) {
    List<Integer> list = new ArrayList<>();

    while(l1-- > 0) {
      list.add(randomNumber());
    }

    return list;
  }

  List<List<Integer>> cubes2D(int l1, int l2) {
    List<List<Integer>> list = new ArrayList<>();

    while(l2-- > 0) {
      list.add(cubes1D(l1));
    }

    return list;
  }

  List<List<List<Integer>>> cubes3D(int l1, int l2, int l3) {
    List<List<List<Integer>>> list = new ArrayList<>();

    while(l3-- > 0) {
      list.add(cubes2D(l1, l2));
    }

    for(List<List<Integer>> L2 : list) {
      System.out.println(L2);
    }
    line();

    return list;
  }

  List<List<List<List<Integer>>>> cubes4D(int l1, int l2, int l3, int l4) {
    List<List<List<List<Integer>>>> list = new ArrayList<>();

    while(l4-- > 0) {
      list.add(cubes3D(l1, l2, l3));
    }

    return list;
  }

  void cubes5D(int l1, int l2, int l3, int l4, int l5) {
    List<List<List<List<List<Integer>>>>> list = new ArrayList<>();
    while(l5-- > 0) {
      list.add(cubes4D(l1, l2, l3, l4));
    }

    line();
  }

  void line() {
    System.out.println();
  }

  int randomNumber() {
    return ThreadLocalRandom.current().nextInt(0, 9);
  }

  public static void main(String[] args) {
    Cubes listOfLists = new Cubes();
    listOfLists.cubes3D(2, 3, 4);

    // listOfLists.cubes5D(2, 3, 4, 5, 6);
    // listOfLists.cubes5D(3, 4, 5, 6, 7);
    // listOfLists.cubes5D(2, 4, 6, 2, 1);
  }
}