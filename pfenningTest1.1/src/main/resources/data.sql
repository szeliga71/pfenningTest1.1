
insert into driver (id,id_pf,id_rewe,name,last_name,hire_date,end_hire)values(1,2002870,500,'Zachariew','Iwan','21/01/01',null);
insert into driver (id_pf,id_rewe,name,last_name,hire_date,end_hire)values(2002871,501,'Nowak','Jan','21/01/02',null);
insert into driver (id_pf,id_rewe,name,last_name,hire_date,end_hire)values(2002872,502,'Jura','Max','21/02/01',null);
insert into driver (id_pf,id_rewe,name,last_name,hire_date,end_hire)values(2002873,503,'Kula','Edy','21/01/01',null);
insert into driver (id_pf,id_rewe,name,last_name,hire_date,end_hire)values(2002874,504,'Mika','Jura','21/01/01',null);



insert into truck(id,plate)values(1,'MOL-UA-725');
insert into truck(plate)values('MOL-BE-333');
insert into truck(plate)values('MOL-UA-71');
insert into truck(plate)values('MOL-OO-125');
insert into truck(plate)values('MOL-AA-987');
insert into truck(plate)values('MOL-UA-400');

insert into markt(id,nr,adres)values(1,34652201,'Bonn');
insert into markt(nr,adres)values(34652202,'Eitorf');
insert into markt(nr,adres)values(34652310,'Waldbroll');
insert into markt(nr,adres)values(34656625,'Koln');
insert into markt(nr,adres)values(34655588,'Bad Ems');
insert into markt(nr,adres)values(34659977,'Limburg');
insert into markt(nr,adres)values(34651123,'Betzdorf');
insert into markt(nr,adres)values(34655432,'Kaan');
insert into markt(nr,adres)values(34655912,'Lahnstein');
insert into markt(nr,adres)values(34657125,'Neuwied');
insert into markt(nr,adres)values(34656587,'Engers');


insert into tour (id,nr_rewe,date,distance_rewe,distance,time_start,time_end,truck_id,driver_id) values (1,'OG1059','2021-08-01',250,260,'2021-08-01T18:00:00','2021-08-01T20:00:00',2,4);
insert into tour (nr_rewe,date,distance_rewe,distance,time_start,time_end,truck_id,driver_id) values ('OG1060','2021-08-01',150,160,'2021-08-01T17:00:00','2021-08-01T19:30:00',1,1);
insert into tour (nr_rewe,date,distance_rewe,distance,time_start,time_end,truck_id,driver_id) values ('OG1065','2021-08-01',178,182,'2021-08-01T17:30:00','2021-08-01T20:30:00',3,2);

insert into destination_ware(id,tour_id,markt_id,roli,palet,m1,m2,m4,tk_box) values (1,1,3,5,0,1,0,4,2);
insert into destination_ware(tour_id,markt_id,roli,palet,m1,m2,m4,tk_box) values (1,6,8,2,1,2,0,0);