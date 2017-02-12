package com.rest.api.dao;

import java.util.List;

import com.rest.api.model.Log;

public interface LogDAO {

    public List<Log> getLogList();
	public int writeLog(Log log);
}
