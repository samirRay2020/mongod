CREATE DATABASE skill;
USE skill;

DROP TABLE personalinfo;
DROP TABLE logindetails;
DROP TABLE cqs;
DROP TABLE javaqs;
DROP TABLE pythonqs;
DROP TABLE cppqs;
DROP TABLE admin;

CREATE TABLE admin(
    username VARCHAR(20), 
    password VARCHAR(20)
);

INSERT INTO admin VALUES("main","pandey");

CREATE TABLE logindetails(
    username VARCHAR(20), 
    password VARCHAR(20) 
);

CREATE TABLE personalinfo(
    username varchar(20),
    name varchar(30),
    college varchar(30),
    college_addr varchar(50),
    pin varchar(6),
    age varchar(3),
    gender varchar(8),
    department varchar(15),
    mobile varchar(10),
    email varchar(30),
    skills varchar(40)
);

CREATE TABLE cqs(
    question varchar(2), 
    answer varchar(20)
);

CREATE TABLE javaqs(
    question varchar(2), 
    answer varchar(20)
);

CREATE TABLE pythonqs(
    question varchar(2), 
    answer varchar(20)
);

CREATE TABLE cppqs(
    question varchar(2), 
    answer varchar(20)
);

INSERT INTO cqs VALUES("q1","Dennis Ritchie");
INSERT INTO cqs VALUES("q2","0a32");

INSERT INTO cppqs VALUES("q1","Bjarne Stroustrup");
INSERT INTO cppqs VALUES("q2","3");

INSERT INTO javaqs VALUES("q1","James Gosling");
INSERT INTO javaqs VALUES("q2","4");

INSERT INTO pythonqs VALUES("q1","Guido van Rossum");
INSERT INTO pythonqs VALUES("q2","collections");

SELECT * FROM personalinfo;
SELECT * FROM logindetails;
SELECT * FROM admin;
SELECT * FROM cqs;
SELECT * FROM javaqs;
SELECT * FROM pythonqs;
SELECT * FROM cppqs;
