CREATE TABLE TB_BOOKS(BOOKID INTEGER GENERATED BY DEFAULT AS IDENTITY NOT NULL PRIMARY KEY,BOOKNAME VARCHAR(30),AUTHOR VARCHAR(30));

INSERT INTO "PUBLIC"."TB_BOOKS"( "BOOKID", "BOOKNAME", "AUTHOR" ) VALUES ( 1, '《Java入门到放弃》','梅致远');
