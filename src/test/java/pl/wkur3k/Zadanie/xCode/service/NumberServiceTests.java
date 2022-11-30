package pl.wkur3k.Zadanie.xCode.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.wkur3k.Zadanie.xCode.dto.SortArrayDto;
import pl.wkur3k.Zadanie.xCode.exception.NullPointerInArrayException;
import pl.wkur3k.Zadanie.xCode.model.SortOrder;

public class NumberServiceTests {
    NumbersServiceImpl numbersService;
    SortArrayDto testCase;

    @BeforeEach
    void setUp(){
        numbersService = new NumbersServiceImpl();
        testCase = new SortArrayDto();
        testCase.setOrder(SortOrder.ASC);
    }

    @Test
    @DisplayName("Should return null when given array is null")
    public void returnEmptyArrayWhenGivenArrayIsNull(){
        testCase.setNumbers(null);
        Assertions.assertArrayEquals(null, numbersService.sortArray(testCase).getNumbers(),
                "sortArray method should return null when given null");
    }
    @Test
    @DisplayName("Length of arrays should be the same")
    public void sizeOfArraysIsSame(){
        testCase.setNumbers(new Integer[]{3,2,1});
        Assertions.assertTrue(testCase.getNumbers().length==numbersService.sortArray(testCase).getNumbers().length);
    }
    @Test
    @DisplayName("When element of array is null throw an exception")
    public void nullElementThrowsException(){
        testCase.setNumbers(new Integer[]{1,2,null,3});
        Assertions.assertThrowsExactly(NullPointerInArrayException.class, () -> numbersService.sortArray(testCase));
    }
}
