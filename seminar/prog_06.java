package Java_project.seminar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prog_06 {
  public static void main(String[] args) {
    HashMap<Integer,String> structureHashMap = new HashMap<>();
   fillPeople(structureHashMap);

    
  }
  private static void fillPeople(HashMap<Integer, String> structureHashMap) {
    Scanner iScanner = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
        String name = iScanner.nextLine();
        String[] nameSplit = name.split(" ");//nameSplit[0] -> 3434324, nameSplit[1] -> Ivanov
        structureHashMap.put(Integer.parseInt(nameSplit[0]), nameSplit[1]);
    }
    for (Map.Entry<Integer, String> el : structureHashMap.entrySet()) {
        if (el.getValue().equals("Ivanov")) System.out.println(el.getKey()+ " : " + el.getValue());
    }
    // System.out.println(structureHashMap);
    iScanner.close();

}
  
}
