package com.teamnexters.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.teamnexters.mapper.MemberMapper;

@Component
public class MemberDAO implements MemberMapper {
    protected Log log = LogFactory.getLog(MemberDAO.class);
     
    @Autowired
    private SqlSession sqlsession;
     
    public Object searchMember(Object params){
    	return sqlsession.selectOne("searchMember", params);
    }
    
    public Object getMemberList(Object params) {
    	return sqlsession.selectList("getMemberList", params);
    }
    
    public Object searchByUserName(String strUserName){
    	System.out.println("strUserName::"+strUserName);
    	System.out.println("sqlSession::"+sqlsession);
    	return sqlsession.selectOne("searchByUserName", strUserName);
    }
    public Object searchUserTag(String str){
    	
    	return sqlsession.selectList("userTag",str);
    }
}

