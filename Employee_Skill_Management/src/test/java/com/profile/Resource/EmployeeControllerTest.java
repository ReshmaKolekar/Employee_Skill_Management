//package com.profile.Resource;
//
//import static org.mockito.ArgumentMatchers.anyInt;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.hamcrest.Matchers;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.profile.dto.EmployeeDto;
//import com.profile.serviceImpl.EmployeeServiceImpl;
//
//class EmployeeControllerTest {
//
//	
//	MockMvc mockMvc;
//	
//	@InjectMocks
//	EmployeeController empController;
//	
//	@Mock
//	EmployeeServiceImpl empService;
//	
////	@BeforeEach
////	void setUp() {
////		System.out.println("entered");
////		 mockMvc = MockMvcBuilders.standaloneSetup(empController)
////	                .build();
////		 System.out.println(mockMvc);
////	}
//
//	
//	
//	@Disabled
//	@Test
//	void testAddEmp() throws Exception {
//		String json = "{\n" +
//                "  \"firstName\": \"Nilesh\",\n" +
//                "  \"lastName\": \"Solankar\"\n" +
//                "  \"salary\": \"50000\"\n" +
//                "}";
//        mockMvc.perform(post("/add")
//                .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.firstName", Matchers.is("Nilesh")))
//                .andExpect(jsonPath("$.lastName", Matchers.is("Solankar")))
//                .andExpect(jsonPath("$.salary", Matchers.is("50000")));
//	}
//
////	@Test
////	@Disabled
////	void testGetEmpByID() throws Exception {
////		
////		EmployeeDto employee=new EmployeeDto();
////		employee.setId(1);
////		employee.setFirstName("Nilesh");
////		employee.setLastName("Solankar");
////		employee.setSalary(50000);
////		
////		when(empService.getEmpByID(anyInt())).thenReturn(employee);
////
////        mockMvc.perform(get("/empbyID/{id}"))
////                .andExpect(status().isOk())
////                .andExpect(jsonPath("$.firstName", Matchers.is("Nilesh")))
////                .andExpect(jsonPath("$.lastName", Matchers.is("Solankar")))
////                .andExpect(jsonPath("$.salary", Matchers.is("50000")));
////
////        verify(empService).getEmpByID(2);
////	}
//	
//	 @Test
//	    public void testHelloWorld() throws Exception {
//
//	        
//
//	        mockMvc.perform(get("/hello"))
//	                .andExpect(status().isOk())
//	                .andExpect(content().string("hello"));
//
//	      
//	    }
//	
//
//}
