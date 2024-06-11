package Java_8_Features.FunctionalIndterface.BiFUnction;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Demo {
  public static void main(String[] args) {


      BiFunction<Integer, Integer, Integer> r = (i, n) -> (i * n);
      System.out.println(r.apply(3,4));
  }
}
