package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class LoginServiceTest {

    //verifying
    @Test
    void testLoginWithMock(){

        AuthAPI authMock = mock(AuthAPI.class);

        when(authMock.authenticate("john","1234")).thenReturn(true);

        LoginService loginService = new LoginService(authMock);
        boolean result = loginService.login("john","1234");
        assertTrue(result);
        verify(authMock,times(1)).authenticate("john","1234");
    }

}







