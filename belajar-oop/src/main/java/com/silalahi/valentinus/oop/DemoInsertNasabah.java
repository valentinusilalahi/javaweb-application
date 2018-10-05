package com.silalahi.valentinus.oop;

public class DemoInsertNasabah {
	public static void main(String[] args) {

		// variable koneksi database
		String dbDriver = "org.postgresql.Driver";
		String dbUrl = "jdbc:postgresql://localhost/javawebapp";
		String dbUser = "valentinus";
		String dbPassword = "admin1!";

		// DTO untuk Nasabah
		NasabahDao dbNasabah = new NasabahDao(dbDriver, dbUrl, dbUser, dbPassword);

		// Data yang mau di insert
		Nasabah sbh = new Nasabah();
		sbh.setNomor("990");
		sbh.setNama("Testing QC");
		sbh.setEmail("testing.qc@infinetworks.com");

		// Insert menggunakan DAO
		dbNasabah.connect();
		dbNasabah.save(sbh);
		dbNasabah.disConnect();
	}
}
