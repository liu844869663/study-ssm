package com.fullmoon.study;

import com.fullmoon.study.model.Num;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author jingping.liu
 * @Date 2019-09-19
 * @Description TODO
 */
public class Test implements TypeHandler<Num> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Num num, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public Num getResult(ResultSet resultSet, String s) throws SQLException {
        return null;
    }

    @Override
    public Num getResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public Num getResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
