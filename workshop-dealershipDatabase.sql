
/* 1. CREATE DATABASE database-name */
CREATE DATABASE CarDealershipDatabase;

/* 2. Create your tables.*/

CREATE TABLE Dealerships(
Dealership_id INT NOT NULL AUTO_INCREMENT,
dealershipName VARCHAR(50) NOT NULL,
Address VARCHAR(50) NOT NULL,
Phone VARCHAR(12) NOT NULL,
PRIMARY KEY (dealership_id)
);

CREATE TABLE Vehicles(
Make VARCHAR(50) NOT NULL,
Model VARCHAR(50) NOT NULL,
`Vehicle Type` VARCHAR(30) NOT NULL,
Price INT NOT NULL,
VIN INT NOT NULL,
Sold datetime,
PRIMARY KEY (VIN)
);

/* Modifying column*/

ALTER TABLE vehicles
ADD id INT NOT NULL;


CREATE TABLE Inventory(
Dealership_id INT NOT NULL,
VIN INT NOT NULL,
FOREIGN KEY(VIN) REFERENCES VEHICLES(VIN),
FOREIGN KEY(dealership_id) REFERENCES dealerships(dealership_id)
);


CREATE TABLE Sales_Contracts(
id INT NOT NULL AUTO_INCREMENT ,
VIN INT NOT NULL,
firstName VARCHAR(35) NOT NULL,
lastName VARCHAR(60) NOT NULL,
Phone VARCHAR(12) NOT NULL,
dateSigned DATE,
PRIMARY KEY (id),
FOREIGN KEY(VIN) REFERENCES Vehicles(VIN)
);

CREATE TABLE Lease_Contracts(
id INT NOT NULL AUTO_INCREMENT ,
VIN INT NOT NULL,
firstName VARCHAR(35) NOT NULL,
lastName VARCHAR(60) NOT NULL,
Phone VARCHAR(12) NOT NULL,
monthlyPayments INT NOT NULL,
Mileage INT NOT NULL,
dateSigned DATE,
PRIMARY KEY(id),
FOREIGN KEY(VIN) REFERENCES Vehicles(VIN)
);

/* 3. Sample Data*/

/* Dealerships Data*/

INSERT INTO Dealerships(dealershipName, Address, Phone)
VALUES("City Chevrolette", "8801 mandrin way", "8003965922");


INSERT INTO Dealerships(dealershipName, Address, Phone)
VALUES("Foreign Cars Charlotte", "8925 owl ln", "9003565722");

INSERT INTO Dealerships(dealershipName, Address, Phone)
VALUES("Metrolina Auto", "5601 twilight gate", "8753965966");

INSERT INTO Dealerships(dealershipName, Address, Phone)
VALUES("Automotive Sales", "2050 wonder dr", "7563965922");

INSERT INTO Dealerships(dealershipName, Address, Phone)
VALUES("Starmount Motors", "4025 new crest ln", "9803967822");

/* Testing Table*/
SELECT *
FROM dealerships;

/* Vehicles Data*/
 
 INSERT INTO vehicles(Make, Model, `Vehicle Type`, price, vin, ID)
 VALUES("Chevrolet", "2024 Chevrolet Silverado 1500 LTZ",
 "Pickup Truck", 57413, 1231231111, 1); 
 
INSERT INTO vehicles(Make, Model, `Vehicle Type`, price, vin)
 VALUES("Ford", "2024 Ford Escape Base",
 "SUV", 46810, 1231231234);
 
 UPDATE vehicles
 SET ID = 2
 WHERE VIN = 1231231234;
 
 INSERT INTO vehicles(Make, Model, `Vehicle Type`, price, vin)
 VALUES("Nissan", "2024 Nissan Rogue SL",
 "SUV", 36670, 1231232133);
 
 UPDATE vehicles
 SET ID = 3
 WHERE VIN = 1231232133;
 
 INSERT INTO vehicles(Make, Model, `Vehicle Type`, price, vin)
 VALUES("Jeep", "2024 Jeep Wrangler Sport",
 "SUV", 37664, 1231239867);
 
