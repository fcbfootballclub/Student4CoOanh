use [SpringBootBai4];
create table tblSubject(
id int primary key identity(1,1),
name varchar(50),
description varchar(100),
duration int
);
go
insert into tblSubject (name, description, duration) values ('Dromaeus novaehollandiae', 'Excision of Vagus Nerve, Open Approach', 4);
insert into tblSubject (name, description, duration) values ('Fulica cristata', 'Monitoring of Venous Saturation, Portal, Open Approach', 2);
insert into tblSubject (name, description, duration) values ('Hyaena brunnea', 'Division of Right Ovary, Percutaneous Approach', 4);
insert into tblSubject (name, description, duration) values ('Drymarchon corias couperi', 'Bypass Transverse Colon to Transverse Colon, Endo', 2);
insert into tblSubject (name, description, duration) values ('Dasyurus viverrinus', 'Replace of R Great Saphenous with Autol Sub, Open Approach', 2);
insert into tblSubject (name, description, duration) values ('Felis wiedi or Leopardus weidi', 'Bypass L Fem Art to R Femor A w Synth Sub, Perc Endo', 3);
insert into tblSubject (name, description, duration) values ('Tapirus terrestris', 'Repair Left Mandible, Percutaneous Endoscopic Approach', 2);
insert into tblSubject (name, description, duration) values ('Phalaropus lobatus', 'Supplement Esophagus with Synthetic Substitute, Endo', 2);
insert into tblSubject (name, description, duration) values ('Uraeginthus granatina', 'Drainage of L Abd Bursa/Lig with Drain Dev, Open Approach', 1);
insert into tblSubject (name, description, duration) values ('Bugeranus caruncalatus', 'Revision of Autol Sub in R Rib, Extern Approach', 4);
go
select * from tblSubject;
go
select * from Student;
go
create table Marks(
ID int primary key identity(1,1),
idSinhVien int foreign key references tblSubject(id),
idSubject int foreign key references tblSubject(id),
mark float,
note varchar(100)
);
select * from Marks;




go
select * from tblSubject;

go
insert into Marks (idSinhVien, idSubject, mark, note) values (2, 5, 9, 'Ins noninfl penis prosth');
insert into Marks (idSinhVien, idSubject, mark, note) values (1, 2, 3, 'Suture uterine lacerat');
insert into Marks (idSinhVien, idSubject, mark, note) values (1, 3, 3, 'Lap rev gast restri proc');
insert into Marks (idSinhVien, idSubject, mark, note) values (2, 6, 3, 'Lap lys perivesureth adh');
insert into Marks (idSinhVien, idSubject, mark, note) values (1, 5, 1, 'Large bowel incision');
insert into Marks (idSinhVien, idSubject, mark, note) values (2, 5, 5, 'Endovas repl pulm valve');
insert into Marks (idSinhVien, idSubject, mark, note) values (1, 7, 7, 'Suture esophageal lacer');
insert into Marks (idSinhVien, idSubject, mark, note) values (2, 6, 5, 'Lysis pharyngeal adhes');
insert into Marks (idSinhVien, idSubject, mark, note) values (1, 1, 6, 'Control of epistaxis NOS');
insert into Marks (idSinhVien, idSubject, mark, note) values (1, 4, 6, 'Percutaneous cystostomy');
go

select * from Student;