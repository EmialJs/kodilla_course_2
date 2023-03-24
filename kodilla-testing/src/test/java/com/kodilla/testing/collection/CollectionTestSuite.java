package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("CollectionTestSuite")
public class CollectionTestSuite {

    private OddNumbersExterminator oddNumbersExterminator;
    private List<Integer> emptyList;
    private List<Integer> normalList;

    @BeforeEach
    public void beforeEach() {
        System.out.println("Starting a new test");
        oddNumbersExterminator = new OddNumbersExterminator();
        emptyList = new ArrayList<>();
        normalList = Arrays.asList(1, 2, 3, 4, 5, 6);
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Finished a test\n");
    }

    @Test
    @DisplayName("should return empty list for empty input")
    public void testOddNumbersExterminatorEmptyList() {
        // when
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);

        // then
        assertEquals(0, result.size());
    }

    @Test
    @DisplayName("should return list without odd numbers")
    public void testOddNumbersExterminatorNormalList() {
        // when
        List<Integer> result = oddNumbersExterminator.exterminate(normalList);

        // then
        List<Integer> expectedList = Arrays.asList(2, 4, 6);
        assertEquals(expectedList, result);
    }
}
