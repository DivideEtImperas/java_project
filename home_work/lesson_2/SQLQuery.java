package Java_project.home_work.lesson_2;
/*
 * Дана строка sql-запроса "select * from students where ". 
 * Сформируйте часть WHERE этого запроса, используя StringBuilder. 
 * Данные для фильтрации приведены ниже в виде json-строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */

public class SQLQuery {
  public static void main(String[] args) throws Exception {
        
    String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    
    StringBuilder resultSelect = LineInStr(str);
    System.out.println(resultSelect);
}
    public static StringBuilder LineInStr(String line) {
      String line1 = line.replace("{", "");
      String line2 = line1.replace("}", "");
      String line3 = line2.replaceAll("\n", "");
      System.out.println(line3);
      StringBuilder resultSelect = new StringBuilder("select * from students where ");

      String [] arrayData = line3.split(", ");
      for (int i = 0; i < arrayData.length; i++) {
          String[] arrData = arrayData[i].split(":");
          if(!arrData[1].contains("null") ) {
              if (i != 0) {
                  resultSelect.append(", ");
                  resultSelect.append(arrData[0]);
                  resultSelect.append(" = ");
                  resultSelect.append(arrData[1]);
              } 
              else {
                  resultSelect.append(arrData[0]);
                  resultSelect.append(" = ");
                  resultSelect.append(arrData[1]);
              }
   
          }
          
  }
    return resultSelect;
    }
}
