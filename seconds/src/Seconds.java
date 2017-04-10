import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seconds {
  public static void main(String[] args) {
    List<Integer> example = Arrays.asList(1, 2, 3, 4, 5);
    System.out.println(returnSecond(example));
  }

  public static List<Integer> returnSecond(List<Integer> numbers) {
    List<Integer> toReturn = new ArrayList<>();
    for(Integer i : numbers) {
      if(numbers.indexOf(i) % 2 == 1) {
        toReturn.add(i);
      }
    }
    return toReturn;
  }
}