package shapes;
// All methods of an interface are abstract, so any class that implements the interface MUST implement (i.e. override) the methods.
public interface Measurable {
    // Interface methods are implicitly public and abstract, so there is no need to type them
    double getPerimeter();
    double getArea();
}
