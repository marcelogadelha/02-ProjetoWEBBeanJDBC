-- DELETAR BANCO BANCO
drop database banco;
-- CRIAR BANCO BANCO
create database banco
	WITH OWNER = postgres
	ENCODING = 'UTF8'
	TABLESPACE = pg_default
	LC_COLLATE = 'Portuguese_Brazil.1252'
	LC_CTYPE = 'Portuguese_Brazil.1252'
	CONNECTION LIMIT = -1;
-- CRIAR TABELA CLIENTE
create table if not exists CLASSE(
	NUMERO bigint not null,
	NOME character varying(45),
	DATA date,
	constraint NUMERO_PK primary key (NUMERO)
);