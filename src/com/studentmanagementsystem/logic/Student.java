package com.studentmanagementsystem.logic;
import com.studentmanagementsystem.data.list.ArrayListStudentDAO;

public class Student {
    private String studentFirstName;
    private String studentLastName;
    private int studentId;


    public String getStudentLastName() { return studentLastName; }

    public void setStudentLastName(String studentLastName) { this.studentLastName = studentLastName; }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + "'" +
                ", studentLastName='" + studentLastName + "'" +
                ", studentId=" + studentId +
                '}';
    }


}
