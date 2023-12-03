package ed.admin.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ed.admin.server.dao.WelcomeDao;

@Service
public class WelcomeService {

	
@Autowired
WelcomeDao welcomeDao;
	 
	
	public String getMessage() {
		return welcomeDao.getMessage();//"Good Morning..";//welcomeService.getMessage();
	}
}
