package Java_project.seminar;

import java.util.ArrayList;

import java.util.List;

public class prog_01 {
  public static void main(String[] args) {
    /*  int[] arr = new int[] {1,2,4,5};
     int [] arrB = new int[4];
     String s = new String();
     int k = 6;
     //Arrays.copyOfRange(null, 0, 0, null);
     System.arraycopy(arr, 0, arrB, 0, 4);
     arr[1] = 3;
     System.out.println(Arrays.toString(arr));
     System.out.println(Arrays.toString(arrB)); */

    //  String s1 = "hello";
    //  String s2 = "hello";
    //  String s3 = s1;
    //  String s4 = "h" + "e" + "l" + "l" + "o";
    //  String s5 = new String("hello");
    //  s5 = s5.intern();
    //  String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
     
     StringBuilder sTest1 = new StringBuilder();
     for (int i = 0; i < 1000000; i++) {
         sTest1.append("abc");
     }
     StringBuilder sTest2 = new StringBuilder();
     for (int i = 0; i < 1000000; i++) {
         sTest2.append("abc");
     }
     long start = System.nanoTime();
     for (int i = 0; i < 1000; i++) {
         if (sTest1==sTest2) ;
     } 
     long end = System.nanoTime();
     System.out.println(end-start);
     start = System.nanoTime();
     for (int i = 0; i < 1000; i++) {
         sTest1.equals(sTest2);
     }
     end = System.nanoTime();
     System.out.println(end-start);
 }
public static void FillPlanetsList() {
     String[] AllPlanets = new String[]{"Earth", "Mars", "Jupiter", "Uran"};
     List<String> planetList = new ArrayList<>();
     for (int i = 0; i < 10; i++) {
         planetList.add(AllPlanets[(int)(Math.random()*AllPlanets.length)]);
     }
     // for (String string : planetList) {
     //     System.out.print(string + " ");
     // }
     System.out.println(); 
     planetList.sort(null);
     for (String string : planetList) {
         System.out.print(string + " ");
     }
     System.out.println();
     int count = 1;
     int lengthList = planetList.size();//10
     for (int i = 1; i < lengthList ; i++) {
         //System.out.println(planetList.get(i));
         if (planetList.get(i) != planetList.get(i-1)) {
             System.out.println(planetList.get(i-1)+" " +count);
             count = 1;
         }
         else count++;
     }
         System.out.println(planetList.get(lengthList-1) +" "+ count);
     }
}
  

  

