package com.mycompany.lab.uok;

public class Lecturer extends StaffMember {

    private int courseCount;
    private double paymentPerCourse;

    // Constructor uses super(...) to initialise the fields defined in StaffMember
    public Lecturer(String fullName, String staffId, String department,
            int courseCount, double paymentPerCourse) {
        super(fullName, staffId, department);
        this.courseCount = courseCount;
        this.paymentPerCourse = paymentPerCourse;
    }

   
    @Override
    public double calculateMonthlyPayment() {
        return courseCount * paymentPerCourse;
    }

    
    public void displayLecturerDetails() {
        System.out.println("-- Lecturer Details --");
        displayBasicDetails();                          // inherited final method
        System.out.println("Courses        : " + courseCount);
        System.out.println("Pay per Course : " + paymentPerCourse);
        System.out.println("Monthly Pay    : " + calculateMonthlyPayment());
        System.out.println("----------------------");
    }
}
