package Java_project.seminar;

import java.util.Arrays;
import java.util.HashSet;

public class prog_08 {
  public static void main(String[] args) {
    Cat Barsic = new Cat("Barsic", 5);
    Cat Mursic = new Cat("Mursic", 5);
    Cat BarsicTwo = new Cat("Barsic", 5);
    HashSet<Cat> SetCat = new HashSet<Cat>(Arrays.asList(Barsic,Mursic,BarsicTwo));
    System.out.println(SetCat);
    System.out.println(Mursic.equals(Mursic));
    
  }
  
}
class Cat {
  String name;
  Integer age;
  String color;
  Integer weight;
  static Boolean isAggresive;

  void printInfo() {
      System.out.println("Cat name is " + name + " age = " + age + " color = " + color + " weight = " + weight + " isAggresive " + isAggresive);
  }
  Cat(){
      name = "Gray";
      age = 2;
      color = "black";
      weight = 5;
      // isAggresive = false;
  }

  Cat(String name){
      this.name = name;
      this.age = 2;
      this.color = "black";
      this.weight = 5;
      // isAggresive = false;
  }
  Cat(String name, Integer age){
      this.name = name;
      this.age = age;
      this.color = "black";
      this.weight = 5;
      // isAggresive = false;
  }
  // @Override
  // public boolean equals(Object o) {
  //     if (this == o) return true;
  //     if (o == null || getClass() != o.getClass()) return false;
  //     Cat cat = (Cat) o;
  //     return Objects.equals(name, cat.name) && Objects.equals(age, cat.age) && Objects.equals(color, cat.color) && Objects.equals(weight, cat.weight);
  // }

  @Override
  public boolean equals(Object obj) {
      Cat cat = (Cat) obj;
      if(this.name.equals(cat.name) && this.age == cat.age) return true;
      return false;
      

  }
  @Override
    public int hashCode() {
        return name.hashCode() + age + color.hashCode() + weight;
    }
}
