package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // English to spanish dictionary
        Map<String, String> engSpanDict = new HashMap<String, String>();

        // Inserting things inside dictionary
        engSpanDict.put("Monday", "lunes");
        engSpanDict.put("Tuesday", "Martes");
        engSpanDict.put("Wednesday", "Miecoles");
        engSpanDict.put("Thursday", "Jueves");
        engSpanDict.put("Friday", "Viernes");

        System.out.println(engSpanDict.keySet());
        System.out.println(engSpanDict.values());
        System.out.println(engSpanDict.size());

        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        shoppingList.put("Salad", Boolean.TRUE);
        shoppingList.put("Tomatoes", Boolean.FALSE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Lettuce", Boolean.TRUE);
        shoppingList.put("Ham", Boolean.TRUE);

        System.out.println(shoppingList.toString());
        shoppingList.remove("Eggs");
        System.out.println(shoppingList.toString());
    }
}
