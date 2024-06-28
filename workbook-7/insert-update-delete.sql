
/* 1. Add a new supplier.*/

INSERT INTO suppliers(supplierID, companyName)
VALUES(30, "Johnson co");

/* 2. Add a new product provided by that supplier.*/

INSERT INTO products(productID, productName, supplierID)
VALUES(78, "Choco puffs", 30);

/* 3. List all products and their suppliers.*/

SELECT p.ProductID, p.ProductName, p.SupplierID, s.companyName
FROM products p
JOIN suppliers s
ON p.SupplierID = s.SupplierID;

/* 4. Raise the price of your new product by 15%.*/

UPDATE products
SET UnitPrice = 2.50
WHERE productName = "Choco puffs";

UPDATE products
SET UnitPrice = unitprice + (unitprice * 0.15)
WHERE productName = "Choco puffs";

/* 5. List the products and prices of all products
      from that supplier.*/
      
      SELECT productName, UnitPrice
      FROM products
      WHERE SupplierID = 30;
      
/* 6. Delete the new product.*/

DELETE FROM products
WHERE ProductID = 78;

/* 7. Delete the new supplier.*/

DELETE FROM suppliers
WHERE SupplierID = 30;

/* 8. List all products.*/

SELECT *
FROM products;

/* 9. List all suppliers.*/

SELECT *
FROM suppliers;
