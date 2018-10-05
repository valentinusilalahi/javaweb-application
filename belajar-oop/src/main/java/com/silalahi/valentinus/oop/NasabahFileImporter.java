package com.silalahi.valentinus.oop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
		
		List<Nasabah> hasil = new ArrayList<Nasabah>();
		data = fileReader.readLine();

		while (data != null) {
//			data = fileReader.readLine();
			System.out.println("Data : " + data);
			
			String[] isiVariable = data.split(",");
			if(isiVariable.length != 3) {
				throw new IllegalStateException("Format data salah, harusnya ada 3 data");
			}
			
			Nasabah n = new Nasabah();
			n.setEmail(isiVariable[0]);
			n.setEmail(isiVariable[1]);
			n.setEmail(isiVariable[2]);
		}

		tutupFile();
		return hasil;
	}

}
