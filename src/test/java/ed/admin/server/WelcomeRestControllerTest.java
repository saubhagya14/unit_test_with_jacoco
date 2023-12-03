package ed.admin.server;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import ed.admin.server.controller.WelcomeController;
import ed.admin.server.service.WelcomeService;

@WebMvcTest(value = WelcomeController.class)
public class WelcomeRestControllerTest {

	@MockBean
	private  WelcomeService welcomeService;
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void testWelcomeMessage() throws Exception{
		//define mock object behaviour
		when(welcomeService.getMessage()).thenReturn("Welcome to my application");
		// prepare http get request
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome");
		//send request and hold response
		ResultActions mvcResult =   mockMvc.perform(requestBuilder);
		//validate response
		MockHttpServletResponse response = mvcResult.andReturn().getResponse();
		int status = response.getStatus();
		assertEquals(200, status);
	}
	
}
