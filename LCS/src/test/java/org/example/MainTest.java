package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void teste () {
        Main main = new Main();
        assertEquals(1, main.teste());
    }
}
