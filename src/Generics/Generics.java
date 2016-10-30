package Generics;

import java.util.List;
import java.util.LinkedList;

public class Generics {

    public Generics() {

  List<String> strings = new LinkedList<>();
        strings.add("hallo");

        List<Integer> integers = new LinkedList(strings);
        integers.add(42);

        System.out.println("My integers list: " + integers);
        System.out.println("Check if " + integers.get(0) + " is an Integer: " + (integers.get(0) instanceof Integer));
        System.out.println("Check if " + integers.get(1) + " is an Integer: " + (integers.get(1) instanceof Integer));
    }

}
