package com.teamnexters.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecordBooksColumnDAO {

	protected Log log = LogFactory.getLog(MemberAuthDAO.class);

	@Autowired
	private SqlSession sqlsession;

	public void insertDate(Object param){
		sqlsession.insert("insertDate",param);
	}
	public Object getDateList(Object param){
		return sqlsession.selectList("getDateList",param);
	}
	
	public void deleteDateColumn(Object param){
		sqlsession.delete("deleteDateColumn",param);
	}
	
	public Object getAttendenceCount(){
		return sqlsession.selectList("getAttendenceCount");
	}
}
