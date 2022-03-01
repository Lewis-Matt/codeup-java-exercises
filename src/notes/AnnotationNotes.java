package notes;
// TODO: See annotations-exercise repo
import java.util.ArrayList;

public class AnnotationNotes {
// TODO: Definition
// Annotations are used to provide metadata for Java code. Annotations don't modify the execution of code; however, they can be consumed in order to perform additional logic.
// A Java annotation can also have elements for which you can set values.
//
// @Entity(table = "vehicles")`
//
// An annotation can contain multiple elements.
//
// @Entity(tableName = "vehicles", primaryKey = "id")
//
// If an annotation contains a single element, it's convention to name it value.
//
// @TextTransformation(value = "uppercase")

// TODO: Placement
// You can place Java annotations above:
//    classes.
//    interfaces.
//    fields.
//    local variables.

// TODO: @Deprecated
// The @Deprecated annotation is used to indicate that a class, method, or field should no longer be used. If that class, method, or field is used, the compiler will give you a warning when the code is compiled.
// It can also be used above method and field declarations.

// TODO: @Override
// The @Override annotation is used above methods that are intended to override a method in a superclass.
// This annotation is meant to indicate intention. That way, if a developer meant to override a method, but made a mistake in the method definition, the mistake can be caught at compile-time.
    /*
class Person {
    public String fullName() {
        // ...
    }
}
    class SuperHero extends Person {
        @Override
        public String alterEgo () {
            // ...
        }
    }
   */
// The code above will produce an error because the alterEgo method has the @Override annotation, but it is not overriding a method from it's superclass, Person.

// TODO: @SuppressWarnings
// The @SuppressWarnings annotation makes the compiler suppress warnings for a given method. For instance, if a method makes an unchecked type cast, the compiler may generate a warning.
// In general, you should always specify types whenever possible when using Java's collections. Sometimes situations arise where this is not possible, and we can't specify the type ahead of time. This is the scenario @SuppressWarnings was created for.
    // all - to suppress all warnings
    // unchecked - to suppress warnings relative to unchecked operations
    // deprecation - to suppress warnings relative to deprecation
// If you want to suppress more than one type of warning: @SuppressWarnings({"deprecation", "unchecked"})
}

