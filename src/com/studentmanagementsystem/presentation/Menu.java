package com.studentmanagementsystem.presentation;

import java.sql.SQLOutput;

public class Menu {

    public static final int ADD_STUDENT_MENU_ITEM = 1;
    public static final int UPDATE_STUDENT_MENU_ITEM = 2;
    public static final int REMOVE_STUDENT_MENU_ITEM = 3;
    public static final int SHOW_STUDENTS_MENU_ITEMS = 4;
    public static final int EXIT_MENU_ITEM = 5;
    public static final int NO_MENU_ITEM_SELECTED = 0;

    public void show(){
        System.out.println("Available Menu Items");
        System.out.println("1: Add a Student ");
        System.out.println("2. Update a Student ");
        System.out.println("3. Remove a Student");
        System.out.println("4. Show all Students");
        System.out.println("Exit");
    }
}
