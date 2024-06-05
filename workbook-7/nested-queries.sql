
/* 1. What is the product name(s) of the most expensive
products? HINT: Find the max price in a subquery 
and then use that value to find products whose price
equals that value.*/

SELECT productName, UnitPrice
FROM products
WHERE UnitPrice = (SELECT MAX(UnitPrice)
                    FROM products);

/* 2. What is the order id, shipping name and shipping
address of all orders shippied via "Federal Shipping"?
HINT: Find the shipper id of "Federal Shipping" in a
subquery and then use that value to find the orders
that used that shipper.*/

SELECT  orderId, shipName, shipAddress, ShipVia
FROM orders
 WHERE ShipVia IN (SELECT ShipperID
                    FROM shippers
                    WHERE ShipperID = 3);

/* 3. What are the order ids of the orders that ordered
"Sasquatch Ale"? HINT: Find the product id of 
"Sasquatch Ale" in a subquery and then use that
value to find the matching orders from the
 `order details` table. Because the `order details` table
 has a space in its name, you will need to surround it
 with back ticks in the FROM clause. */
 
 SELECT o.productID, o.OrderID
 FROM `order details` as o
 WHERE o.ProductID IN(SELECT p.ProductID
				     FROM  products as p
                     WHERE p.productID = 34);
 
 /* 4. What is the name of the employee that sold 
 order 10266? */
 
 SELECT firstName, lastName, EmployeeID
 FROM employees
 WHERE EmployeeID IN (SELECT o.EmployeeID
					 FROM orders o
                     WHERE o.EmployeeID = 3);
 
 /* 5. What is the name of the customer that bought
 order 10266? */
 
SELECT CompanyName, customerID
 FROM customers
 WHERE customerID IN (SELECT o.CustomerID
					 FROM orders o
                     WHERE o.CustomerID = "WARTH");
 
