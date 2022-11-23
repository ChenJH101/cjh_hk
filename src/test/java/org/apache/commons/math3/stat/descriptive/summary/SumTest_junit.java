package org.apache.commons.math3.stat.descriptive.summary;

import junit.framework.TestCase;

public class SumTest_junit extends TestCase {
    Sum s = new Sum();
    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testIncrement() {
        s.increment(1);
        assertEquals(1,s.getN());
    }
}