/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hd
 */
public class Utils {
    public String getText() {
        return "Test12355ddd55";
    }
    
    public List<Student> getStudent() {
        List<Student> students = new ArrayList<>();
        
        students.add(new Student(1, "John Smith"));
        students.add(new Student(2, "George Whey"));
        students.add(new Student(3, "Andrew Clark"));
        
        return students;
    }
}
