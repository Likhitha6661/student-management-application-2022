package com.studentmanagementsystem.presentation;

import java.sql.SQLOutput;

public class Menu {

    final int ADD_STUDENT_MENU_ITEM = 1;
    final int UPDATE_STUDENT_MENU_ITEM = 2;
    final int REMOVE_STUDENT_MENU_ITEM = 3;
    final int SHOW_STUDENTS_MENU_ITEMS = 4;
    final int EXIT_MENU_ITEM = 5;
    final int NO_MENU_ITEM_SELECTED = 0;

    public void show(){
        System.out.println("Available Menu Items");
        System.out.println("1: Add a Student ");
        System.out.println("2. Update a Student ");
        System.out.println("3. Remove a Student");
        System.out.println("4. Show all Students");
        System.out.println("Exit");
    }
}
