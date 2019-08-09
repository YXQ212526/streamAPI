
import java.util.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoOne {

  public static void main(String[] args) {
    //构建一个map<String,Double>,遍历得到大于指定值的key，转化成list,key需要排序

    Map<String, Double> map = new HashMap<>();
    map.put("a", 1.0);
    map.put("x", 2.0);
    map.put("l", 3.0);
    map.put("b", 4.0);
    List<String> stringList = map.keySet().stream().filter(str ->
        str.compareTo("c") > 0
    ).sorted().collect(Collectors.toList());

    stringList.forEach(System.out::println);

  }

}
