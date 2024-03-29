package org.javacoursebymosh;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // override the equals()
    @Override
    public boolean equals(Object obj) {
        // optimization technique
        if (this == obj) return true;

        // we only want to deal with the members of the
        // Point class' instances
        if (!(obj instanceof Point)) return false;

        var other = (Point) obj;

        return other.x == x && other.y == y;
    }

    // best practice - also override the hashCode() when 
    // overriding equals()
    @Override
    public int hashCode() {
        // instead of generating hash code based on the object's
        // address in memory, we want to generate a hash code
        // based on the values of "x" and "y" fields
        return Objects.hash(x, y);
    }
}
