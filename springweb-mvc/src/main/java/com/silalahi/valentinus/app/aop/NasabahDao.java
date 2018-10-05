package com.silalahi.valentinus.app.aop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class NasabahDao {
	private static final String SQL_INSERT = "insert into nasabah (nomor,nama,email) values (?,?,?)";

	@Autowired
	DataSource dataSource;

	public void insert(Nasabah n) {
		Connection conn;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(SQL_INSERT);
			ps.setString(1, n.getNomor());
			ps.setString(2, n.getNama());
			ps.setString(3, n.getEmail());
			ps.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
