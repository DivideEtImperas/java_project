package Java_project.seminar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class prog_07 {
  public static void main(String[] args) {
   
      ArrayList<Integer> myList = new ArrayList<Integer>(1000);
      randomList(myList);
      printList(myList);
      HashSet<Integer> myHeshSet = new HashSet<Integer>(myList);
      System.out.println(myHeshSet);

      Double percent = 1.0 * myHeshSet.size() / 10;
      System.out.println(percent + "%");
  }
  public static void randomList(List<Integer> myList) {
    Random rand = new Random();
    
    for (int i = 0; i < 1000; i++) {
      myList.add( rand.nextInt(24));
      
      
    }
    
  }
  public static void printList(List<Integer> myList) {
    
      System.out.println(myList);
    
  }

  
}
