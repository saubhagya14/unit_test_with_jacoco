package ed.admin.server;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import ed.admin.server.dao.WelcomeDao;
import ed.admin.server.service.WelcomeService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class WelcomeServiceTest {

	@MockBean
	WelcomeDao welcomeDao;
	
	@InjectMocks
	private WelcomeService welcomeService;

	@Test
	public void testGetGreetTestMsg() {
		when(welcomeDao.getMessage()).thenReturn("Good Night");
		String greetMessage = welcomeService.getMessage();
		assertNotNull(greetMessage);
	}
	
}
