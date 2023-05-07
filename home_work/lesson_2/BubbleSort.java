package Java_project.home_work.lesson_2;
/*
 *  Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */


 import java.io.IOException;
 import java.util.Arrays;
 import java.util.Random;
 
 import java.util.logging.FileHandler;
 
 import java.util.logging.Logger;
 import java.util.logging.SimpleFormatter;
public class BubbleSort {
  public static void main(String[] args) throws IOException {
    System.out.println("Bubble sort: ");
    print(bubbleSort(ArrayRandom()));
    
  }
     public static int[] ArrayRandom()throws IOException {
      Random rnd = new  Random();
      int[]array = new int[10];
      for (int i = 0; i < array.length; i++) {
        array[i] = rnd.nextInt(20);
        System.out.print(array[i] + " "); 
      }
      System.out.println("");
      return array;
      
     }
     public static int[] bubbleSort (int[] array) throws IOException {
          Logger logger = Logger.getLogger(BubbleSort.class.getName());
          FileHandler fHandler = new FileHandler("X:\\Programming\\home_work_java\\file.txt");
          SimpleFormatter sFormatter = new SimpleFormatter();
          fHandler.setFormatter(sFormatter);
          logger.addHandler(fHandler);

          for (int i = array.length - 1; i >=0 ; i--) {
              for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] < array[j+1] ) {
                      int chengeNumber = array[j];
                      array[j] = array[j + 1];
                      array[j + 1] = chengeNumber; 
                }
                
              }
             logger.info(Arrays.toString(array));
            
          }
          return array;
      
     }
            

      public static void print(int[]array) {
        for (int i = 0; i < array.length; i++) {
          System.out.print(array[i] + " ");
          
        }
        
      }
}
