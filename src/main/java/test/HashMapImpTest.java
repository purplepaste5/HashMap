package test;

import HashMap.HashMapImp;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HashMapImpTest {

    HashMapImp hashMapImp;

    @BeforeEach
    public void setup() {
        hashMapImp = new HashMapImp();
    }

    @Test
    public void testHashMapAddSingleObject() {
        String theReturn = (String) hashMapImp.add("test", "testResult");

        assertEquals("testResult", theReturn);
    }

    @Test
    public void testHashMapSimpleGet() {
        hashMapImp.add("test", "testResult");

        assertEquals("testResult", hashMapImp.get("test"));
    }

}
