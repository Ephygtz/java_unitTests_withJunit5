package com.healthycoderapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DietPlannerTest {
    private DietPlanner dietPlanner;

    @BeforeEach
    void setup(){
        this.dietPlanner= new DietPlanner(30, 20, 50);
    }

    @Test
    void should_ReturnCorrectDietPlan_when_CorrectCoder() {
        //given
        Coder coder = new Coder(1.82,75.0, 26,Gender.MALE);
        DietPlan expected = new DietPlan(2202, 110, 73, 275);
        //when
        DietPlan actual = dietPlanner.calculateDiet(coder);
        //then
        assertEquals(expected, actual); //use assertlequalsall to compare objects or arrays
    }
}