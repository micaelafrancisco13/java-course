package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // AND operator (&&)
        int temperature = 22;
        boolean isWarm = ((temperature > 20) && (temperature < 30));

        System.out.println(isWarm); // prints true
        // if temperature is 12 or 33, the result is false

        // OR operator (||)
        // an applicant is eligible to loan if they
        // have high income or good credit
        // and doesn't have a criminal record
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;

        // NOT operator (!)
        boolean noCriminalRecord = false;
        boolean isEligible = ((hasHighIncome || hasGoodCredit) && !(noCriminalRecord));
    }
}