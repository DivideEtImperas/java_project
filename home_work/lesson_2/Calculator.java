package Java_project.home_work.lesson_2;
/*
 *  К калькулятору из предыдущего дз добавить логирование.
 */
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Calculator {
  public static Scanner iScanner = new Scanner(System.in);
  public static Logger log = Logger.getLogger(Calculator.class.getName());
  
  
  public static void main(String[] args) throws IOException{
    
    FileHandler fh;
    try{
      fh = new FileHandler("X:\\Programming\\Java_project\\home_work\\lesson_2\\Calculator.java\\loger.txt");
      log.addHandler(fh);
      SimpleFormatter formatter = new SimpleFormatter();
      fh.setFormatter(formatter);
    } catch (SecurityException e){
      e.printStackTrace();

    }catch(IOException e){
      e.printStackTrace();
    }
   
    
    while(true){
    int a = 0;
    int b = 0;
    char c = ' ';
    enterNumber();
    a = iScanner.nextInt();
    System.out.print("Введите оператор (+,-,*,/): ");
    fillOperator(c, a, b);
    c = iScanner.next().charAt(0);
    if ( c =='q') break;
    enterNumber();
    b = iScanner.nextInt();
    
    fillOperator(c, a, b); 
    }
    }

static void addition(int a, int b) {
  int res = (int)Math.round(a+b);
  System.out.println(a + " + " + b + " = " + res);  
  log.info("Result: " + res);  
}
static void subtraction(int a, int b) {
  int res = (int)Math.round(a-b);
  System.out.println(a + " - " + b + " = " + res); 
  log.info("Result: " + res);
}
static void multiplication(int a, int b) {
  int res = (int)Math.round(a*b);
  System.out.println(a + " * " + b + " = " + res);    
  log.info("Result: " + a + " * " + b + " = " + res);
}
static void division(int a, int b) {
  double res = a / b;
  System.out.println(a + " : " + b + " = " + res);   
  log.info("Result: " +  res); 
}
 public static void enterNumber() {
     System.out.print("Введите число: " );
     
     
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
