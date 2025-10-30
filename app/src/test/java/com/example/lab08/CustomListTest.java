package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDelCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.delCity(calgary);
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0,list.countCities());
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertEquals(1,list.countCities());
        City vancouver = new City("Vancouver", "BC");
        list.addCity(vancouver);
        assertEquals(2,list.countCities());
    }
}
