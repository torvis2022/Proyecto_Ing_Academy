CREATE TABLE tusuario(
    id_u int AUTO_INCREMENT not null,
    u_dni Varchar(20),
    password Varchar(18),
    primary key (id_u));

CREATE TABLE tpersonal_academy(
    DNI_A Varchar(8),
    nombres Varchar(60),
    apellidos Varchar(80),
    sexo char(1),
    celular Varchar(9),
    correo varchar(80),
    primary key (DNI_A));

CREATE TABLE tdetalle_estudiante(
    DNI_E Varchar(8),
    observacion Varchar(20),
    deuda decimal(6,2),
    fechaPagar datetime DEFAULT CURRENT_TIMESTAMP(),
    DNI_A Varchar(8),
    primary key (DNI_E),
    foreign key (DNI_A) references tpersonal_academy (DNI_A));

CREATE TABLE talumno(
    DNI_E Varchar(8),
    nombres Varchar(60),
    apellidos Varchar(80),
    sexo char(1),
    celular Varchar(9),
    correo varchar(80),
    primary key (DNI_E),
    foreign key (DNI_E) references tdetalle_estudiante (DNI_E));

CREATE TABLE tmatricula(
    codigo int AUTO_INCREMENT not null,
    grupo char(1),
    turno Varchar(10),
    ciclo Varchar(20),
    fecha datetime DEFAULT CURRENT_TIMESTAMP(),
    codigoAlumno Varchar(8),
    DNI_A Varchar(8),
    primary key (codigo),
    foreign key (codigoAlumno) references talumno (DNI_E),
    foreign key (DNI_A) references tpersonal_academy (DNI_A));

ALTER TABLE talumno ADD CONSTRAINT UQ_DNIEstu UNIQUE (DNI_E);

