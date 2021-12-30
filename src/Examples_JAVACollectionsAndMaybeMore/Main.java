package Examples_JAVACollectionsAndMaybeMore;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //1. Array lists (e.g. ArrayList<String> or ArrayList<Integer> or ArrayList<Double> etc)

        System.out.println("\nOne type of 'Collection' is the 'ArrayList'");
        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Alina");
        names.add("Petrache");
        System.out.println("The index of the element is: " + names.indexOf("Alex"));
        System.out.println("The index of the element is: " + names.indexOf("Ion")); //should be -1 if the value does not exist
        System.out.println("ArrayList size is: " + names.size());

        names.remove("Alina");
        System.out.println(names.contains("Alina") +
                "\nNew size of ArrayList: " + names.size());

        //Listarea valorilor din ArrayList ->
        System.out.println("\nThe ArrayList contains the following:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //Using an external class/object
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Nicole", 12));
        students.add(new Student("Brad", 13));
        System.out.println("\nThe number of students in the ArrayList is: " + students.size());

        //Listarea valorilor din ArrayList students cu ajutorul 'for each'->
        System.out.println("\nThe ArrayList students contains:");
        for (Student s : students) {
            // Student -> data type or object
            // s -> name of object (can be anything)
            // students -> the collection itself in which you are looking, in this case the ArrayList
            System.out.println(s.getName() + " " + s.getId());
        }

        System.out.println("-------------------------------------------------------");

        //2. Maps
        //Map <Key, Value> (e.g. Map<String, String> or Map<String, Integer> etc)

        System.out.println("\n\nAnother type of 'Collection' is the 'Map'");
        Map<String, String> contacts = new HashMap<>();
        contacts.put("Ion", "ion@yahoo.com");
        contacts.put("Ioana", "beri@yahoo.com");

        System.out.println(contacts.get("Ioana"));
        System.out.println(contacts.size());
        System.out.println(contacts.entrySet());

        contacts.remove("Ion");
        System.out.println(contacts.entrySet());

        System.out.println(contacts.containsKey("Ioana"));

    }

}

