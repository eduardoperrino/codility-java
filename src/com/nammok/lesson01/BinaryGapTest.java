package com.nammok.lesson01;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BinaryGapTest {

    private BinaryGap binaryGap;

    @BeforeTest
    void setUp() {
        this.binaryGap = new BinaryGap();
    }

    @DataProvider(name = "test1")
    public Object [][] createData1() {
        return new Object[][] {
                new Object [] {          0,  0 },
                new Object [] {          9,  2 },
                new Object [] {         15,  0 },
                new Object [] {         32,  0 },
                new Object [] {        529,  4 },
                new Object [] {       1041,  5 },
                new Object [] {      65536,  0 },
                new Object [] {      65537, 15 },
                new Object [] {     100000,  4 },
                new Object [] {    2147483,  5 },
                new Object [] { 2147483637,  1 }, //max - 10
                new Object [] { 2147483646,  0 }, //max - 1
                new Object [] { 2147483647,  0 }
        };
    }

    @Test(dataProvider = "test1")
    public void verifySolution(int N, int expectedBinaryGap) {
        Assert.assertEquals(binaryGap.solution(N), expectedBinaryGap);
    }


}