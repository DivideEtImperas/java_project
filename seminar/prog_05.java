package Java_project.seminar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class prog_05 {
  public static void planet() {
    String[] planets = {
            "Mercury",
            "Venus",
            "Earth",
            "Mars",
            "Jupiter",
            "Saturn",
            "Uranus",
            "Neptune",
            "Pluto"};
  
    ArrayList<String> listPlanets = new ArrayList<String>();
    Random rn = new Random();
  
    for (int i = 0; i < 15; i++) {
        int randomElem = rn.nextInt(planets.length);
        listPlanets.add(planets[randomElem]);
  
    }
  
    Map<String, Integer> mapPlanets = new HashMap<String, Integer>();
    for (String planet:listPlanets) {
        boolean isKeyExists = mapPlanets.containsKey(planet);
        if(isKeyExists) {
            int count = mapPlanets.get(planet);
            mapPlanets.put(planet, ++count);
        } else {
            mapPlanets.put(planet, 1);
        }
    }
  
    System.out.println(listPlanets);
    System.out.println(mapPlanets);
  }
  
  
  
  
  
  // public static void planet() {
  //     ArrayList<String> listPlanets = new ArrayList<String>();
  //     Map<String, Integer> mapPlanets = new HashMap<String, Integer>();
  //     String[] planets = {
  //             "Mercury",
  //             "Venus",
  //             "Earth",
  //             "Mars",
  //             "Jupiter",
  //             "Saturn",
  //             "Uranus",
  //             "Neptune",
  //             "Pluto",
  //     };
  
  //     Random rn = new Random();
  
  //     for (int i = 0; i < 15; i++) {
  //         int randomElem = rn.nextInt(planets.length);
  //         String planet = planets[randomElem];
  //         listPlanets.add(planets[randomElem]);
  
  //         boolean isKeyExists = mapPlanets.containsKey(planet);
  //         if(isKeyExists) {
  //             int count = mapPlanets.get(planet);
  //             mapPlanets.put(planet, ++count);
  //         } else {
  //             mapPlanets.put(planet, 1);
  //         }
  //     }
  
  //     System.out.println(listPlanets);
  //     System.out.println(mapPlanets);
  // }
  
}
