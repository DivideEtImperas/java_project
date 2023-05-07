package Java_project.java_01;

public class Array {

 public static void main(String[] args) {
  
  // Массивы

  // int[]arr = new int[10];
  // System.out.println(arr.length);
  
  // arr = new int[] {1,2,3,4,5};
  // System.out.println(arr.length);

  // Массивы массивов

  int[] arr [] = new int[3][5];

  for (int i = 0; i < arr.length; i++){
      for (int j = 0; j < arr[i].length; j++) {
        
      
      System.out.printf("%d ", arr[i][j]);
      
    }
    System.out.println();
  }
 }
  
}
