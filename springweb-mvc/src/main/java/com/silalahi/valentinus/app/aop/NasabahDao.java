package com.silalahi.valentinus.app.aop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

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

	public void insertTransaksi() {
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		jt.execute("insert into rekening (nomor, nomor_nasabah, saldo) values ('111','123', 100000.00)");
		jt.execute(
				"insert into mutasi (nomor, nomor_rekening, waktu_transaksi, keterangan, debet, kredit) values ('001','222', now(), 'Setoran Awal', 100000.00,0)");
	}
}
