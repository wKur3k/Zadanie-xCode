package pl.wkur3k.Zadanie.xCode.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StatusServiceTests {

    StatusServiceImpl statusService;

    @BeforeEach
    void setUp(){
        statusService = new StatusServiceImpl();
    }

    @Test
    @DisplayName("pong should return pong")
    public void pongReturnsStringPing(){
        Assertions.assertEquals("pong", statusService.pong(),
                "pong method should return 'pong'");
    }
}
