package com.silalahi.valentinus.oop;

import java.io.IOException;

public class DemoBacaFile {
	public static void main(String[] xxx) throws IOException {
		NasabahFileImporter ni = new NasabahFileImporter("src/main/resources/daftar-nasabah.md");
		ni.process();
	}
}
