package notes;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileIONotes {

//      / refers to roo
//      . current directory
//      .. parent directory
//  absolute path: from the filesystem root - specify location unambiguously
    // /Users/codeup/IdeaProjects/java-exercises/data/data.txt
//  relative path: from the current working directory
    // data/data.txt

// The Java standard library contains many classes for working with paths and files, located in the java.io and java.nio packages.

// TODO: The Path Interface
    //Defines an object that represents a filepath
    //Many file operations will expect to be passed an argument of type Path
    //Abstracts away differences between different filesystem paths (Windows vs MacOS)

// TODO: The Paths Class
    // Contains static methods for obtaining file paths
    // Can be used to obtain objects that implement Path

// TODO: File Class
    // Object that represents a file

// TODO: Files Class
    // Contains static methods for manipulating files

// Most of the methods we'll discuss for file IO can throw an IOException; you will need to handle this in your application.

// EXAMPLES
//  Return a Path that corresponds to the passed string, or multiple strings representing directories and files
    // TODO:
    //  Path Paths.get(String filename)
    //  Path Paths.get(String directory, String filename)
    //  Path Paths.get(String parentDir, String childDir, String filename)

// Tests for the existence of a file or directory
    // TODO:
    //  boolean Files.exists(Path filepath) - returns true if it exists
    //  boolean Files.notExists(Path filepath) - returns true if it does not exist

// Create an empty file at the specified path
    // TODO:
    //  Path Files.createFile(Path path)

// Create a directory or multiple specified directories if necessary
    // TODO:
    //  Path Files.createDirectories(Path path)

    // Using a relative path to create a directory if they do not yet exists
    // TODO:
    //    String directory = "data";
    //    String filename = "info.txt";
    //    Path dataDirectory = Paths.get(directory);
    //    Path dataFile = Paths.get(directory, filename);
    //  if (Files.notExists(dataDirectory)) {
    //        Files.createDirectories(dataDirectory);
    //    }
    //  if (! Files.exists(dataFile)) {
    //        Files.createFile(dataFile);
    //    }
    // This will create the directory data in the current working directory, and, within that directory, create a file named info.txt.

// TODO: READING AND WRITING
    // Write a list of strings to a file
    // TODO: Path Files.write(Path filepath, List<String> lines[, StandardOpenOption option])
    //Each string in the lines parameter will become one line in the file
    //Default is to overwrite the existing file (or create a new one)
    //The last argument is optional
    //StandardOpenOption.APPEND can be used as the last argument to add to an existing file

    // Read the contents of a file
    // TODO: List<String> Files.readAllLines(Path filepath)
    // Transforms each line in the file into a string
    // Each element of the returned list is a string (one line from the file)

// Create a list and write its contents to a file
    // TODO:
    //  List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
    //  Path filepath = Paths.get("data", "groceries.txt");
    //  Files.write(filepath, groceryList);
    // .asList static method of the Arrays class returns a new List created from the arguments passed to it.

    // Print out each line of the data/groceries.txt, along with a line number
    // TODO:
    //  Path groceriesPath = Paths.get("data", "groceries.txt");
    //  List<String> groceryList = Files.readAllLines(groceriesPath);
    //  for (int i = 0; i < groceryList.size(); i += 1) {
    //    System.out.println((i + 1) + ": " + groceryList.get(i));
    //  }

    // Add a line to the file
    // TODO:
    //  Files.write(
    //    Paths.get("data", "groceries.txt"),
    //    Arrays.asList("eggs"), // list with one item
    //    StandardOpenOption.APPEND
    //  );

    // Replace an item (milk with cream)
    // TODO:
    //  List<String> lines = Files.readAllLines(Paths.get("data", "groceries.txt"));
    //  List<String> newList = new ArrayList<>();
    //  for (String line : lines) {
    //    if (line.equals("milk")) {
    //        newList.add("cream");
    //        continue;
    //    }
    //    newList.add(line);
    //  }
    //  Files.write(Paths.get("data", "groceries.txt"), newList);
}
