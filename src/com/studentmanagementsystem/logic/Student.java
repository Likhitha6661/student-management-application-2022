package com.studentmanagementsystem.logic;

public class Student {
    private String firstName;
    private String lastName;
    private int id;


    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + firstName + "'" +
                ", studentLastName='" + lastName + "'" +
                ", studentId=" + id +
                '}';
    }


}
