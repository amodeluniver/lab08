/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08_1;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        for(int f = 0; f <= 150; f += 10) {
            System.out.println(f + " degrees Fahrenheit is " + ((f - 32) * 5 / 9) + " degrees Celsius");
            System.out.println(f + " degrees Fahrenheit is " + ((f - 32) * 5 / 9) + " degrees Celsius");
        }
        // method to sum 2 numbers
        System.out.println(sum(5, 10));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
