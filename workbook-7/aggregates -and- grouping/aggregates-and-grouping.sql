SELECT count(*)
FROM suppliers;

SELECT ProductName, UnitPrice
FROM products
ORDER BY UnitPrice ASC;


SELECT AVG(UnitPrice)
FROM products;

SELECT ProductName, UnitPrice
FROM products
ORDER BY UnitPrice DESC;

SELECT supplierID
FROM products
ORDER BY SupplierID;



SELECT CategoryID
FROM products
ORDER BY CategoryID;

SELECT AVG(UnitPrice), COUNT(*)
FROM products
GROUP BY CategoryID;

SELECT supplierID, count(*)
FROM products
GROUP BY supplierID
HAVING count(*) >= 5
ORDER BY supplierID;

SELECT UnitPrice, UnitsInStock, (UnitsInStock * UnitPrice) AS inventoryValue
FROM products 
ORDER BY InventoryValue DESC;

