# TestHiber3
XML based configuration of hibernate with mySQL
To create the table for this TestHiber in MySQL use this script:

'CREATE TABLE Student ( sid int(11) NOT NULL, sname varchar(45) NOT NULL, sage int(11) DEFAULT NULL, fname varchar(45) DEFAULT NULL, PRIMARY KEY (sid) ) ENGINE=InnoDB DEFAULT CHARSET=latin1'

Insert some data into this table with: insert into test.Student (sid, sname, sage, fname) values (1,'Haque', 26, 'Khandoker'),(2,'P', 24, 'Anudeep'),(3,'Damn', 29, 'Matt');

Then modify the hibernate.cfg.xml file to suit your server location and run the .java files as Java Application to understand the project
