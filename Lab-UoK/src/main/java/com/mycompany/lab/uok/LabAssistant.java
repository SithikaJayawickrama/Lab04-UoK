package com.mycompany.lab.uok;

public class LabAssistant extends StaffMember {

    private int    hoursWorked;
    private double hourlyRate;

    // Constructor uses super(...) to initialise the fields defined in StaffMember
    public LabAssistant(String fullName, String staffId, String department,
                        int hoursWorked, double hourlyRate) {
        super(fullName, staffId, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate  = hourlyRate;
    }

    // A lab assistant is paid based on hours worked each month
    @Override
    public double calculateMonthlyPayment() {
        return hoursWorked * hourlyRate;
    }

    // Displays full lab assistant details, starting with the inherited common details
    public void displayLabAssistantDetails() {
        System.out.println("---- Lab Assistant Details ----");
        displayBasicDetails();                          // inherited final method
        System.out.println("Hours Worked   : " + hoursWorked);
        System.out.println("Hourly Rate    : " + hourlyRate);
        System.out.println("Monthly Pay    : " + calculateMonthlyPayment());
        System.out.println("------------------------------");
    }
}