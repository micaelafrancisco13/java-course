package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var report = new TaxReport(new TaxCalculator2018(100_000));
        report.show();

        // there are new bad features in Java
        // 1. declaring fields in interfaces
        // these fields are constants and static

        // 2. static methods in interfaces

        // 3. private methods in interfaces
        // why is this feature added?
        // as part of writing static methods in interfaces, which we
        // shouldn't write in the first place, we might end up with
        // repetitive logic. so we can refactor our code and extract
        // that redundant logic into a private method inside the
        // interface

        // interfaces are contracts
        // interfaces can only have method declarations
    }
}