-- 1. Write a SQL statement to create a simple table countries including columns country_id,country_name and region_id.

create table countries( 
COUNTRY_ID varchar(2),
COUNTRY_NAME varchar(20),
REGION_ID varchar(10)
);

-- 2. Write a SQL statement to create a simple table countries including columns country_id,country_name and region_id which is already exists. -- 
create table if not exists country (
    COUNTRY_ID VARCHAR(2),
    COUNTRY_NAME VARCHAR(20),
    REGION_ID VARCHAR(10)
);

-- 3. Write a SQL statement to create the structure of a table dup_countries similar to countries. 

create table if not exists dup_countries
LIKE countries;
 
 -- 4. Write a SQL statement to create a duplicate copy of countries table including structure and data by name dup_countries. 
 
CREATE TABLE IF NOT EXISTS dup_countries AS SELECT * FROM
    countries;

-- 5.Write a SQL statement to create a table countries1 set a constraint NULL. 

CREATE TABLE IF NOT EXISTS countries1 (
    COUNTRY_ID VARCHAR(2) NOT NULL,
    COUNTRY_NAME VARCHAR(20) NOT NULL,
    REGION_ID VARCHAR(10) NOT NULL
);
desc countries1;

-- 6. Write a SQL statement to create a table named jobs including columns job_id, job_title, min_salary, max_salary and check whether the max_salary amount exceeding the upper limit 25000.
 CREATE TABLE IF NOT EXISTS jobs ( 
JOB_ID varchar(10) NOT NULL , 
JOB_TITLE varchar(35) NOT NULL, 
MIN_SALARY decimal(5,0), 
MAX_SALARY decimal(5,0) 
CHECK(MAX_SALARY<=25000)
);
desc jobs;

-- 7. Write a SQL statement to create a table named countries including columns country_id, country_name and region_id and make sure that no countries except Italy, India and China will be entered in the table. 
CREATE TABLE IF NOT EXISTS countries2( 
COUNTRY_ID varchar(2),
COUNTRY_NAME varchar(30)
CHECK(COUNTRY_NAME IN('Italy','India','China')) ,
REGION_ID decimal(10,0)
);

desc countries2;

-- 8. Write a SQL statement to create a table named job_histry including columns employee_id, start_date, end_date, job_id and department_id and make sure that the value against column end_date will be entered at the time of insertion to the format like '--/--/----'. 
CREATE TABLE IF NOT EXISTS job_history ( 
EMPLOYEE_ID int NOT NULL, 
START_DATE date NOT NULL, 
END_DATE date NOT NULL
CHECK (END_DATE LIKE '--/--/----'), 
JOB_ID varchar(10) NOT NULL, 
DEPARTMENT_ID int  NOT NULL 
);

-- 9. Write a SQL statement to create a table named countries including columns country_id,country_name and region_id and make sure that no duplicate data against column country_id will be allowed at the time of insertion. 
CREATE TABLE IF NOT EXISTS countries3( 
COUNTRY_ID varchar(2) NOT NULL,
COUNTRY_NAME varchar(40) NOT NULL,
REGION_ID decimal(10,0) NOT NULL,
UNIQUE(COUNTRY_ID)
);
desc countries3;

-- 10. Write a SQL statement to create a table named jobs including columns job_id, job_title, min_salary and max_salary, and make sure that, the default value for job_title is blank and min_salary is 8000 and max_salary is NULL will be entered automatically at the time of insertion if no value assigned for the specified columns. 
CREATE TABLE IF NOT EXISTS jobs1 ( 
JOB_ID varchar(10) NOT NULL UNIQUE, 
JOB_TITLE varchar(35) NOT NULL DEFAULT ' ', 
MIN_SALARY int DEFAULT 8000, 
MAX_SALARY int  DEFAULT NULL
);
desc jobs1;

-- 11. Write a SQL statement to create a table named countries including columns country_id, country_name and region_id and make sure that the country_id column will be a key field which will not contain any duplicate data at the time of insertion. 
CREATE TABLE IF NOT EXISTS countries11 ( 
COUNTRY_ID varchar(2) NOT NULL UNIQUE PRIMARY KEY,
COUNTRY_NAME varchar(40) NOT NULL,
REGION_ID int  NOT NULL
);
desc countries11;

-- 12. Write a SQL statement to create a table countries including columns country_id, country_name and region_id and make sure that the column country_id will be unique and store an auto incremented value. 

CREATE TABLE IF NOT EXISTS countries12( 
COUNTRY_ID integer NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
COUNTRY_NAME varchar(40) NOT NULL,
REGION_ID decimal(10,0) NOT NULL
);
DESC countries12;

-- 13. Write a SQL statement to create a table countries including columns country_id, country_name and region_id and make sure that the combination of columns country_id and region_id will be unique. 
CREATE TABLE IF NOT EXISTS countries13 (
COUNTRY_ID varchar(2) NOT NULL UNIQUE DEFAULT '',
COUNTRY_NAME varchar(40) DEFAULT NULL,
REGION_ID decimal(10,0) NOT NULL,
PRIMARY KEY (COUNTRY_ID,REGION_ID));
desc countries13;
