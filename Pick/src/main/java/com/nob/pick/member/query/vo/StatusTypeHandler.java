package com.nob.pick.member.query.vo;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StatusTypeHandler implements TypeHandler<Status> {
	@Override
	public void setParameter(PreparedStatement ps, int i, Status parameter, JdbcType jdbcType) throws SQLException {
		if (parameter != null) {
			ps.setInt(i, parameter.getValue());
		} else {
			ps.setNull(i, JdbcType.INTEGER.TYPE_CODE);
		}
	}

	@Override
	public Status getResult(ResultSet rs, String columnName) throws SQLException {
		int value = rs.getInt(columnName);
		for (Status status : Status.values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}

	@Override
	public Status getResult(ResultSet rs, int columnIndex) throws SQLException {
		int value = rs.getInt(columnIndex);
		for (Status status : Status.values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}

	@Override
	public Status getResult(CallableStatement cs, int columnIndex) throws SQLException {
		int value = cs.getInt(columnIndex);
		for (Status status : Status.values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}
}