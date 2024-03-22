package com.controller;

import com.model.UserInt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {

    private UserController userController;
    private UserInt mockUser;

    @BeforeEach
    void setUp() {
        userController = new UserController();

        mockUser = mock(UserInt.class);

        userController.user = mockUser;
    }

    @Test
    void testLogInAndOut() {
        String id = "testUser";
        String password = "pass";

        userController.logOut();
        assertNull(userController.getUser(), "User should be null after logout");
    }

    @Test
    void testSetUp() {
        String id = "testUser";
        String password = "pass";
        String fName = "Test";
        String lName = "User";

        userController.setUp(id, password, fName, lName);
        verify(mockUser).add(anyString(), anyString(), anyString(), anyString());
    }

    @Test
    void testDelUser() {
        String password = "pass";
        when(mockUser.isPwValed(password)).thenReturn(true);
        userController.delUser(password);
        verify(mockUser).delUser();
        assertNull(userController.getUser(), "User should be null after delUser() if password is validated");
    }
}
