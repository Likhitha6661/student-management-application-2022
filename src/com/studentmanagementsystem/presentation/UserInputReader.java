package com.studentmanagementsystem.presentation;

import java.util.Scanner;

public class UserInputReader {
    public int chooseMenuItem() {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter your choice ");
        int choice = inputReader.nextInt();
        return choice;
    }

    public String readStudentFirstName() {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter Student's First Name: ");
        String studentFirstName = inputReader.nextLine();
        return studentFirstName;

    }

    public String readStudentLastName() {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter Student's Last Name: ");
        String studentLastName = inputReader.nextLine();
        return studentLastName;

    }

    public int readStudentId() {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter Student Id: ");
        int studentId = inputReader.nextInt();
        return studentId;
    }

}
