package com.example.example;

/**
 * @Author ws
 * @create 2023/3/8 18:03
 * @Description
 */
@CustomDescription(description="学生")
public class Student extends Person{
    private String StudentId;

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }
}
