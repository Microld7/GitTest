package com.leo;

import java.io.Serializable;
import java.util.Objects;

/**
 * GitTest com.leo
 * 2024/10/3 20:48
 * @Author LD
 */
public class Student implements Serializable {
    private int age;
    private String name;
    private int status;

    private String fa; // fasdf


    public Student(String name, int age, int status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student)o;
        return age == student.age && status == student.status && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, status);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", status=" + status +
                '}';
    }
}
