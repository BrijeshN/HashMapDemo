/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapdemo;

import java.util.HashMap;

/**
 *
 * @author Brijesh
 */
public class HashMapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashMap<String, Integer> mountains = new HashMap<>();
        
        mountains.put("Everest", 29029);
        mountains.put("K2", 28251);
        mountains.put("Kangchenjunga", 28169);
        mountains.put("Denali", 20335);

        printMap(mountains);
        
        System.out.println("Denali in the map: " + mountains.containsKey("Denali"));
        System.out.println();
        
        System.out.println("Changing height of Denali.");
        mountains.put("Denali", 20320);
        printMap(mountains);
        
        System.out.println("Removing Kangchenjunga.");
        mountains.remove("Kangchenjunga");
        printMap(mountains);
        
    }

    private static void printMap(HashMap<String, Integer> map) {
        
        System.out.println("Map contains:");
        for(String keyMountainName : map.keySet()){
            Integer height = map.get(keyMountainName);
            System.out.println(keyMountainName + " --> " + height.intValue() + " feet.");
        }
        
        System.out.println();
        
    }
    
}
