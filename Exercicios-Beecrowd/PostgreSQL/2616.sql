select cus.id,cus.name  from customers cus
where not exists (select id_customers from locations where id_customers=cus.id)