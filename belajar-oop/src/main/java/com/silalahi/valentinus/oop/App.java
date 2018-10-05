package com.silalahi.valentinus.oop;

import java.util.Date;

public class App {

	private Date sekarang = new Date(0);

	public void sapa(String nama) {
		System.out.println("Halo " + nama);
	}

	public void tampilkanWaktu() {
		System.out.println("Waktu Sekarang " + sekarang);
	}

	public static void main(String[] xxx) {
		System.out.println("Method main di jalankan");
		
		System.out.println("Jumlah nasabah : "+Nasabah.jumlahNasabah);
		Nasabah.showJumlahNasabah();
		
		Nasabah nsb = new Nasabah("valentinus");
		System.out.println("Halo " + nsb.getNama());
		
		System.out.println("JumlahNasabah : "+nsb.jumlahNasabah);
		nsb.getNama();
		Nasabah.showJumlahNasabah();
	}
}
