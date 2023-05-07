package Java_project.home_work.lesson_5;
/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 */
import java.util.HashMap;
import java.util.Map;
public class PhoneBook {
  public static void main(String[] args) {
    Map<Integer,String> map = new HashMap<>();
    map.put(82345, "Иванов");
    map.put(2367, "Петров");
    map.put(23456,"Иванов");
    map.put(89203, "Сидоров");
    map.put(123444, "Чернов");
    System.out.println(map);
    Map<String,Integer> sortMap = new HashMap<>();
    for (var item: map.entrySet()) {
      String fillValue = item.getValue();
      if(sortMap.containsKey(fillValue)){
        Integer sum = sortMap.get(fillValue) + 1;
        sortMap.put(fillValue, sum); 
      }
      else{
      sortMap.put(fillValue, 1);
      }
      System.out.println(sortMap);
  
  }
}
}
