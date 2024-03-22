package com.controller;

import com.model.UserInt;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class UserControllerTest {

    private UserController controller = new UserController();
    private UserInt mockUser = mock(UserInt.class);

    @Test
    void testSetUp() {
        controller.setUp("123", 'p', "John", "Doe");
        verify(mockUser, times(1)).add("123", 'p', "John", "Doe");
    }

    @Test
    void testDelUser() {
        when(mockUser.isPwValed('p')).thenReturn(true);
        controller.delUser('p');
        verify(mockUser, times(1)).delUser();
    }
}
