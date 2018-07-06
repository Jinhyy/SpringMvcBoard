package com.jh.spring_board_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.jh.spring_board_dto.JDto;

public class JDao {
	DataSource dataSource;
	
	public void write(String jName, String jTitle, String jContent)
	{
		
	}
	public JDao()
	{
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		}
		catch (NamingException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<JDto> list() {
		// DB에 데이터 요청,접근
		ArrayList<JDto> dtos = new ArrayList<JDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select jId,jHit,jGroup,jStep,jIndent,jName, jTitle, jContent, jDate from mvc_board order by jGroup desc, jStep asc";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				int jId = resultSet.getInt("jId");
				int jHit = resultSet.getInt("jHit");
				int jGroup = resultSet.getInt("jGroup");
				int jStep = resultSet.getInt("jStep");
				int jIndent = resultSet.getInt("jIndent");
				String jName = resultSet.getString("jName");
				String jTitle = resultSet.getString("jTitle");
				String jContent = resultSet.getString("jContent");
				Timestamp jDate = resultSet.getTimestamp("jDate");
				
				JDto dto = new JDto(jId, jHit, jGroup, jStep, jIndent, jName, jTitle, jContent, jDate);
				dtos.add(dto);
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
			if(resultSet!=null) resultSet.close();
			if(preparedStatement!=null) preparedStatement.close();
			if(connection!=null) connection.close();
			}
		    catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}
}

