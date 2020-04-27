package com.nammok.lesson01;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TapeEquilibriumTest {

    private TapeEquilibrium solution;

    @BeforeTest
    public void setUp() {
        solution = new TapeEquilibrium();
    }

    @DataProvider(name = "test1")
    public Object [][] createData1() {
        return new Object [][] {
                new Object [] { new int [] {  3,    1,    2,    4,   3 }, 1 },
                new Object [] { new int [] { -3,    1,    2,   -4,   3 }, 1 },
                new Object [] { new int [] {        5,    2,    7,  10 }, 4 },
                new Object [] { new int [] {    -1000, 1000, -500, 990 }, 490 },
                new Object [] { new int [] {                    1,   2 }, 1 },
                new Object [] { new int [] {                  100, -25 }, 125 },
        };
    }

    @Test(dataProvider = "test1")
    public void verifySolution(int [] pA, int pExpectedMissingValue) {
        Assert.assertEquals(solution.solution(pA), pExpectedMissingValue);
    }
}