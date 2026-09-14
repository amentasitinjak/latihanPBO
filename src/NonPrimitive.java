/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class Demo {
    int a, b;
    Demo(int a, int b) { this.a = a; this.b = b; }
    int addition() { return a + b; }
}

public class NonPrimitive {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Java");
        System.out.println(s1 + " "+ s2);

        Demo d = new Demo(5, 10);
        System.out.println("Hasil Demo Addition: " + d.addition());

        int[] arr = {1, 2, 3};
        double[] arr2 = {1.1, 2.2};
        System.out.println("Panjang arr: " + arr.length + ", Panjang arr2: " + arr2.length);
    }
}
