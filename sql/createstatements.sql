CREATE TABLE orders_bgv (
	orderNumber int NOT NULL,
	orderDate date NOT NULL,
	requiredDate date NOT NULL,
	shippedDate date,
	status varchar(15) NOT NULL,
	comments varchar(50),
	customerNumber int NOT NULL,
	customer_emailid varchar(100) NOT NULL,
	PRIMARY KEY (orderNumber)
);

CREATE TABLE orderdetails (
	orderDetailId serial PRIMARY KEY,
	orderNumber int NOT NULL,
	productCode varchar(15) NOT NULL,
	quantityOrdered int NOT NULL,
	priceEach decimal(10, 2) NOT NULL,
	lineNumber int NOT NULL,
	FOREIGN KEY (orderNumber) REFERENCES orders_bgv(orderNumber)
);


CREATE TABLE Custs_Bgv (
	customerNumber int NOT NULL,
	LastName varchar(50),
	FirstName varchar(50),
	phone varchar(50),
	addressLine1 varchar(100),
	addressLine2 varchar(100),
	city varchar(50),
	state varchar(50),
	postalCode varchar(15),
	country varchar(50),
	employeeNumber int,
	Emp_EmailId varchar(100),
	Customer_EmailId varchar(100),
	Ssn varchar(11),
	salary numeric(10, 2),
	dob date,
	PRIMARY KEY (customerNumber)
);

CREATE TABLE payment (
	customerNumber int NOT NULL,
	cardNumber bigint NOT NULL,
	paymentDate date NOT NULL,
	amount decimal(8, 2) NOT NULL
);

CREATE TABLE employees_bgv (
	employeeNumber int NOT NULL,
	lastName varchar(50) NOT NULL,
	firstName varchar(50) NOT NULL,
	extension varchar(10) NOT NULL,
	emp_emailid varchar(100) NOT NULL,
	PRIMARY KEY (employeeNumber)
);



INSERT INTO orders_bgv (orderNumber, orderDate, requiredDate, shippedDate, status, comments, customerNumber, customer_emailid) VALUES
(1, '2023-01-01', '2023-01-10', '2023-01-05', 'Shipped', 'First order', 1001, 'customer1@example.com'),
(2, '2023-01-02', '2023-01-11', '2023-01-06', 'Shipped', 'Second order', 1002, 'customer2@example.com'),
(3, '2023-01-03', '2023-01-12', '2023-01-07', 'Shipped', 'Third order', 1003, 'customer3@example.com'),
(4, '2023-01-04', '2023-01-13', '2023-01-08', 'Shipped', 'Fourth order', 1004, 'customer4@example.com'),
(5, '2023-01-05', '2023-01-14', '2023-01-09', 'Shipped', 'Fifth order', 1005, 'customer5@example.com'),
(6, '2023-01-06', '2023-01-15', '2023-01-10', 'Shipped', 'Sixth order', 1006, 'customer6@example.com'),
(7, '2023-01-07', '2023-01-16', '2023-01-11', 'Shipped', 'Seventh order', 1007, 'customer7@example.com'),
(8, '2023-01-08', '2023-01-17', '2023-01-12', 'Shipped', 'Eighth order', 1008, 'customer8@example.com'),
(9, '2023-01-09', '2023-01-18', '2023-01-13', 'Shipped', 'Ninth order', 1009, 'customer9@example.com'),
(10, '2023-01-10', '2023-01-19', '2023-01-14', 'Shipped', 'Tenth order', 1010, 'customer10@example.com');


INSERT INTO orderdetails (orderNumber, productCode, quantityOrdered, priceEach, lineNumber) VALUES
(1, 'P001', 10, 99.99, 1),
(1, 'P002', 5, 49.99, 2),
(2, 'P003', 20, 199.99, 1),
(2, 'P004', 10, 99.99, 2),
(3, 'P005', 15, 149.99, 1),
(4, 'P006', 25, 249.99, 1),
(5, 'P007', 30, 299.99, 1),
(6, 'P008', 12, 119.99, 1),
(7, 'P009', 8, 89.99, 1),
(8, 'P010', 22, 219.99, 1);


