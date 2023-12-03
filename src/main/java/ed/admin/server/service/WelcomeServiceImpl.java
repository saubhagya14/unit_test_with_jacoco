package ed.admin.server.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ed.admin.server.dao.WelcomeDao;

@Repository
public class WelcomeServiceImpl implements WelcomeDao {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Good Morning...";
	}

}
