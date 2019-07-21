package pack1.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack1.dao.TestDao;

@Service
public class DemoBean 
{
	@Autowired
	private TestDao testDao;
	 public void bm()
	 {
		 testDao.inserBatch();
	 }

}
