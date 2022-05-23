package com.studentmanagementsystem.presentation;

import com.studentmanagementsystem.data.list.*;
import com.studentmanagementsystem.logic.*;
import com.studentmanagementsystem.presentation.*;

public class Main {

    public static void main(String[] args)
        {
            final int ADD_STUDENT_MENU_ITEM = 1;
            final int UPDATE_STUDENT_MENU_ITEM = 2;
            final int REMOVE_STUDENT_MENU_ITEM = 3;
            final int SHOW_STUDENTS_MENU_ITEMS = 4;
            final int EXIT_MENU_ITEM = 5;
            final int NO_MENU_ITEM_SELECTED = 0;


            Menu menuItems = new Menu();
            StudentDAO studentDao = new ArrayListStudentDAO();
            UserInputReader inputReader = new UserInputReader();
            int chosenMenuItem = NO_MENU_ITEM_SELECTED;

            while (chosenMenuItem != EXIT_MENU_ITEM) {
                menuItems.show();
                chosenMenuItem = inputReader.chooseMenuItem();

                switch (chosenMenuItem) {
                    case ADD_STUDENT_MENU_ITEM:

                        String studentFirstName = inputReader.readStudentFirstName();
                        String studentLastName = inputReader.readStudentLastName();
                        int studentId = inputReader.readStudentId();

                        Student newStudent = new Student();
                        newStudent.setStudentFirstName(studentFirstName);
                        newStudent.setStudentLastName(studentLastName);
                        newStudent.setStudentId(studentId);
                        studentDao.add(newStudent);
                        break;

                    case UPDATE_STUDENT_MENU_ITEM:
                        for (Student currentStudent : studentDao.getAll()){
                            System.out.println(currentStudent);
                        }
                        System.out.print("Enter the StudentId whose record you want to update: ");
                        int updatingId = inputReader.readStudentId();
                        for (Student currentStudent : studentDao.getAll()){
                            if(currentStudent.getStudentId()==updatingId){

                                String studentUpdatedFirstName = inputReader.readStudentFirstName();
                                String studentUpdatedLastName = inputReader.readStudentLastName();
                                int studentUpdatedId = inputReader.readStudentId();

                               currentStudent.setStudentId(studentUpdatedId);
                               currentStudent.setStudentFirstName(studentUpdatedFirstName);
                               currentStudent.setStudentLastName(studentUpdatedLastName);
                            }
                        }
                        break;

                    case REMOVE_STUDENT_MENU_ITEM:
                        for (Student currentStudent : studentDao.getAll()) {
                            System.out.println(currentStudent);
                        }
                        System.out.print("Enter the StudentId whose record you want to update: ");
                        int removingId = inputReader.readStudentId();
                        for (Student currentStudent : studentDao.getAll()){
                            if(currentStudent.getStudentId()==removingId){
                                studentDao.remove(currentStudent);
                            }
                        }
                        break;

                    case SHOW_STUDENTS_MENU_ITEMS:
                        for (Student currentStudent : studentDao.getAll()) {
                            System.out.println(currentStudent);
                        }
                        break;

                }
            }

        }
}
