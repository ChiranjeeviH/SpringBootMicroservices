package com.springboot.microservices.userregistrationtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.springboot.microservices.userregistration.RoleRepository;
import com.springboot.microservices.userregistration.UserRepository;
import com.springboot.microservices.userregistration.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {
	
	@Mock private UserRepository userRepository;
	@Mock private RoleRepository roleRepository;
	@Mock private PasswordEncoder passwordEncoder;
	
	private UserServiceImpl userServiceImpl;
	 
	
	@BeforeEach void setUp()
    {
        this.userServiceImpl
            = new UserServiceImpl(this.userRepository,this.roleRepository,this.passwordEncoder);
    }
	
	@Test
	void findAllUsers() {
		userServiceImpl.findAllUsers();
		Mockito.verify(userRepository).findAll();
	}

}
