package com.teamnexters.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecordBooksValueDAO {
	protected Log log = LogFactory.getLog(MemberAuthDAO.class);

	@Autowired
	private SqlSession sqlsession;
	
	public void insertBooksValue(Object param){
		sqlsession.insert("insertBooksValue",param);
	}
}
