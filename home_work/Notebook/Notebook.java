package Java_project.home_work.Notebook;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Java_project.home_work.Notebook.Laptop.Store;

public class Notebook {
  public static void main(String[] args) {
    Laptop asus = new Laptop("ASUS",8,256,"Windows","Black");
    Laptop msi = new Laptop("MSI", 32, 1000, "Linux", "White");
    Laptop apple = new Laptop("Apple", 8, 256, "macOS", "Gray");
    Laptop xiaomi = new Laptop("Xiaomi", 16, 512, "Windows", "Gray");

    Store store = new Store();
    store.add(asus);
    store.add(msi);
    store.add(apple);
    store.add(xiaomi);

    store.print();

    store.filter();
}
}
class Laptop {
int ram; // 8,16,32,64
int hdd; // 256,512,1024
String os; //Windows 10, Windows 11, MacOS, Linux
String color; // Black, White, Gray, Red

String name;

 public Laptop(String name,int ram, int hdd, String os, String color) {
    this.name = name;
    this.ram = ram;
    this.hdd = hdd;
     this.os = os;
    this.color = color;
}

public String getName() {
    return name;
}

public int getRam() {
    return ram;
}

public int getHdd() {
    return hdd;
}

public String getOs() {
    return os;
}
public String getColor(){
     return color;
}
public static class Store {

    private final Set<Laptop>notebooks = new HashSet<>();

    public void add(Laptop laptop) {
        notebooks.add(laptop);
    }

    public void print() {
        for (Laptop laptop: notebooks) {
            System.out.println(laptop.getName() + " " + laptop.getRam() + "Gb " + laptop.getHdd() + "Gb " + laptop.getOs());
        }
    }

    public void filter() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую критерию:");
        System.out.println("\"1-ОЗУ\"\n\"2-Объем ЖД\"\n\"3-ОС\"\n\"4-color\"");
        int choice = iScanner.nextInt();
        int minValue = 0;
        String nameOs = "";
        String colorLaptop = "";
        switch (choice) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                minValue = iScanner.nextInt();
                for (Laptop laptop : notebooks) {
                    if (laptop.getRam() == minValue) {
                        System.out.println(laptop.getName() + " " + laptop.getRam() + "Gb " + laptop.getHdd() + "Gb " + laptop.getOs());
                    }
                }
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                minValue = iScanner.nextInt();
                for (Laptop laptop : notebooks) {
                    if (laptop.getHdd() == minValue) {
                        System.out.println(laptop.getName() + " " + laptop.getRam() + "Gb " + laptop.getHdd() + "Gb " + laptop.getOs());
                    }
                }
                break;
            case 3:
                System.out.println("Введите название операционной системы:");
                nameOs = iScanner.next();
                for (Laptop laptop:notebooks){
                    if(laptop.getOs().equalsIgnoreCase(nameOs)){
                        System.out.println(laptop.getName() + " " + laptop.getRam() + "Gb " + laptop.getHdd() + "Gb " + laptop.getOs());
                    }

                }
                break;
            case 4:
                System.out.println("Введите цвет:");
                colorLaptop = iScanner.next();
                for (Laptop laptop:notebooks){
                    if(laptop.getColor().equalsIgnoreCase(colorLaptop)){
                        System.out.println(laptop.getName() + " " + laptop.getRam() + "Gb " + laptop.getHdd() + "Gb " + laptop.getOs() + " " + laptop.getColor());
                    }
                    else
                        System.out.println("Такой цвет отсутствует!");
                    break;
                }
                break;
            default:
                System.out.println("Некорректный выбор критерия.");
        }
        iScanner.close();
    }


}
  
}
