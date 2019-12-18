//package com.profile.Resource;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockito.ArgumentMatchers.anyString;
//
//import java.util.stream.Stream;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.security.crypto.bcrypt.BCrypt;
//
//import com.profile.Repository.EmployeeReo;
//import com.profile.dto.EmployeeDto;
//import com.profile.serviceImpl.EmployeeServiceImpl;
//
//class EmployeeController {
//
//	@Autowired
//	private EmployeeServiceImpl service;
//
//	@MockBean
//	private EmployeeReo employeeReo;
//
//	
//	@Test
//	public void getEmpById() {
//		
//		EmployeeDto employee = new EmployeeDto();
//		//employee.setId(1);
//		employee.setFirstName("Reshma");
//		employee.setLastName("Walekar");
//		employee.setContact(996047219);
//		employee.setEmail("reshmawalekar123@gmail.com");
//		employee.setPassword(encodePass("Reshma"));
//		
//		
//		when(employeeReo.findById(anyInt())).thenReturn(employee);
//
//		assertNotNull(employeeObject);
//		assertEquals("Reshma", employeeObject.getFirstName());
//		assertEquals("Walekar", employeeObject.getLastName());
//	}
//	
//
//	public String encodePass(String plainPassword) {
//
//		String encryptedPassword = BCrypt.hashpw(plainPassword, BCrypt.gensalt(12));
//		System.out.println(encryptedPassword);
//
//		boolean matched = BCrypt.checkpw(plainPassword, encryptedPassword);
//		System.out.println(matched);
//
//		return encryptedPassword;
//	}
//
//}
