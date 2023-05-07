package Java_project.home_work.lesson_1;
/*
 *  Калькулятор
 */
import java.util.Scanner;

public class Calculator {
  public static Scanner iScanner = new Scanner(System.in);
  public static void main(String[] args) {

    // String reset = iScanner.nextLine();
    
    while(true){
    int a = 0;
    int b = 0;
    char c = ' ';
    enterNumber();
    a = iScanner.nextInt();
    System.out.print("Введите оператор (+,-,*,/): ");
    fillOperator(c, a, b);
    c = iScanner.next().charAt(0);
    enterNumber();
    b = iScanner.nextInt();
    fillOperator(c, a, b);

    // if (reset == "stop") {
    //   break;
      
    // }
    }
    }

static void addition(int a, int b) {
  int res = (int)Math.round(a+b);
  System.out.println(a + " + " + b + " = " + res);    
}
static void subtraction(int a, int b) {
  int res = (int)Math.round(a-b);
  System.out.println(a + " - " + b + " = " + res); 
}
static void multiplication(int a, int b) {
  int res = (int)Math.round(a*b);
  System.out.println(a + " * " + b + " = " + res);    
}
static void division(int a, int b) {
  double res = a / b;
  System.out.println(a + " : " + b + " = " + res);    
}
 public static void enterNumber() {
     System.out.printf("Введите число: " );
     
 }
static void fillOperator(char c, int a, int b) {
  
  switch (c) {
    case '+':
      addition(a,b);
      break;
    case '-':
      subtraction(a, b);
      break;
    case '*':
      multiplication(a, b);
      break;
    case '/':
      division(a, b);
      break;
      
      
      }
}
}
