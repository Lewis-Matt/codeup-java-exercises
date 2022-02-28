package grades;

import util.Input;

import java.util.HashMap;

// TODO: HashMap
// A hash map is a data structure for key-value pairs, implemented with the HashMap class in Java. These are similar to objects in JavaScript. All the keys in the hash map must be of the same type, and all the values must be of the same type, but the keys and the values don't necessarily have to be the same type.
// .put 	set a key-value pair
// .get 	return the value associated with the given key, or null
// .getOrDefault 	like .get, but with a defined value instead of null
// .containsKey 	check if a key exists in the map
// .containsValue 	check if a value exists in the map
// .putIfAbsent 	only set a key-value pair if it does not exist
// .remove 	remove a key-value pair from the map
// .replace 	replace a value at a given key
// .clear 	empty the map
// .isEmpty 	check if the map is empty
public class GradesApplication {
    // TODO: Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects.
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        // TODO: Create at least 4 Student objects with at least 3 grades each, and add them to the map.
        Student bob = new Student("Bob");
        Student mary = new Student("Mary");
        Student tyler = new Student("Tyler");
        Student karen = new Student("Karen");
        bob.addGrade(80);
        bob.addGrade(90);
        bob.addGrade(80);
        mary.addGrade(90);
        mary.addGrade(95);
        mary.addGrade(97);
        tyler.addGrade(60);
        tyler.addGrade(69);
        tyler.addGrade(78);
        karen.addGrade(85);
        karen.addGrade(65);
        karen.addGrade(95);

        students.put("bobMarley", bob);
        students.put("marymary", mary);
        students.put("steventyler", tyler);
        students.put("karen2020", karen);

        // TODO: Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a GitHub username.
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.printf("| %s | %s | %s | %s |%n", bob, mary, tyler, karen);
        System.out.println("What student would you like to see more information on?");
        // Using the Input Class created in a previous exercise
        Input studentSelect = new Input();
        String selectedStudent = studentSelect.getString();
        System.out.printf("You selected: %s", selectedStudent);
        // We can use keySet() to print all keys present in the map and values() to print all values.

    }


}
