package com.example.areacalc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AreaCalcApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void AreaCalc_Area_Test()
    {
        // Arrange
        String expected = "choose form: circle/rectangle/square and enter radius/a+b/a";

        // Act

        String message = AreaCalc.index();

        // Assert
        assertEquals(expected, message);
    }

    @Test
    void AreaOutput_Test_Square()
    {
        // Arrange
        double expected = 100.0;

        // Act
        double result = AreaOutput.area("square",10);

        // Assert
        assertEquals(expected, result);
    }

     @Test
    void AreaOutput_Test_Circle()
    {
        // Arrange
        double expected = 12.566370614359172;

        // Act
        double result = AreaOutput.area("circle",2);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    void AreaOutput_Test_Rectangle()
    {
        // Arrange
        double expected = 20.0;

        // Act
        double result = AreaOutput.area("rectangle",10,2);

        // Assert
        assertEquals(expected, result);
    }

}
