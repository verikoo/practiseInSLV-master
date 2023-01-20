USE mydb;
-- insert 1
INSERT INTO Customer(id, Name, Surname, Contact_Number, Email, Address, Purchase_History)
VALUES(1,'Liza', 'Smith', '000-00-1','smith@example.com', 'address 1', 'no hist'), 
(2, 'Emma', 'Jonson', '000-00-2','jonson@example.com', 'address 2', 'no hist'),
(3, 'Michael', '000-00-3', 'Williams', 'williams@example.com', 'address 3', 'no hist'),
(4, 'Sophia', '000-00-4','JOnes', 'jones@example.com',  'address 4', 'no hist');

select count(Surname) from Customer;

-- insert 2
INSERT INTO Shop(id, Shop_Name, Contact_Number, Email, Address, Open_Hours)
VALUES(5001, 'Central Mobile Shop', '500-00-1', 'central@example.com', 'Pirosmani str 123', '24/7'),
(5002, 'North Mobile Shop', '500-00-2', 'north@example.com', 'pharnavazi str 10', '24/7'),
(5003, 'WEST Mobile Shop', '500-00-3', 'west@example.com', 'chavchavadze str  13', '24/7');

 DELETE FROM Shop WHERE ID IN(5001, 5002, 5003);

select count(Shop_Name) from Customer;

-- insert 3
INSERT INTO Phone(id, Brand, Model, Release_Date, Customers_id)
VALUES(666, 'APPLE', 'IPHONE 12 PRO MAX', '2020-10-13',  1),
(667, 'SAMSUNG', 'Galaxy S21 Ultra', '2021-01-14',  2);


-- insert 4
INSERT Phones_Detail(id,Phone_Brand,Phone_Model,Color,ROM,RAM,Battary,Price,Phones_id)
VALUES(190,'APPLE','IPHONE 12 PRO MAX','grey', '128', '6', 'built-in rechargeable lithium-ion battery', 150, 666);

select count(Phone_Brand) from Phones_Detail;

-- insert 5
INSERT Phone_Warranties(id,Start_Date,End_Date,Warranties_Year,Phones_Details_id,Phones_Details_Phones_id)
VALUES(8001,'2020-10-13', '2022-10-13', 'two years', 190,666);

select count(Phones_Details_id) from Phone_Warranties;

-- insert 6
INSERT Service_Center(id,Center_Name,Center_Address,Contact_Number,Address,Email)
VALUES(6001, 'Central Mobile Service','Pirosnami str 10',  '600-00-1','Pirosnami str 10', 'centralService@example.com'),
(6002, 'North Mobile Service', 'abuseridze str 10','600-00-2', 'abuseridze str 10','northService@example.com');

 DELETE FROM Service_Center WHERE ID IN(6001, 6002);
select count(Center_Name) from Service_Center;

-- inesrt 7
INSERT Service_Center_Employee(id,Name,Surname,Position,Address,Email,Contact_Number,Service_Center_id)
VALUES(1, 'Jon', 'Doe', 'Screen repaier', 'Pirosmani str 132', 'jonrep@mail.com', '234-34-3',6001);
select count(Surname) from Service_Center_Employee;

-- insert 8
INSERT Service_Request(id,Service_Type,Service_Requestcol,Service_Center_id,Customers_id)
VALUES(1,'screen sepair', 'additional info', 6001, 1);

select count(Service_Type) from Service_Request;

-- insert 9
INSERT Shop_Employee(id,Name,Surname,Contact_Number,Email,Address,Position,Shop_id)
VALUES(1,'Liza', 'Lorens', '345-453-33', 'lizlor2example.com', 'chavchavadze str 4', 'manager', 5001);

select count(id) from Shop_Employee;

-- insert 10
INSERT Inventory(id,Quantity,Inventorycol)
VALUES(1,129, 'additional info');

select count(id) from Inventory;

