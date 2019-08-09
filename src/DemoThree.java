import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import java.util.stream.Collectors;

public class DemoThree {

  public static void main(String[] args) {
    //List<Student>排重，如果重复，则取后面一个对象

    Student one = new Student("amy", 20);
    Student two = new Student("bat", 18);
    Student three = new Student("celina", 16);
    List<Student> students = Stream.of(one, two, three, one, two, one).collect(Collectors.toList());

    List<Student> studentList = students.stream().distinct().collect(Collectors.toList());


  }

}

class Student {

  public String name;
  public int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
}