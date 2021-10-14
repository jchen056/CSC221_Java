import java.util.*;
import java.util.Scanner;

public class Hailstone {
    public static void main(String args[]) {
      List<Integer> list = new ArrayList<Integer>();
      int n = 3;
      while (n != 1) {
        list.add(n);
        if (n % 2 == 0) {n = n / 2;} 
        else {n = 3 * n + 1;}}
      list.add(n);
      int max = 0;
      for (int x : list) {
        System.out.println(x);
        max = Math.max(x, max);
}

    }
}