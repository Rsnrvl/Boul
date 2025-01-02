CREATE TABLE unite (
idUnite varchar(50) primary key not null,
nom varchar(50)
);

insert into unite (idUnite, nom) VALUES ('u1', 'kg');
insert into unite (idUnite, nom) VALUES ('u2', 'l');
insert into unite (idUnite, nom) VALUES ('u3', 'piece') returning idUnite;

-- -------------------------------------------------------------------------------
create sequence prod_seq increment by 1 start with 1;
CREATE TABLE produit (
idProduit varchar(100) primary key not null,
nomProduit varchar(100),
idUnite varchar(100),
foreign key (idUnite) references unite(idUnite)
);

insert into produit VALUES ('p0', 'farine', 'u1');

create sequence emp_seq incremnet by 1 start with 1;
CREATE TABLE employe (
idEmploye varchar(100) primary key not null,
nomEmploye varchar(100),
dtn date
);
