package javacoursebymosh;

public class Main {
    public static void main(String[] args) {
//        Wildcards are represented by the symbol ? and are used when you want to specify
//        a range of acceptable types rather than a specific one. They make your code
//        more flexible when you don’t need to know the exact type parameter.
//
//        There are three main forms:
//        1. Unbounded Wildcard (?)
        UnboundedWildcard.demo();

//        Bounded Wildcards:
//        2. Upper Bounded Wildcard (? extends T)
        UpperBoundedWildcard.demo();

//        3. Lower Bounded Wildcard (? super T)
        LowerBoundedWildcard.demo();

//        Each of these has unique use cases and rules.
    }
}
