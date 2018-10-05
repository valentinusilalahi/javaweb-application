package com.silalahi.valentinus.app.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RekeningDao {

	@Autowired
	@Qualifier("koneksiDatabase2")
	private KoneksiDatabase koneksiDatabase;

	private void connect() {
		koneksiDatabase.connect();
	}

	public void simpan() {
		connect();
		System.out.println("Simpan data rekening ke database " + koneksiDatabase.getUrl());
	}
}
