create table nasabah(
    nomor VARCHAR(20),
    nama VARCHAR(255) not null,
    email VARCHAR(255) not null,
    primary key (nomor)
);
 create table rekening (
    nomor varchar(20),
    nomor_nasabah varchar(20),
    saldo money not null,
    primary key (nomor),
    foreign key (nomor_nasabah) references nasabah (nomor)
);
 create table mutasi (
	nomor varchar(20),
	nomor_rekening varchar(20),
	waktu_transaksi timestamp not null,
	keterangan varchar(255) not null,
	debet money not null,
	kredit money not null,
	primary key (nomor),
	foreign key (nomor_rekening) references rekening (nomor)
);
 insert into nasabah (nomor,nama,email)
values ('999','Valentinus','valentinus@silalahi.com');
 insert into rekening (nomor, nomor_nasabah, saldo)
 
 -- setoran awal
 
values ('111','999', 100000.00);
 insert into mutasi (nomor, nomor_rekening, waktu_transaksi, keterangan, debet, kredit)
values ('011','111', '2018-05-09 16:00:00', 'Setoran Awal', 100000.00,0);

-- tarik tunai
insert into mutasi (nomor, nomor_rekening, waktu_transaksi, keterangan, debet, kredit)
values ('002','111', now(), 'ATM SIAP0123', 0, 50000.00);
 update rekening set saldo = saldo-'50000.00'::money
where nomor = '111'; 