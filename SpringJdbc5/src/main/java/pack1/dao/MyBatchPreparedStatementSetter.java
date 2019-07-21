package pack1.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;

public class MyBatchPreparedStatementSetter implements BatchPreparedStatementSetter
{
	ArrayList alist1=new ArrayList();
	ArrayList alist2=new ArrayList();
	public MyBatchPreparedStatementSetter()
	{
		alist1.add(1);
		alist1.add(2);
		alist1.add(3);
		
		alist2.add("A");
		alist2.add("B");
		alist2.add("C");
	}
	public int getBatchSize()
	{
		return 3;
	}
    public void setValues(PreparedStatement pstmt,int i) throws SQLException
    {
    	pstmt.setInt(1, Integer.parseInt(alist1.get(i).toString()));
    	pstmt.setString(2, alist2.get(i).toString());
    }
}
