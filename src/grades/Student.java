package grades;
// TODO: ArrayList
// ArrayList is a class that represents an array that can change it's size. All elements in an ArrayList must be objects, and they must have the same type.
// .size 	returns the number of elements in the array
// .add 	add an element to the collection (optionally) at a specified index
// .get 	return the element at the specified index
// .indexOf 	return the first found index of the given item, or -1 if not found
// .contains 	check if a collection contains a given element
// .lastIndexOf 	find the last index of the given element, -1 if not found
// .isEmpty 	check if the list is empty
// .remove 	remove the first occurrence of an item, or an item at a given index
//      When an index is passed, the removed element is returned. When an object is passed, a boolean indicating whether an item was removed is returned.
// We specify the type of each element in the collection with angle brackets, (<>).


import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int total = 0;
        double avg;
        for (int grade : this.grades) {
            total += grade;
        }
        avg = (double) total / this.grades.size();
        return avg;
    }

    // TODO: The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // TODO: Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
    public static void main(String[] args) {
        Student matt = new Student("Matt Lewis");
        Student amy = new Student("Amy");

        amy.addGrade(95);
        amy.addGrade(100);
        amy.addGrade(88);
        matt.addGrade(75);
        matt.addGrade(60);
        matt.addGrade(100);
        System.out.println(amy.grades);
        System.out.printf("%.2f%n",amy.getGradeAverage());
        System.out.println(matt.grades);
        System.out.printf("%.2f%n", matt.getGradeAverage());
    }
}