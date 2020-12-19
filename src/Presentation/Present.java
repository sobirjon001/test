package Presentation;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Present {



  public static void main(String[] args) {
    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    int[] numsArr = {1, 2, 3, 4, 5, 6};

    List<Integer> list = Arrays.stream(numsArr).boxed().collect(Collectors.toList());

    System.out.println(list.toString());


  }
}
