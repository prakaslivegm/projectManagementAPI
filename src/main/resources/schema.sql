create table EMPLOYEE
(
	EMPSYSID INT NOT NULL,
	EMPID VARCHAR(25) NOT NULL,
	EMPNAME VARCHAR(25) NOT NULL,
	CAPBCENTER ENUM('Product and Platform','DEP-Cloud','DEVAA','DEP-Quality'), 
	DOJ date,
	DESIGNATION ENUM('Principal Engineer','Staff Engineer','Technical Lead','Architect','Senior Engineer','Engineer','Assoc Engineer'),
	PRIMARYSKILL VARCHAR(50) NOT NULL,
	SECSKILL VARCHAR(50),
	OVERALLEXP INT,
	
	primary key (EMPSYSID)	

);

create table PROJECT
(
	ACCNAME ENUM('Ancestry','BNYM','Calibo LLC','Experian','Ford','Guaranteed Rate','Invoice Cloud','Vattikuti Ventures LLC','Zip Co US Inc','PayPal','Johnson Controls Inc','WesternUnion'), 
	PROJNAME VARCHAR(25) NOT NULL,
	ALLOCATION NUMERIC(1,1) NOT NULL,
	PROJSTARTDATE DATE,
	PROJENDDATE DATE,
	REMARK VARCHAR(25)	

);
