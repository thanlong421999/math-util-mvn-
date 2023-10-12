/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyenhaiha.mathutil.core;

/**
 *
 * @author thanl
 */
//class này sẽ chứa 1 loạt các hàm static dùng để làm thư viện
//cho các nơi khác/class khác xài!!!
public class MathUtility {

    public static final double PI = 3.14;

    //hàm tính n! = 1.2.3.nnn
    //n! tăng rất nhanh, 20! vừa đủ full kiểu long 18 con số 0
    //q uocs <0! và >20! ném ngoại lệ, ko tính đc
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
}
