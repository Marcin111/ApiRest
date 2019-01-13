#Java 8 #Spring #Hibernate #JPA

#IntelliJ #MySQL

-------------------------------------------------------------------------------------------------------------

1. git clone
2. create database library
3. change mysql username and password

-------------------------------------------------------------------------------------------------------------

To view all employees:
GET http://localhost:8080/api/employees/

To add employee:
POST http://localhost:8080/api/employees/
Example body: {"name": "Morgan","surname": "Freeman","job": "CLERK","email": "hen@att.net"}

To view employee by id:
GET http://localhost:8080/api/employees/{id}
Example: GET http://localhost:8080/api/employees/1

To view employees by name:
GET http://localhost:8080/api/employees/name
Example: GET http://localhost:8080/api/employees/name?name=morgan

To view employees by surname:
GET http://localhost:8080/api/employees/surname
Example: GET http://localhost:8080/api/employees/surname?surname=freeman

To view employees by email:
GET http://localhost:8080/api/employees/email
Example: GET http://localhost:8080/api/employees/email?email=hen@att.net

To update employee by id:
PUT http://localhost:8080/api/employees/{id}
Example: PUT http://localhost:8080/api/employees/1
Example body: {"name": "MORGAN","surname": "Gates","job": "CLERK","email": "hen@att.net"}

To delete employee by id:
DELETE http://localhost:8080/api/employees/{id}
Example: DELETE http://localhost:8080/api/employees/1

To view jobs with employees count:
GET http://localhost:8080/api/employees/jobs


-------------------------------------------------------------------------------------------------------------

DROP TABLE EMPLOYEES;

-------------------------------------------------------------------------------------------------------------

INSERT INTO EMPLOYEES VALUES(1, '2018-12-12 04:57:40', 'pad@live.com', 'PRESIDENT' , 'FREEMAN' ,  'MORGAN');
INSERT INTO EMPLOYEES VALUES(2, '2018-12-12 04:57:40', 'padme@live.com', 'CLERK', 'SMITH',  'CLARK');
INSERT INTO EMPLOYEES VALUES(3, '2018-12-12 04:57:40',  'tlinden@hotmail.com', 'SALESMAN', 'ALLEN', 'MARTIN');
INSERT INTO EMPLOYEES VALUES(4, '2018-12-12 04:57:40',  'tbusch@me.com', 'PRESIDENT', 'WARD', 'SCOTT');
INSERT INTO EMPLOYEES VALUES(5, '2018-12-12 04:57:40',  'ccohen@att.net', 'MANAGER', 'JONES', 'KING');
INSERT INTO EMPLOYEES VALUES(6, '2018-12-12 04:57:40',  'frode@mac.com', 'ANALYST', 'MARTIN', 'ADAMS');
INSERT INTO EMPLOYEES VALUES(7, '2018-12-12 04:57:40',  'padme@live.com', 'MANAGER', 'BLAKE', 'ADAMS');
INSERT INTO EMPLOYEES VALUES(8, '2018-12-12 04:57:40',  'mirod@att.net', 'PRESIDENT', 'CLARK', 'SCOTT');
INSERT INTO EMPLOYEES VALUES(9, '2018-12-12 04:57:40',  'kempsonc@mac.com', 'ANALYST', 'SCOTT', 'MARTIN');
INSERT INTO EMPLOYEES VALUES(10, '2018-12-12 04:57:40',  'kempsonc@mac.com', 'SALESMAN', 'KING', 'TURNER');
INSERT INTO EMPLOYEES VALUES(11, '2018-12-12 04:57:40',  'shazow@verizon.net', 'SALESMAN', 'TURNER', 'BROS');
INSERT INTO EMPLOYEES VALUES(12, '2018-12-12 04:57:40',  'wayward@yahoo.ca', 'CLERK', 'ADAMS', 'FORD');

