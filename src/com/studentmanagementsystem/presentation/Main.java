package com.studentmanagementsystem.presentation;

import com.studentmanagementsystem.data.list.*;
import com.studentmanagementsystem.logic.*;

public class Main {

    public static void main(String[] args)
        {


            Menu menuItems = new Menu();
            StudentDAO studentDao = new ArrayListStudentDAO();
            UserInputReader inputReader = new UserInputReader();
            int chosenMenuItem = menuItems.NO_MENU_ITEM_SELECTED;

            while (chosenMenuItem != menuItems.EXIT_MENU_ITEM) {
                menuItems.show();
                chosenMenuItem = inputReader.chooseMenuItem();

                switch (chosenMenuItem) {
                    case menuItems.ADD_STUDENT_MENU_ITEM:

                        String studentFirstName = inputReader.readStudentFirstName();
                        String studentLastName = inputReader.readStudentLastName();
                        int studentId = inputReader.readStudentId();

                        Student newStudent = new Student();
                        newStudent.setFirstName(studentFirstName);
                        newStudent.setLastName(studentLastName);
                        newStudent.setId(studentId);
                        studentDao.add(newStudent);
                        break;

                    case menuItems.UPDATE_STUDENT_MENU_ITEM:
                        for (Student currentStudent : studentDao.getAll()){
                            System.out.println(currentStudent);
                        }
                        System.out.print("Enter the StudentId whose record you want to update: ");
                        int idOfStudentToupdate = inputReader.readStudentId();
                        for (Student currentStudent : studentDao.getAll()){
                            if(currentStudent.getId()==idOfStudentToupdate){

                                String studentUpdatedFirstName = inputReader.readStudentFirstName();
                                String studentUpdatedLastName = inputReader.readStudentLastName();
                                int studentUpdatedId = inputReader.readStudentId();

                               currentStudent.setId(studentUpdatedId);
                               currentStudent.setFirstName(studentUpdatedFirstName);
                               currentStudent.setLastName(studentUpdatedLastName);
                            }
                        }
                        break;

                    case menuItems.REMOVE_STUDENT_MENU_ITEM:
                        for (Student currentStudent : studentDao.getAll()) {
                            System.out.println(currentStudent);
                        }
                        System.out.print("Enter the StudentId whose record you want to update: ");
                        int idOfStudentToRemove = inputReader.readStudentId();
                        for (Student currentStudent : studentDao.getAll()){
                            if(currentStudent.getId()==idOfStudentToRemove){
                                studentDao.remove(currentStudent);
                            }
                        }
                        break;

                    case menuItems.SHOW_STUDENTS_MENU_ITEMS:
                        for (Student currentStudent : studentDao.getAll()) {
                            System.out.println(currentStudent);
                        }
                        break;

                }
            }

        }
}