INSERT INTO Custs_Bgv (customerNumber, LastName, FirstName, phone, addressLine1, addressLine2, city, state, postalCode, country, employeeNumber, Emp_EmailId, Customer_EmailId, Ssn, salary, dob) VALUES
(1001, 'Doe', 'John', '1234567890', '123 Elm St', 'Apt 1', 'Springfield', 'IL', '62701', 'USA', 101, 'employee1@example.com', 'customer1@example.com', '111-11-1111', 60000.00, '1980-01-01'),
(1002, 'Smith', 'Jane', '2345678901', '456 Oak St', 'Apt 2', 'Springfield', 'IL', '62702', 'USA', 102, 'employee2@example.com', 'customer2@example.com', '222-22-2222', 65000.00, '1981-02-01'),
(1003, 'Brown', 'Mike', '3456789012', '789 Pine St', 'Apt 3', 'Springfield', 'IL', '62703', 'USA', 103, 'employee3@example.com', 'customer3@example.com', '333-33-3333', 70000.00, '1982-03-01'),
(1004, 'Davis', 'Sue', '4567890123', '101 Maple St', 'Apt 4', 'Springfield', 'IL', '62704', 'USA', 104, 'employee4@example.com', 'customer4@example.com', '444-44-4444', 75000.00, '1983-04-01'),
(1005, 'Miller', 'Tom', '5678901234', '202 Birch St', 'Apt 5', 'Springfield', 'IL', '62705', 'USA', 105, 'employee5@example.com', 'customer5@example.com', '555-55-5555', 80000.00, '1984-05-01'),
(1006, 'Wilson', 'Anna', '6789012345', '303 Cedar St', 'Apt 6', 'Springfield', 'IL', '62706', 'USA', 106, 'employee6@example.com', 'customer6@example.com', '666-66-6666', 85000.00, '1985-06-01'),
(1007, 'Moore', 'Jim', '7890123456', '404 Walnut St', 'Apt 7', 'Springfield', 'IL', '62707', 'USA', 107, 'employee7@example.com', 'customer7@example.com', '777-77-7777', 90000.00, '1986-07-01'),
(1008, 'Taylor', 'Pat', '8901234567', '505 Hickory St', 'Apt 8', 'Springfield', 'IL', '62708', 'USA', 108, 'employee8@example.com', 'customer8@example.com', '888-88-8888', 95000.00, '1987-08-01'),
(1009, 'Anderson', 'Chris', '9012345678', '606 Fir St', 'Apt 9', 'Springfield', 'IL', '62709', 'USA', 109, 'employee9@example.com', 'customer9@example.com', '999-99-9999', 100000.00, '1988-09-01'),
(1010, 'Thomas', 'Lee', '0123456789', '707 Spruce St', 'Apt 10', 'Springfield', 'IL', '62710', 'USA', 110, 'employee10@example.com', 'customer10@example.com', '000-00-0000', 105000.00, '1989-10-01');

INSERT INTO payment (customerNumber, cardNumber, paymentDate, amount) VALUES
(1001, 1111222233334444, '2023-01-01', 100.00),
(1002, 2222333344445555, '2023-01-02', 150.00),
(1003, 3333444455556666, '2023-01-03', 200.00),
(1004, 4444555566667777, '2023-01-04', 250.00),
(1005, 5555666677778888, '2023-01-05', 300.00),
(1006, 6666777788889999, '2023-01-06', 350.00),
(1007, 7777888899990000, '2023-01-07', 400.00),
(1008, 8888999900001111, '2023-01-08', 450.00),
(1009, 9999000011112222, '2023-01-09', 500.00),
(1010, 0000111122223333, '2023-01-10', 550.00);

INSERT INTO employees_bgv (employeeNumber, lastName, firstName, extension, emp_emailid) VALUES
(101, 'Doe', 'John', 'x101', 'employee1@example.com'),
(102, 'Smith', 'Jane', 'x102', 'employee2@example.com'),
(103, 'Brown', 'Mike', 'x103', 'employee3@example.com'),
(104, 'Davis', 'Sue', 'x104', 'employee4@example.com'),
(105, 'Miller', 'Tom', 'x105', 'employee5@example.com'),
(106, 'Wilson', 'Anna', 'x106', 'employee6@example.com'),
(107, 'Moore', 'Jim', 'x107', 'employee7@example.com'),
(108, 'Taylor', 'Pat', 'x108', 'employee8@example.com'),
(109, 'Anderson', 'Chris', 'x109', 'employee9@example.com'),
(110, 'Thomas', 'Lee', 'x110', 'employee10@example.com');
