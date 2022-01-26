package org.launchcode.java.demos.lsn6inheritance.Test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;
import static org.junit.Assert.*;

public class HouseCatTest {

    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals("should inherit the parent's constructor", 7, keyboardCat.getWeight(), 0.001);
    }

}
