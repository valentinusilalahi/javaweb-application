package com.silalahi.valentinus.oop;

public class Nasabah {
	private String nama; // instance variable
	public static int jumlahNasabah = 0;
	public String nomor;
	public String email;

	public Nasabah(String nama) {
		jumlahNasabah = jumlahNasabah + 1;
	}

	public String getNama() {
		System.out.println(nama + " adalah nasabah ke- " + jumlahNasabah);
		return this.nama;
	}

	public static void showJumlahNasabah() {
		System.out.println("Jumlah nasabah saat ini adalah : " + jumlahNasabah);
		// System.out.println(nama); //instance variable tidak bisa digunakan di static method
	}

	public String getNomor() {
		return nomor;
	}

	public void setNomor(String nomor) {
		this.nomor = nomor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
}
