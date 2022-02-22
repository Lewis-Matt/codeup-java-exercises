public class Person {
    // TODO: Make a private name field that is a string
    private String name = "Matt";

    public String getName() {
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name) {
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s!%n", name);
    }

    // TODO: The class should have a constructor that accepts a `String` value and sets the person's name to the passed string.
    public Person(String name) {
        setName(name);
    }

    // TODO: Create a `main` method on the class that creates a new `Person` object and tests the above methods.
    public static void main(String[] args) {
        Person p1 = new Person("Matt");
        p1.sayHello();
        p1.setName("Bob");
        p1.sayHello();
        System.out.println(p1.getName());

    // TODO: The following code blocks make use of the Person class from the previous exercise. For each code block, think about what the code will output.
        System.out.println("-----------Part 1----------");
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        // Are the two values the same? True
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        System.out.println("-----------Part 2----------");
        Person person3 = new Person("John");
        // Reference variable - person4 points to person3
        Person person4 = person3;
        // They both share the same reference, so it is True
        System.out.println(person3 == person4);

        System.out.println("-----------Part 3----------");
        Person person5 = new Person("John");
        // person6 shares the reference to person5
        Person person6 = person5;
        // They both refer to the same object, so the name is the same
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        // person6 refers shares the reference to person5, so changing it changes both
        person6.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());

    }
}
