package com.silalahi.valentinus.oop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class NasabahFileImporter {
	private File fileInput;
	private BufferedReader fileReader;

	public NasabahFileImporter(String namaFile) {
		this.fileInput = new File(namaFile);
	}

	public void bukaFile() throws FileNotFoundException {
		if (!fileInput.exists()) {
			throw new FileNotFoundException("File tidak ada!");
		}

		fileReader = new BufferedReader(new FileReader(fileInput));
	}

	public void tutupFile() throws IOException {
		if (fileReader != null) {
			fileReader.close();
		}
	}

	public List<Nasabah> process() throws IOException {
		bukaFile();

		String data = fileReader.readLine();
		System.out.println("Header : " + data);

		while (data != null) {
			data = fileReader.readLine();
			System.out.println("Data : " + data);
		}

		tutupFile();
		return null;
	}

}
