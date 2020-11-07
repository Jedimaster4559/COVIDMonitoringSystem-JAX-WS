package com.covidmonitoring;

import org.junit.Assert;
import org.junit.Test;

/**
 * A quick unit test class to check our sanity that things are actually
 * working in a general perspective.
 *
 * @author Nathan Solomon
 */
public class ClientSanityTest {

    /**
     * Checks that two numbers are equal
     */
    @Test
    public void equalityTest(){
        Assert.assertEquals(3, 3);
    }
}
