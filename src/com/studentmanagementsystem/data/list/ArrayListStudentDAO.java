package com.studentmanagementsystem.data.list;

import com.studentmanagementsystem.logic.Student;
import com.studentmanagementsystem.logic.StudentDAO;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class ArrayListStudentDAO implements StudentDAO {
    ArrayList<Student> students;


    public ArrayListStudentDAO() {
        students = new ArrayList<>();
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public ArrayList<Student> getAll() {
        return new ArrayList<>(students);
    }
    @Override
    public void remove(Student student){
        students.remove(student);
    }

 }
