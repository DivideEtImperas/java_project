package Java_project.java_01;
/*
 *  Программа, демонстрирующая использование констант
 */
public class Constant {
  public static void main(String[] args) {
    // Константы для подсчета очков.
    final int TOUCHDOWN = 6;
    final int CONVERSION = 1;
    final int FIELDGOAL = 3;

    int td,pat,fg,total;

    td = 4 * TOUCHDOWN;
    pat = 3 * CONVERSION;
    fg = 2 * FIELDGOAL;
    total = (td + pat + fg);

    // Вывод вычисленной суммы.
    System.out.println("Очков всего: " + total);

  }
  
}
