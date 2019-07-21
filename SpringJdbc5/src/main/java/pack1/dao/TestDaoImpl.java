package pack1.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao 
{
	@Autowired
	private JdbcTemplate jt;

	public void inserBatch() 
	{
		Object[] obj1= {11,"AA"};
		Object[] obj2= {22,"BB"};
		Object[] obj3= {33,"CC"};
		List <Object[]> list=new ArrayList<Object[]>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		int k[]=jt.batchUpdate("insert into Test values(?,?)",list);
		System.out.println("Batch executed");
		

	}

}
