package com.mycompany.lab.uok;

public final class UniversityPolicy {

    public static final String UNIVERSITY_NAME = "University of Kelaniya";
    public static final double BONUS_RATE       = 0.10;   

    // Prints a standard header that should appear above every policy report
    public static void showPolicyHeader() {
        System.out.println("============================================");
        System.out.println("  " + UNIVERSITY_NAME);
        System.out.println("  Campus Staff Payment System – Policy View");
        System.out.println("============================================");
    }

    // Calculates a simple one-time bonus based on the monthly payment
    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }
}
