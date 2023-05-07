package Java_project.home_work.lesson_1;
/*
 * Факториал n! (произведение чисел от 1 до n)
 */

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int number = iScanner.nextInt();
    System.out.printf(" ", number);
    iScanner.close();
    System.out.println(fillFact(number));
  }

// рекурсивный метод вычисления факториала

  public static int fillFact(int number) {
    if (number  <=2){
      return number; 
    }
    return number * fillFact(number-1);
  }
}
