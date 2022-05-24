package com.studentmanagementsystem.logic;

import java.util.ArrayList;
import java.util.List;

public interface StudentDAO {
    void add(Student student);
    ArrayList<Student> getAll();
    void remove(Student student);
}
