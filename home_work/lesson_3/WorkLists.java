package Java_project.home_work.lesson_3;
import java.util.ArrayList;



// Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class WorkLists {
  public static void main(String[] args) {
          
    Integer [] Array = {12,3,45,16,5,7,6}; 

    ArrayList<Integer> list = new ArrayList<Integer>();
        
    initialArrList(list, Array);  
    System.out.println(list);     
    removeEvenNumbers(list); 
    minMaxNumber(list);
    
    }
    //Метод инициализации списка значениями
    public static ArrayList<Integer> initialArrList(ArrayList<Integer> list, Integer [] Array) {
         
         for (int i = 0; i < Array.length; i++) {
              list.add(Array[i]);                                  
         }
         return list;
    }
    // Метод проверки чисел на четность и удаления
    public static void removeEvenNumbers(ArrayList<Integer> list) {
        list.removeIf(num -> num % 2 == 0);
        System.out.println(list);              
    }
    // Метод нахождения MIN и MAX чисел
    public static void minMaxNumber(ArrayList<Integer> list) {
         int min = list.get(0);
         int max = list.get(0);
         for (Integer i: list) {
              if(i < min) min = i;
                     
              if(i > max) max = i;
         }
         System.out.println("Минимальное число: " + min);
         System.out.println("Максимальное число: " + max);
    }
}