-- update 10 
UPDATE Customer SET Name= 'Updated Name' WHERE id=1;
UPDATE Shop SET Contact_Number='140-34-2' WHERE id=5001;
UPDATE Phone SET Release_Date='2020-10-13' WHERE id=666;
UPDATE Phones_Detail SET Color='pink' WHERE id=190;
UPDATE Phone_Warranties SET Warranties_Year='2 years two years' WHERE id =8001;
UPDATE Service_Center SET Center_Name='updated center name' WHERE id=6001;
UPDATE Service_Center_Employee SET Name='colins' WHERE id=1;
UPDATE Service_Request SET Service_Type='repair screen and update soft' WHERE id=1;
UPDATE Shop_Employee SET Email='updated@example.com' WHERE id=1;
UPDATE Inventory SET Quantity=128 WHERE id=1;

-- delete 10 example
DELETE FROM Customer WHERE id= 1;
DELETE FROM Shop WHERE id=5001;
DELETE FROM Phone WHERE  id=666;
DELETE FROM Phones_Detail WHERE  id=190;
DELETE FROM Phone_Warranties WHERE id =8001;
DELETE FROM Service_Center WHERE id=6001;
DELETE FROM Service_Center_Employee WHERE id=1;
DELETE FROM Service_Request WHERE id=1;
DELETE FROM Shop_Employee WHERE id=1;
DELETE FROM Inventory WHERE id=1;


-- 5 example alter table 
ALTER TABLE Customer
ADD testForAlter varchar(255);

ALTER TABLE Inventory 
ADD  testForAlter INT;

ALTER TABLE Phone
MODIFY COLUMN  Brand VARCHAR(95) NOT NULL;

ALTER TABLE Phones_Detail
MODIFY COLUMN Phone_Brand VARCHAR(80);

ALTER TABLE Inventory
DROP COLUMN testForAlter;

ALTER TABLE Service_Request 
ADD N INT;

ALTER TABLE Service_Request
DROP COLUMN N;


-- agregate functions 	example
SELECT MIN(Purchase_Cost) FROM Deliveries AS MinCost;
SELECT SUM(Quantity) FROM Inventory AS Inventory_Quant;
SELECT SUM(id) FROM Service_Center_Employee AS Sum_Emplp;
SELECT COUNT(DISTINCT Customer_id) FROM Returns AS Returned_List;
SELECT `id`,`Position` FROM Shop_Employee AS `id`,`Position`;
SELECT COUNT(Name) WHERE Purchase_History='no hist';
SELECT AVG(Purchase_Cost) FROM Deliveries;
SELECT MAX(Purchase_Cost) FROM Deliveries;


-- 1 big statement to join all tables in the database.

SELECT *  
FROM Customer
INNER JOIN Phone ON Customer.id = Phone.Customers_id
JOIN Phones_Detail ON Phone.id=Phones_id
JOIN Phones_has_Shop ON Phone.id=Phone.id
JOIN Phone_Warranties ON Phone_Warranties.Phones_Details_Phones_id=Phone.id
JOIN Returns ON Returns.Customers_id=Customer.id
JOIN Shop_has_Customers ON Shop_has_Customers.Customers_id=Customer.id
JOIN Shop_Employee ON Shop_Employee.Shop_id=Shop_has_Customers.Shop_id
JOIN Service_Request ON Service_Request.Customers_id=Customer.id
JOIN Service_Center On Service_Center.id=Service_Request.Service_Center_id
JOIN Service_Center_Employee ON Service_Center_Employee.Service_Center_id=Service_Center.id
;

-- 5 statements with left, right, inner, outer joins.

SELECT *  
FROM Customer
LEFT JOIN Phone ON Customer.id = Phone.Customers_id;

SELECT * FROM Phones_Detail
JOIN Phone_Warranties ON Phone_Warranties.Phones_Details_Phones_id=Phones_Detail.Phones_id;

SELECT * FROM Phones
RIGHT JOIN Phone_Warranties ON Phone_Warranties.Phones_Details_Phones_id=Phone.id;

SELECT * FROM Service_Request
INNER JOIN Service_Center On Service_Center.id=Service_Request.Service_Center_id;

SELECT * FROM Shop_has_Customers
 JOIN Shop_Employee ON Shop_Employee.Shop_id=Shop_has_Customers.Shop_id;
