select cus.name,ord.id from customers cus
join orders ord on ord.id_customers=cus.id
where ord.orders_date between '2016-01-01' and  '2016-07-01'