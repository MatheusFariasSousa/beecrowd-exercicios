select mo.id,mo.name from movies mo
join prices pri on pri.id=mo.id_prices
where pri.value < 2