UPDATE vehicles
 SET ID = 6
 WHERE VIN = 1231239867;
 
 INSERT INTO vehicles(Make, Model, `Vehicle Type`, price, vin)
 VALUES("Hyundai", "2024 Hyundai Sonata SEL",
 "Sedan", 32265, 123125647);
 
 UPDATE vehicles
 SET ID = 5
 WHERE VIN = 123125647;
 
 INSERT INTO vehicles(Make, Model, `Vehicle Type`, price, vin)
 VALUES("Ram", "2023 Ram 1500 Big Horn/Lone Star",
 "Pickup Truck", 42431, 1231241561);
 
 UPDATE vehicles
 SET ID = 4
 WHERE VIN = 1231241561;
 
 INSERT INTO vehicles(Make, Model, `Vehicle Type`, price, vin, ID)
 VALUES("Ram", "2024 Ram ProMaster 2500",
 "Van", 50135, 235678236, 7);
 
 
 INSERT INTO vehicles(Make, Model, `Vehicle Type`, price, vin, ID)
 VALUES("Nissan", "2024 Nissan Altima S",
 "Sedan", 25658, 1231234323, 8);
 
 /*Testing Table*/
 select *
 from vehicles;
 
 /* Inventory Table Sample Data*/
 
 INSERT INTO inventory(dealership_id,VIN)
 VALUES (1, 1231231111);
 
 INSERT INTO inventory(dealership_id, VIN)
 VALUES (1,1231231234);
 
 
 INSERT INTO inventory(dealership_id,VIN)
 VALUES (2, 1231232133);
 
 INSERT INTO inventory(dealership_id,VIN)
 VALUES (3, 1231239867);
 
 INSERT INTO inventory(dealership_id,VIN)
 VALUES (3, 235678236);
 
 INSERT INTO inventory(dealership_id,VIN)
 VALUES (4, 123125647);
 
  INSERT INTO inventory(dealership_id,VIN)
 VALUES (5, 1231241561);
 
 INSERT INTO inventory(dealership_id,VIN)
 VALUES (5, 1231234323);
 
 /* Testing Table */
 SELECT *
 FROM inventory;
 
 /* Sales_Contract Table Sample Data*/
 
 INSERT INTO sales_contracts(VIN, firstName, lastName,Phone, dateSigned)
 VALUES (123125647, "Cassandra", "Haynes", "854243227", date('2024-03-15'));
 
 INSERT INTO sales_contracts(VIN, firstName, lastName,Phone, dateSigned)
 VALUES (1231232133, "Samuel", "Williams", "854258297", date('2024-03-25'));
 
 SELECT *
 FROM Sales_Contracts;
 
 /* lease_contracts Table Sample Data*/
 
 INSERT INTO Lease_contracts(VIN, firstName, lastName,Phone, monthlyPayments, Mileage, dateSigned)
 VALUES (1231239867, "Wanda", "Wills", "980258297", 450, 10000, date('2024-05-21'));
 
INSERT INTO Lease_contracts(VIN, firstName, lastName,Phone, monthlyPayments, Mileage, dateSigned)
 VALUES (1231241561, "Patrick", "Star", "704258297", 525, 8000, date('2024-05-28'));
 
 SELECT *
 FROM lease_contracts;
 
 /* 1. Get all dealerships*/
SELECT dealershipName
FROM dealerships;
 
 /* 2. Find all vehicles for a specific dealership*/
 SELECT ID, make, model, `vehicle Type`, dealershipName
 FROM vehicles 
 JOIN inventory
 ON vehicles.VIN = inventory.VIN
 JOIN dealerships
 ON dealerships.dealership_ID = inventory.dealership_ID
 WHERE dealerships.dealershipName = "Metrolina Auto";
 /* 3. Find a car by VIN*/
 
 SELECT VIN, make, model, `vehicle Type`
 FROM vehicles 
 WHERE VIN = 123125647;
 
 /* 4. Find the dealership where a certain car is located, by VIN*/
 
SELECT I.VIN, d.dealershipName, d.address 
FROM dealerships d
JOIN Inventory i
ON d.dealership_ID = i.dealership_ID
WHERE I.VIN = 1231234323;
 
 
 /* 5. Find all dealerships that have a certain car type*/
 
SELECT v.VIN, v.make, v.model, v.`vehicle type`, de.dealershipName, de.address
FROM vehicles v
JOIN inventory i
On v.VIN = i.VIN
JOIN dealerships de
ON i.dealership_ID = de.dealership_ID
WHERE make = "Nissan";
 
 
 /* 6. Get all sales information for a specific dealer for
 a specific date range*/
 
 SELECT de.dealershipName, de.address, c.id,
 c.vin, c.firstname, c.lastname, c.phone, c.datesigned
FROM vehicles v
JOIN sales_contracts c
On v.VIN = c.VIN
JOIN inventory i
ON c.VIN = i.Vin
JOIN dealerships de
ON i.Dealership_id = de.Dealership_id
WHERE de.dealershipName = "Automotive Sales" 
AND datesigned BETWEEN '2024-03-01' AND '2024-03-31';

 
 
 SELECT *
 FROM dealerships;
 