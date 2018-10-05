package com.silalahi.valentinus.oop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class NasabahDao {
	private String dbDriver;
	private String dbUrl;
	private String dbUsername;
	private String dbPassword;

	private static final String SQL_INSERT = "insert into nasabah(nomor, nama, email) values (?,?,?)";

	private Connection koneksiDB;

	public NasabahDao(String dbDriver, String dbUrl, String dbUsername, String dbPassword) {
		super();
		this.dbDriver = dbDriver;
		this.dbUrl = dbUrl;
		this.dbUsername = dbUsername;
		this.dbPassword = dbPassword;
	}

	public void connect() {
		try {
			koneksiDB = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void disConnect() {
		if (koneksiDB != null) {
			try {
				koneksiDB.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void save(Nasabah n) {
		try {
			koneksiDB.setAutoCommit(false);
			PreparedStatement ps = koneksiDB.prepareStatement(SQL_INSERT);
			ps.setString(1, n.getNomor());
			ps.setString(2, n.getNama());
			ps.setString(3, n.getEmail());
			ps.executeUpdate();
			koneksiDB.commit();
			koneksiDB.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				koneksiDB.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public List<Nasabah> showAllNasabah() {
		return null;
	}
}
