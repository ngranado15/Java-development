
/* 1. the products table holds the items northwind sells */ 

/* 2. write a query to list product id, product name and
unit price of every product. */

SELECT productID, productName, unitPrice
FROM products;

/* 3. write a query to list the product id, product name
, and unit price of every product. This time order by
 price in ascending order. */

SELECT productID, productName, unitPrice
FROM products
ORDER BY unitPrice;

/* 4. What are the products that we carry where the
unit price is 7.50 or less? */

SELECT productName, unitPrice
FROM products
WHERE UnitPrice <= 7.50;

/* 5. What are the products that we carry where we have
at least 100 units on hand? Order them in descending 
order by price. */

SELECT productName, unitsInStock
FROM products
WHERE UnitsInStock >= 100;

/* 6. What are the products thats we have at least
100 units on hand? Order them in descending order by
price. If two or more have the same price, list
those in ascending order by product name. */

SELECT productName, UnitsInStock, unitPrice
FROM products
WHERE UnitsInStock >= 100
ORDER BY  UnitPrice DESC, productName;
 
/* 7. What are the products that we carry where we have
no more units of them on backorder? Order them by
product name.*/

SELECT productName, UnitsInStock
FROM products
WHERE UnitsInStock >= 1
ORDER BY ProductName;

/* 8. What is the name of the table that holds the
types (categories) of the items Northwind sells?

The categories table hold the tyoes of items
northwind sells. */

/* 9. Write a query that lists all of the columns and
all of the rows of the categories table? what is 
the category id of seafood? 

The category ID is 8.*/

SELECT *
FROM categories;

/* 10. Examine the products table. how does it identify
the type of (category) of each item sold? write a query
to list all of the seafood items we carry.

It identifys the category usig categoryID.*/
SELECT categoryID, productName
FROM products
WHERE CategoryID = 8;


/* 11. What are the first and last names of all the
Northwind Employees?*/

SELECT firstName, lastName
FROM employees;


/* 12. What employees have "manager" in their titles?*/

SELECT  firstName, lastName, title
FROM employees
WHERE title LIKE "%Manager%";

/* 13. list the distinct job titles in employees?*/
SELECT  firstName, lastName, title
FROM employees;

/* 14. What employees have a salary that is between
2000 and 2500?*/
SELECT  firstName, lastName, title, salary
FROM employees
WHERE salary BETWEEN 2000 AND 2500;

/* 15. List all of the information about all of
Northwind's suppliers.*/
SELECT *
FROM suppliers;

/* 16. Examine the products table. How do you know what
suppliers supplies each product? Write a query to list
all of the items that "Tokyo Traders" supplies to
Northwind.*/
SELECT supplierID, productName
FROM products
WHERE SupplierID = 4;

 
