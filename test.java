package Java_project;

import java.io.*;


public class test {
  public static void main(String[] args) throws Exception {
    // try(FileWriter fw = new FileWriter("X:\\Programming\\Java_project\\file.txt", false)) {
    //       fw.write("line 1");
    //       fw.append('\n');
    //       fw.append('2');
    //       fw.append('\n');
    //       fw.write("line 3");
    //       fw.flush();
    // } catch (Exception ex) {
    //   System.out.println(ex.getMessage());
    //   // TODO: handle exception
    // }
  BufferedReader br =new BufferedReader( new FileReader("X:\\Programming\\Java_project\\file.txt"));
  String str;
  while ((str = br.readLine()) != null) {
        
          System.out.printf("== %s ==\n", str);
        }
        br.close();
  }


  }


  

