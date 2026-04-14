/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab.uok;

public class Lab04Main {

    public static void main(String[] args) {

        StaffMember.showSystemName();
        System.out.println();

        UniversityPolicy.showPolicyHeader();
        System.out.println("University : " + UniversityPolicy.UNIVERSITY_NAME);
        System.out.println();

        // Create 3 staff objects (2 Lecturers + 1 LabAssistant)
        Lecturer     lec1 = new Lecturer    ("Dr. Amal Perera",  "L-001", "Computing",         4, 15000.0);
        Lecturer     lec2 = new Lecturer    ("Ms. Nisha Fernando","L-002","Engineering",        3, 12000.0);
        LabAssistant lab1 = new LabAssistant("Mr. Kasun Silva",  "LA-001","Computing",        80,   350.0);

        // Change the department of one object using controlled update 
        System.out.println("── Department Update ──");
        lab1.changeDepartment("Science & Technology");
        System.out.println();

        // Display all 3 staff members 
        lec1.displayLecturerDetails();
        System.out.println();
        lec2.displayLecturerDetails();
        System.out.println();
        lab1.displayLabAssistantDetails();
        System.out.println();

        // Monthly payment for each staff member ────────────────────────
        double pay1 = lec1.calculateMonthlyPayment();
        double pay2 = lec2.calculateMonthlyPayment();
        double pay3 = lab1.calculateMonthlyPayment();

        System.out.println("── Monthly Payments ──");
        System.out.printf("%-20s : %.2f%n", lec1.getFullName(), pay1);
        System.out.printf("%-20s : %.2f%n", lec2.getFullName(), pay2);
        System.out.printf("%-20s : %.2f%n", lab1.getFullName(), pay3);
        System.out.println();

        // Total monthly payment 
        double totalPay = pay1 + pay2 + pay3;
        System.out.printf("Total Monthly Payment : %.2f%n", totalPay);
        System.out.println();

        // Bonus estimates 
        System.out.println("── Bonus Estimates (10%) ──");
        System.out.printf("%-20s bonus : %.2f%n", lec1.getFullName(), UniversityPolicy.calculateBonus(pay1));
        System.out.printf("%-20s bonus : %.2f%n", lec2.getFullName(), UniversityPolicy.calculateBonus(pay2));
        System.out.printf("%-20s bonus : %.2f%n", lab1.getFullName(), UniversityPolicy.calculateBonus(pay3));
        System.out.println();

        // staffCount is static: one shared counter for all objects, not a separate copy per object
        System.out.println("Total Staff Created   : " + StaffMember.getStaffCount());
        System.out.println();

       //showCommonNotice() for all 3 staff members
        System.out.println("── Common Notices ──");
        lec1.showCommonNotice();
        lec2.showCommonNotice();
        lab1.showCommonNotice();
    }
}