/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.nguyenhaiha.mathutil.main;

import com.nguyenhaiha.mathutil.core.MathUtility;

/**
 *
 * @author thanl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TEST CASE #1 - 
        int n = 0;//given n = 0, ý là muốn tính 0!
        long expected = 1; //ý muốn là làm ra n! = 0! phải trả về 1
        long actual = MathUtility.getFactorial(n); //ý nói rằng hàm chyaj ra mấy, invoke, call
        System.out.println(n + "! -> expected: " + expected + " | actual = " +actual);
        //so sánh giữa expected - actual
        
        //TEST CASE #2 - 
        n = 1;//given n = 0, ý là muốn tính 0!
        expected = 1; //ý muốn là làm ra n! = 0! phải trả về 1
        actual = MathUtility.getFactorial(n); //ý nói rằng hàm chyaj ra mấy, invoke, call
        System.out.println(n + "! -> expected: " + expected + " | actual = " +actual);
        
        //TEST CASE #3 - 
        n = 5;//given n = 0, ý là muốn tính 0!
        expected = 120; //ý muốn là làm ra n! = 0! phải trả về 1
        
        System.out.println("5! -> expected: " + 120 + " | actual = " +MathUtility.getFactorial(5));
    }
    
   
    
}

