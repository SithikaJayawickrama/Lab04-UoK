package com.mycompany.lab.uok;

public abstract class StaffMember {

    private String fullName;
    private final String staffId;   // final: staff ID should never change after creation
    protected String department;    // protected: child classes need direct access to this

    private static int staffCount = 0;

    // Constructor: initialises all three core fields
    public StaffMember(String fullName, String staffId, String department) {
        this.fullName    = fullName;
        this.staffId     = staffId;
        this.department  = department;
        staffCount++;   // increment shared counter each time a staff object is created
    }

    // -- Getters --

    public String getFullName() {
        return fullName;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getDepartment() {
        return department;
    }

    // -- Static methods ---

    public static void showSystemName() {
        System.out.println("System: Campus Staff Payment System");
    }

    public static int getStaffCount() {
        return staffCount;
    }

    // -- Final instance methods ---
 
    public final void displayBasicDetails() {
        System.out.println("Name       : " + fullName);
        System.out.println("Staff ID   : " + staffId);
        System.out.println("Department : " + department);
    }

    public void changeDepartment(String newDepartment) {
        if (newDepartment == null || newDepartment.isEmpty()) {
            System.out.println("Department update rejected: new department cannot be empty.");
        } else {
            this.department = newDepartment;
            System.out.println("Department updated to: " + newDepartment);
        }
    }

    // undermine the university-wide policy this notice represents.
    public final void showCommonNotice() {
        System.out.println("[Notice] All staff must submit their monthly report by the 5th.");
    }

    // --- Abstract method ---

    // Each subclass must supply its own payment formula.
    public abstract double calculateMonthlyPayment();
}