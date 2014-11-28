package com.baobaotao.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.baobaotao.dao.LoginLogDao;
import com.baobaotao.domain.LoginLog;

@Repository
public class LoginLogDaoImpl implements LoginLogDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insertLoginLog(LoginLog loginLog) {
		String sqlStr = "INSERT INTO t_login_log(user_id,ip,login_datetime) "
				+ "VALUES(?,?,?)";
		Object[] args = { loginLog.getUserId(), loginLog.getIp(),
				loginLog.getLoginDate() };
		jdbcTemplate.update(sqlStr, args);
	}

}
