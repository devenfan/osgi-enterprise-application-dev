package com.csdn.osgi.user;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

public class UserDao {
	
	SqlSession sqlSession;
	
	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public void start(){
	
		System.out.println("UserDao start function...");
		HashMap userInfoMap = new HashMap();
		userInfoMap.put("UserName", "Jack");
		userInfoMap.put("Password", "Jack");
		//sqlSession.insert("user.saveUser",userInfoMap);
	}
	
	
	
}
