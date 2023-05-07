package Java_project.seminar;

import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;

public class prog_03 {
  public static void main(String[] args) {
    // Scanner iScanner = new Scanner (System.in);
    // Integer N = iScanner.nextInt();
    // System.out.println(sumString(N));
    // String defaultt = "aaaabbbcddad";
    // res = ""; s = 'a'
    // -1 -> res = 'a'
    // s = 'a' -> 0 -> res = 'a'
    // s = 'a' -> 0 -> res = 'a'
    // s = 'b' -> -1 -> res = 'ab'
    // s = 'b' -> 1 -> res = 'ab'
    // String res = "";
    // for (int i = 0; i < defaultt.length(); i++) {
    //     char s = defaultt.charAt(i);
    //     if (res.indexOf(s) == -1) res+=s; 
    // }
    // System.out.println(res);
    
    //Проверка на палиндром
    // StringBuilder name = new StringBuilder(iScanner.nextLine());
    // // StringBuilder namePalindrom = name.reverse(); не допустимо
    // StringBuilder namePalindrom = new StringBuilder(name);
    // namePalindrom.reverse();
    // // System.out.println(name.toString());
    // // System.out.println(namePalindrom.toString());
    // System.out.println(name.toString().equals(namePalindrom.toString()));


   try(FileWriter fw = new FileWriter( "X:\\Programming\\Java_project\\seminar\\test.txt")){
    for (int i = 0; i < 100; i++) {
      fw.write("TEST");
      fw.append('\n');
      
    } 
        fw.close();
   }catch(IOException ex){
    System.out.println(ex.getMessage());
   }
}
  
}
