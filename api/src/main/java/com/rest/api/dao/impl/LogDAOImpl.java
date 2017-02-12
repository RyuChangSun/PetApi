package com.rest.api.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rest.api.dao.LogDAO;
import com.rest.api.model.Log;

@Repository("logDao")
public class LogDAOImpl implements LogDAO {

	@Autowired
	@Resource(name="sqlSessionLog")
    private SqlSession sqlSessionLog;

    public void setSqlSession(SqlSession sqlSession){
        this.sqlSessionLog = sqlSession;
    }

    @Override
    public List<Log> getLogList() {
    	return sqlSessionLog.selectList("getLogList");
    }

	public int writeLog(Log log)
	{
    	return sqlSessionLog.insert("writeLog", log);
	}
}
