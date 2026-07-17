# Write your MySQL query statement below
select c.name as Customers from Customers c left join orders s on c.id = s.customerId where 
s.customerId is null;
