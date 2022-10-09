package com.aws.nwcd.devops.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc

class UserServiceTest {

    @MockBean
    private UserService userService;
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testNotNull() {
        Assertions.assertThat(userService).isNotNull();
    }

    @Test
    public void testFindUserName() throws Exception {
        Mockito.when(userService.findUserName("devops")).thenReturn("devops");
        //test
//        mockMvc.perform(MockMvcRequestBuilders.get("/finduser",String.class))
//                .andDo(MockMvcResultHandlers.print())
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().string("Mock hello"));
    }

}