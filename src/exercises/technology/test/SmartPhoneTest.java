package exercises.technology.test;

import exercises.technology.Laptop;
import exercises.technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SmartPhoneTest {

    SmartPhone test_smartPhone;

    @Before
    public void setObject() {
        test_smartPhone = new SmartPhone("A11 Bionic x64", "3 GB", "64 GB", "130958616534");
        test_smartPhone.setUniquId("XBHAX8311397095");
    }

    @Test
    public void setNumberGetCorrectNumber() {
        assertEquals("should set number" ,"130958616534", test_smartPhone.getNumber());
    }

    @Test
    public void onlyUniqueID() {
        test_smartPhone.setUniquId("XBHAX8311397095");
        assertNotEquals("should not have repeated ID", test_smartPhone.getUniquId(), "XBHAX8311397095");

    }
}
