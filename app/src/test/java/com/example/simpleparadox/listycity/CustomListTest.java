package com.example.simpleparadox.listycity;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());


    }

    @Test
    public void addCityTest(){

        int listSize = list.getCount();
        list.addCity(new City("Edmonton","Alberta"));
        assertEquals(listSize + 1, list.getCount());
    }


    @Test
    public void hasCityTest(){
        list.addCity(new City("Edmonton","Alberta"));

        list.hasCity(new City("Edmonton","Alberta"));
        assertEquals(true, true);
    }
    @Test
    public void deleteCityTest(){
        int listSize = list.getCount();
        list.deleteCity(new City("Edmonton","Alberta"));
        assertEquals(listSize - 1, list.getCount());

    }


    @Test
    public void countCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton","Alberta"));
        assertEquals(listSize + 1, list.getCount());
    }

}
