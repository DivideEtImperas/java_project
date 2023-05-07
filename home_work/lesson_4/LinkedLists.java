package Java_project.home_work.lesson_4;
/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

 * Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя.
 */
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class LinkedLists {
  public static void main(String[] args) {
    
    LinkedList<Integer> list = new LinkedList<>();
    Queue<Integer> queue = new LinkedList<>();
    Deque<Integer> deque = new LinkedList<>();
    
    fillList(list);
    System.out.println(printList(list));
    System.out.println();
    System.out.println("Лист до разворота: " + list);
    list = reversLinkedList(list);
    System.out.println("Лист после разворота: " + list);
    System.out.println("Добавляем эллемент в конец списка");
    enQueue(queue);
    System.out.println("Queue: " + queue);
    System.out.println("Удаляем первый эллемент из списка");
    firstRemoveDeque(deque);
    System.out.println("Deque: " + deque);
  
    
    
  
  }
  // Метод заполнения листа рандомными числами
  public static LinkedList<Integer> fillList(LinkedList<Integer> list) {
    Random rand = new Random();
    for (int i = 1; i < 10 ; i++) {
      
       list.add(rand.nextInt(20));    
       
    }
    return list;
    
    
  }
  // Метод печати листа
  public static LinkedList<Integer> printList(LinkedList<Integer> list) {
    return list;
    
  }
  /*
   * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
   */
  // Метод который разворачивает лист
  public static LinkedList<Integer> reversLinkedList(LinkedList<Integer>list) {
    LinkedList<Integer> revList = new LinkedList<Integer>();
      for (int i = list.size()-1; i>=0;i--){
        revList.add(list.get(i));
      }    
      return revList;
  }
  /*
   * Реализуйте очередь с помощью LinkedList со следующими методами:
      • enqueue() — помещает элемент в конец очереди,
      • dequeue() — возвращает первый элемент из очереди и удаляет его,
      • first() — возвращает первый элемент из очереди, не удаляя.
   */

  // Метод queue добавление в конец списка
  public static Queue<Integer> enQueue(Queue<Integer> queue) {
    Random rand = new Random();
    for (int i = 0; i < 6; i++) {
      queue.add(rand.nextInt(1,10));
      
      
    }
    System.out.println("Начальный список: " + queue);
    queue.add(5); // Здесь делаем добавление в конец списка
    return queue;
      
  }
  public static Deque<Integer> firstRemoveDeque(Deque<Integer> deque) {
    Random rand = new Random();
    for (int i = 0; i < 6; i++) {
      deque.add(rand.nextInt(1,10));
    }
    System.out.println("Начальный список: " + deque);
    deque.removeFirst();
    System.out.println("Возвращает первый эллемент не удаляя его из списка: " + deque.getFirst());
    return deque;
    
  }

}

