/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deserialization;

/**
 *
 * @author ASUS
 */
import java.io.Serializable;

class Student implements Serializable {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}