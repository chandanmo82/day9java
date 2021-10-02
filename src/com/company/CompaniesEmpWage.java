package com.company;

public class CompaniesEmpWage {
    public static final int Part_Time = 1;
    public static final int Full_Time = 2;

    public static void main(String[] args) {

        System.out.println("Total Employee Wage Of a Employee Of CompanyA is : " + companyA(20, 20, 100));
        System.out.println("Total Employee Wage Of a Employee Of CompanyB is : " + companyA(30, 25, 120));
        System.out.println("Total Employee Wage Of a Employee Of CompanyC is : " + companyA(25, 24, 140));
        System.out.println("Total Employee Wage Of a Employee Of CompanyD is : " + companyA(40, 15, 90));

    }

    static int companyA(int ratePerHrs, int workingDays, int maxHrs) {

        int totalEmpHrs = 0, totalWorkingDays = 0, empHrs, totalEmpWage;
        while (totalEmpHrs <= maxHrs && totalWorkingDays < workingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case Part_Time:
                    empHrs = 4;
                    break;
                case Full_Time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
        }
        totalEmpWage = totalEmpHrs * ratePerHrs;
        return totalEmpWage;

    }

}
