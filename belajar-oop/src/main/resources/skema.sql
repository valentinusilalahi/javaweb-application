create table nasabah(
	nomor VARCHAR(20),
	nama VARCHAR(255) not null,
	email VARCHAR(255) not null,
	primary key (nomor)
);

insert into nasabah (nomor,nama,email)
value ('123','Valent','valentinus.silalahi@gmail.com');