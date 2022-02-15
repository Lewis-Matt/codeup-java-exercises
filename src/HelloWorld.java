public class HelloWorld {
    public static void main(String[] args) {
        // println() prints to a new line
        // print() prints on the same line
        System.out.println("Hello, World!");

        int myFavoriteNumber = 1284;
        System.out.println(myFavoriteNumber);

        // Double quotes are for strings
        // Single quotes represent chars
        String myString = "Carrots";
        System.out.println(myString);

        // If I use 3.14, throws 'incompatible types' error (double to long)
        // An integer (123) fits inside of a long (but not vice versa)
        long myNumber = 123;
        System.out.println(myNumber);

        // Putting a integer in a float will add the .0
        // Putting a 'f' at the end of 3.14 lets it compile (otherwise it doesn't)
        float myNumber2 = 3.14f;
        System.out.println(myNumber2);

        int x = 5;
        // Post increment - prints it first, then increments (5)
        System.out.println(x++);
        // x has now been incremented, prints (6)
        System.out.println(x);

        int y = 5;
        // Pre-increments, then prints, y is 6
        System.out.println(++y);
        // y is still 6
        System.out.println(y);

        // Object is the most generic type in Java, any value can be assigned to it.
        String theNumberThree = "three";
        Object o = theNumberThree;
        // prints three
        System.out.println(o);
//        int three = (int) o;
    // The above is the same as below: still can't cast string to int
//        int three = (int) "three";

        // shorthand
        int z = 4;
        z += 5;

        int a = 3;
        int b = 4;
        b *= a;

        int n = 10;
        int m = 2;
        n /= m;
        m -= n;
        System.out.println(m);
        // Note Integer.MAX_VALUE is a class constant that holds the max value for the int type


    }
}
