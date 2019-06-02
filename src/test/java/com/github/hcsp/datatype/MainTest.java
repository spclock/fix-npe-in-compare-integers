package com.github.hcsp.datatype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void test() throws NoSuchMethodException {
        assertEquals(false, Main.compare(123, 456));
        assertEquals(true, Main.compare(123, 123));
        assertEquals(false, Main.compare(123, null));
        Main.class.getDeclaredMethod("compare", int.class, Integer.class);
    }
}
