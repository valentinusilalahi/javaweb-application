package com.silalahi.valentinus.oop;

import java.io.IOException;
import java.util.List;

public class DemoBacaFile {
	public static void main(String[] xxx) throws IOException {
		NasabahFileImporter ni = new NasabahFileImporter("src/main/resources/daftar-nasabah.md");
		ni.process();

		List<Nasabah> hasilImport = ni.process();
		System.out.println(hasilImport.size() + " data berhasil di import.");

		for (Nasabah x : hasilImport) {
			System.out.println("Nomor : " + x.getNomor());
			System.out.println("Nama : " + x.getNama());
			System.out.println("Email : " + x.getEmail());
		}
	}
}
