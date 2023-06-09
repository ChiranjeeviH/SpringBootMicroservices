package com.springboot.microservices.userregistrationtest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.springboot.microservices.userregistration.AuthController;
import com.springboot.microservices.userregistration.UserService;



@WebMvcTest(controllers = AuthController.class)
public class AuthControllerTest {
	
	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
	private UserService userService;
	
	 @Test
     public void testLoginAPI() throws Exception {
         
			this.mockMvc.perform(get("/login").accept(MediaType.APPLICATION_JSON)).andDo(print())
					.andExpect(status().isOk());
    }

	

}
