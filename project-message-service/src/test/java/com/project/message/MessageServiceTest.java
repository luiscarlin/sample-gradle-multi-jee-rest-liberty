package com.project.message;

import com.project.message.MessageService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageServiceTest {
    @Test
    public void shouldReturnHelloWorldAsMessage() {
        MessageService messageService = new MessageService();

        assertEquals("Hello World", messageService.getMessage());
    }
}
