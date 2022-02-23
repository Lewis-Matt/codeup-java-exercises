import java.util.Arrays;

public class ArraysExercises {
// TODO: ******************************LESSON NOTES***************************************
// Java arrays are fixed length
// final int NUMBER_OF_BEATLES = 4; // use this as length
// BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATLES];
// Here we define a variable named theBeatles whose type is an array where each element has the type of BandMember

// TODO: DEFAULT VALUES BY TYPE
//    Type 	            Default Value
//  integer number types 	0
//  decimal number types 	0.0
//  boolean 	            false
//  character 	            \0 (zero)
//  object 	                null

// Referring to an index that outside the range of the array will cause an ArrayIndexOutOfBoundsException.
// TODO: Array initializer syntax:
    // String[] beatles = {"John", "Paul", "Ringo"};

// TODO: ITERATING NOTES
// In addition to the traditional for loop, Java provides an enhanced for that is similar to a forEach in JavaScript. It is useful when we want to do something for every item in an array.
    // String[] languages = {"html", "css", "javascript", "java"};
    // for (String language : languages) {
    //    System.out.println(language);
    //}
    // When using the enhanced for, we must specify what collection (languages) we are iterating over, a variable (language) to hold each element, and the type of each element in the collection (String).

// TODO: The Arrays Class (import) - common methods:
    // void Arrays.fill(arrayName, value): Fills all elements of the specified array with the specified value.
    // boolean Arrays.equals(array1, array2): Returns true if both arrays are of the same type and all of the elements within the arrays are equal to each other.
    // array Arrays.copyOf(array, length): Returns a copy of the given array with the specified length.
    // String Arrays.toString(array): Returns a string representation of the array.
    // void Arrays.sort(array): Sorts the elements of an array into ascending order.

// TODO: Two-Dimensional Arrays
// We can define an array whose elements are themselves arrays. This is called a two-dimensional array, or a matrix. You can think of a two-dimensional array like a grid, with rows and columns.
    // int[][] matrix = {
    //    {1, 2, 3},
    //    {4, 5, 6},
    //    {7, 8, 9}
    // };
    //// access the first element in the second row
    // System.out.println(matrix[1][0]); // 4

// TODO: Iterating over every element in matrix
    // for (int[] row : matrix) {
    //    System.out.println("+---+---+---+");
    //    System.out.print("| ");
    //
    //    for (int n : row) {
    //        System.out.print(n + " | ");
    //    }
    //    System.out.println();
    // }
    // System.out.println("+---+---+---+");
//              +---+---+---+
//              | 1 | 2 | 3 |
//              +---+---+---+
//              | 4 | 5 | 6 |
//              +---+---+---+
//              | 7 | 8 | 9 |
//              +---+---+---+
// TODO: *********************************EXERCISE*********************************
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        // println requires String as input, so we must convert our array
        System.out.println(Arrays.toString(numbers));

        // TODO: Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
// ******* Note, all the classes created for other exercises are 'seen' by every other class within the 'src' directory (as long as they are public) *********
        Person[] personArr = new Person[3];
        personArr[0] = new Person("Amy");
        personArr[1] = new Person("Addie");
        personArr[2] = new Person("Izzy");

        // TODO: Iterate through the array and print out the name of each person in the array.
        for (Person people : personArr) {
            System.out.println(people.getName());
        }

        // TODO: Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.



    }

}
