package Java_project.seminar;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Lesson3
 */
public class prog_02 {
  
  public static Scanner iScanner = new Scanner(System.in);

  public static int sumOfNumbersFrom1ToN(int toN) {

      if (toN <= 0) return 0;
      return toN + sumOfNumbersFrom1ToN(--toN);
  }
  public static void main(String[] args) {
      // Integer N = iScanner.nextInt();
      // System.out.println(sumString(N));
      /* String defaultt = "aaaabbbcddad";
      // res = ""; s = 'a'
      // -1 -> res = 'a'
      // s = 'a' -> 0 -> res = 'a'
      // s = 'a' -> 0 -> res = 'a'
      // s = 'b' -> -1 -> res = 'ab'
      // s = 'b' -> 1 -> res = 'ab'
      String res = "";
      for (int i = 0; i < defaultt.length(); i++) {
          char s = defaultt.charAt(i);
          if (res.indexOf(s) == -1) res+=s; 
      }
      System.out.println(res); */
      
      /* StringBuilder name = new StringBuilder(iScanner.nextLine());
      // StringBuilder namePalindrom = name.reverse(); РЅРµ РґРѕРїСѓСЃС‚РёРјРѕ
      StringBuilder namePalindrom = new StringBuilder(name);
      namePalindrom.reverse();
      System.out.println(name.toString());
      System.out.println(namePalindrom.toString());
      System.out.println(name.toString().equals(namePalindrom.toString()));// == equals */
      try (FileWriter fw = new FileWriter("1.txt")){
          for (int i = 0; i < 100; i++) {
              fw.write("TEST\n");
              // fw.append('\n');
          }
          fw.close();
      }catch(IOException ex) {
          System.out.println(ex.getMessage());
      }
  }

  public static String sumString(Integer N) {
      String c1 = "Oleg";
      String c2 = "Kamila";
      String res = "";
      for (int i=0; i<N; i++) {
          /* if (i % 2 == 0) res+=c1;
          else res+=c2; */
          res+= i % 2 == 0 ? c1:  c2;// i++ ++i
      }
      return res;
  }
  


  
}

