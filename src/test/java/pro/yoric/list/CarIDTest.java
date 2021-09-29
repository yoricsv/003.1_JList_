package pro.yoric.list;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class CarIDTest
{
    @BeforeAll
    static void initAll()
    {
    }

    @BeforeEach
    void init()
    {
    }

    @Test
    void succeedingTest()
    {
    }

    @Test
    @Disabled("NOT PREPARED IT YET")
    void failingTest()
    {
        fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest()
    {
        // not executed
    }

    @Test
    void abortedTest()
    {
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    @AfterEach
    void tearDown()
    {
    }

    @AfterAll
    static void tearDownAll()
    {
    }

    @Test
    void test_CarID()
    {
        CarID car1 = new CarID("5612AA-7");
        CarID car2 = new CarID("5482ZZ-0");
        CarID car3 = new CarID("6852GS-2");
        CarID car4 = new CarID("9988II-6");
        CarID car5 = new CarID("1154KX-3");

    }
}