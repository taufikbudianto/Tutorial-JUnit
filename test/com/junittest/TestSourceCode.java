/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junittest;

import com.taufik.tdd.TestJunit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Taufik AB
 */
public class TestSourceCode {

    private TestJunit testing;

    @Before
    public void setUp() {
        testing = new TestJunit();
    }

    @Test
    public void testAdder() {
        long result = 4 + 3 + 3 + (-3);
        assertEquals(result, testing.adder(4, 3, 3, -3));

        result = 100 + 100;
        assertEquals(result, testing.adder(100, 100));
    }

    @Test
    public void testSubstraction() {
        long result = 4 - 3 - 3 - (-3);
        assertEquals(result, testing.substraction(4, 3, 3, -3));

        result = 100 - 100;
        assertEquals(result, testing.substraction(100, 100));
    }
}
