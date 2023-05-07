package Java_project.home_work.lesson_4;
//В калькулятор добавьте возможность отменить последнюю операцию.
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Calculator {
  public static Scanner iScanner = new Scanner(System.in);
  public static Logger log = Logger.getLogger(Calculator.class.getName());
  public static void main(String[] args) throws IOException {
    FileHandler fh;
    try{
      fh = new FileHandler("X:\\Programming\\home_work_java\\result2.txt");
      log.addHandler(fh);
      SimpleFormatter formatter = new SimpleFormatter();
      fh.setFormatter(formatter);
    } catch (SecurityException e){
      e.printStackTrace();

    }catch(IOException e){
      e.printStackTrace();
    }
    System.out.println("Калькулятор ожидает ввода:\nвведите \"stop\" для выхода");
      Double a = 0.0;
      Double b = 0.0;
      Object res = 0;
      String op = "";
      
      do{
        String input = iScanner.next();
        if (input.equals("stop")){
          break;
        }
        String[] strings = input.split("\\W");
        String[] operator = input.split("\\w");
        try {
              a = Double.parseDouble(strings[0]);
              b = Double.parseDouble(strings[1]);
              op = operator[operator.length - 1];
              System.out.println("Result = " + operation(a,b,res,op));
              log.info("Result = " + operation(a,b,res,op));
        } catch (Exception e) {
          System.out.println("Ошибка ввода попробуйте еще раз");
        }
      } while (true);
    
       
  }

public static Object addition(Object res, Object a, Object b){
  if (a instanceof Double && b instanceof Double) {
    return (Object)((Double) a + (Double) b);
  } else if (a instanceof Integer && b instanceof Integer){
    return (Object)((Integer) a + (Integer) b);
  } else return 0; 
  }
public static Object subtraction(Object res, Object a, Object b){
if (a instanceof Double && b instanceof Double) {
return (Object)((Double) a - (Double) b);
} else if (a instanceof Integer && b instanceof Integer){
return (Object)((Integer) a - (Integer) b);
} else return 0; 
}
public static Object multiplication(Object res, Object a, Object b){
if (a instanceof Double && b instanceof Double) {
return (Object)((Double) a * (Double) b);
} else if (a instanceof Integer && b instanceof Integer){
return (Object)((Integer) a * (Integer) b);
} else return 0; 
}
public static Object division(Object res, Object a, Object b){
if (a instanceof Double && b instanceof Double) {
return res = (Object)((Double) a / (Double) b);
} else if (a instanceof Integer && b instanceof Integer){
return res = (Object)((Integer) a / (Integer) b);
} else return 0; 
}
public static Object operation(Object a, Object b, Object res, String op) {

switch (op) {
  case "+":
    return addition(res, a, b);
    
  case "-":
    return subtraction(res, a, b);
    
  case "*":
    return multiplication(res, a, b);
    
  case "/":
    return division(res, a, b);
  default:
  return 0;
  
    }
}
}
