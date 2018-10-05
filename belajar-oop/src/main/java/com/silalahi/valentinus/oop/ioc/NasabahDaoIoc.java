package com.silalahi.valentinus.oop.ioc;

public class NasabahDaoIoc {
	// tidak ada inisialisasi, karena sudah di handle di tempat laen
	private KoneksiDatabase koneksiDatabase;

	public NasabahDaoIoc(KoneksiDatabase koneksiDatabase) {
		this.koneksiDatabase = koneksiDatabase;
	}

	// setter injection
	public void setKoneksiDatabase(KoneksiDatabase koneksiDatabase) {
		this.koneksiDatabase = koneksiDatabase;
	}

	private void connect() {
		koneksiDatabase.connect();
	}

	private void disconnect() {

	}

	public void simpan() {
		connect();
		System.out.println("Menyimpan data nasabah ke db "+koneksiDatabase.getUrl());
		disconnect();
	}

	public void cariData() {

	}
}
