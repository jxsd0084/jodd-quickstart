-- Database: "jodd-quickstart"

-- DROP DATABASE "jodd-quickstart";

CREATE DATABASE "jodd-quickstart"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'C'
       LC_CTYPE = 'C'
       CONNECTION LIMIT = -1;

DROP TABLE IF EXISTS "qs_book";

CREATE TABLE "qs_book" (
  "id" serial NOT NULL,
  "name" varchar(30) DEFAULT NULL,
  "author" varchar(30) DEFAULT NULL,
  PRIMARY KEY ("id")
);

insert  into "qs_book"("id","name","author") values (1,'Neuromancer','W. Gibson');
insert  into "qs_book"("id","name","author") values (2,'Dance, dance, dance','H. Murakami');
insert  into "qs_book"("id","name","author") values (3,'The Fortress of Solitude','J. Lethem');
