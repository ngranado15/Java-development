
/*
INNER JOIN used when only returns connected, matching
rows (meaning no null values).

RIGHT JOIN returns all connected rows, and unconnected
rows from right table (nulls in left).

LEFT JOIN returns all connected rows, and unconnected 
rows from left table (nulls in right).

FULL JOIN Returns connected rows & unconnected rows
from both left & right tables (includes all null).


 1. List the product ID, product name, Unit Price
and category name of all products. Order by category
name and within that, by product name. */

SELECT productID, productName, unitPrice, categoryName
FROM products
INNER JOIN categories
ON products.CategoryID = categories.CategoryID
ORDER BY CategoryName, ProductName;

/* 2. List the product ID, product Name, Unit price
and supplier name of all products that cost more than
$75 . Order by product Name. */

SELECT productID, productName, UnitPrice, CompanyName
FROM products
Left JOIN suppliers
ON products.SupplierID = suppliers.SupplierID
WHERE UnitPrice >= 75
ORDER BY ProductName;

/* 3. List the product ID, product Name, unit Price
Category name, and supplier name of every product.
Order by product name. */

SELECT p.productID, p.productName,
 p.unitPrice, c.categoryName, s.CompanyName
FROM products p
INNER JOIN categories c
ON p.CategoryID = c.CategoryID
INNER JOIN suppliers s
on p.SupplierID = S.SupplierID
ORDER BY p.ProductName;

/* 4. What is the prouct names(s) and categories of
the most expensive products? HINT: Find the max price
in a subquery and then use that in your more complex
query that joins products with categories. */

SELECT p.ProductName, c.CategoryName
FROM products as p
JOIN categories as c
ON p.CategoryID = c.CategoryID
WHERE p.UnitPrice = (SELECT max(UnitPrice)
                   FROM products);



/* 5. List the order id, ship name, ship address, and
shipping company name of every order that shipped to
Germany. */

SELECT o.orderID, o.shipName, o.shipAddress,
 s.companyName
 FROM orders o
 LEFT JOIN shippers s
 ON o.ShipVia = s.ShipperID
 WHERE o.ShipCountry = "Germany";


/* 6. List the order id, order date, ship name,
ship address of all orders that ordred "Sasquatch Ale"? */

SELECT o.orderID, o.orderDate, o.shipName, o.shipAddress
FROM orders o
JOIN `order details` od
ON o.orderID = od.orderID
JOIN products p
ON p.productID = od.productID
WHERE p.productname = "Sasquatch Ale";
