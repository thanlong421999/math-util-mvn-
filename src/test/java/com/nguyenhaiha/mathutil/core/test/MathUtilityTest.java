/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nguyenhaiha.mathutil.core.test;

import com.nguyenhaiha.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thanl
 */
public class MathUtilityTest {

    //Test Case#1 - Verify getFactorial(with n =0)
    //Steps/Procedures
    //  1.Given n = 0
    //  2.Call/ivoke getFactorial(with n = 0)
    //Exxpected Result:
    //      The method must return 1 as the result of 0! = 1
    //Status: Passed | Failed chờ đến lúc runtime mới biết
    @Test
    public void verifyFactorialGivenRIghtArgument0ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(0));
    }
    @Test
    public void verifyFactorialGivenRIghtArgument1ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
    @Test
    public void verifyFactorialGivenRIghtArgument5ReturnOk() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
}
