package Java_project.home_work.lesson_1;
/*
 *  Вывести все простые числа от 1 до 1000
 */
import java.util.ArrayList;

public class PrimeNumbers {
  public static void main(String[] args) {

    ArrayList <Integer> Primes = new ArrayList<>(0); 
    Integer count=0;
    Integer value=0;
    Integer numberOfPrimes=1000;
    do {
        if(isPrime(value,Primes)) {
        Primes.add(value);
        count++;
    }
    value++;
    }while(count<numberOfPrimes);

    System.out.println(Primes.toString());
  }
       
    static boolean isPrime(Integer value, ArrayList <Integer> Primes) {     
    if(value==0) {
        return false;
    }       
    for(int i=0;i<Primes.size() && Primes.get(i)< Math.sqrt(value);i++) {                   
        if(value%Primes.get(i)==0 && Primes.get(i)!=1) {
            return false;
        }           
    }       
    return true;            
    }
}
