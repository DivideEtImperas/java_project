package Java_project.seminar;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

/**
 * Lesson_1
 */



public class prog_00 {
  public static void main(String[] args) {
    // String - "", char - '' - отличия типов
    // shift + alt + a - комментарий
    // System.out.println("Hello world!");
    LocalDateTime time = LocalDateTime.now();
    System.out.println(time);
    String encoding = System.getProperty("console.encoding", "cp866");
    Scanner iScanner = new Scanner(System.in, encoding);
    System.out.print("Введите имя: ");
    String name = iScanner.nextLine();
    System.out.println(name);
    iScanner.close();
    System.out.println(goodTime(name));
    maxCount(3);
    
}
public static String goodTime(String name) {
  LocalTime time = LocalTime.now();
  System.out.println(time);
  String res = "";
  // isAfter <time < isBefore
  if (time.isAfter(LocalTime.of(5,0)) && time.isBefore(LocalTime.of(11,59))){
      System.out.println("Доброе утро!");
      res = "Доброе утро!" + name;
  }    
  else if (time.isAfter(LocalTime.of(12,0)) && time.isBefore(LocalTime.of(17,59))){
      System.out.println("Добрый день!");
      res = "Добрый день!" + name;
  }     
  else {
      System.out.println("Добрый вечер! " + name);
      res = "Добрый вечер! " + name;
  }
  return res;
}
/* Дан массив двоичных чисел, например [1,1,0,1,1,1,1], вывести максимальное количество подряд идущих 1.
Найти максимальное количество подряд идущих одинаковых элементов массива. (постараться сделать с одним циклом) */

public static void maxCount(int value) {
  int count = 0;
  int maxCount = 0;
  int[] math1 = fillMath();
  for (int i = 0; i < math1.length; i++) {
      if (math1[i] == value) count++;
      if (count > maxCount) maxCount = count;
      if (math1[i] != value) count = 0;

  }
  System.out.println(maxCount);
  printMath(math1);
}

public static int[] fillMath() {
  int [] math = new int[10];
  Random rand = new Random();
  for (int i = 0; i < 10; i++) {
      math[i] = rand.nextInt(5);
  }
  return math;
}

public static void printMath(int[] math) {
//        for (int i = 0; i < math.length; i++) {
//            System.out.print(math[i] + ", ");
//        }

  for (int i: math) {
      System.out.print(i + ", ");
  }
}
  
}

  
  

