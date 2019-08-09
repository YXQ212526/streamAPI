
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class DemoTwo {

  //利用List<Score>,求平均分，自行构建一个pojo
  public static void main(String[] args) {
    List<Score> list = Arrays.asList(
        new Score("amy", 70),
        new Score("bat", 50),
        new Score("celina", 60),
        new Score("dom", 66),
        new Score("fake", 82)
    );
    Double avg = list.stream().collect(Collectors.averagingInt(s -> s.score));
    System.out.println(avg);
  }

}

class Score {

  public String name;
  public int score;

  public Score(String name, int score) {
    this.name = name;
    this.score = score;
  }
}