package list_examples01;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        // add elements in the arraylist
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");
        System.out.println("ArrayList: " + animals);
        // get the element from the arraylist
        String str = animals.get(1);
        System.out.println("Element at index 1: " + str);
        int i = 0;
        System.out.println("Element at index 0: " + animals.get(i));

    }
}

