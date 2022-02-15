package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;


public class TriangleTest {

    Logger logger = LoggerFactory.getLogger("Unit test's");


    @Test
    @DisplayName("Тест 1: проверка формулы")
    void test1() throws InvalidTriangleException, DegenerateTriangleException {
        logger.info("Тест 1: проверка формулы");
        assertFalse(HeronTriangle.getSquare(2,3,3)==0);
        logger.info("Тест успешен");
    }
    @ParameterizedTest
    @CsvSource({"2,3,3,2.828427124761903","2,5,4,3.799671038392666","3,3,5,4.14578099794425"})
    @DisplayName("Тест 2: проверка вычисления площади")
    void test2(int a, int b, int c, double d) throws InvalidTriangleException, DegenerateTriangleException {
        logger.info("Тест 2: проверка вычисления площади");
        logger.info("\tВходящие параметры - (a,b,c) - " +a+", "+b+", "+c);
        assertEquals(HeronTriangle.getSquare(a,b,c),d);
        logger.info("\tТест успешен");
    }

}

