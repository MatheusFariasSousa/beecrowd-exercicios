select pro.name,vid.name,pro.price from products pro
join providers vid on pro.id_providers=vid.id
join categories cat on cat.id=pro.id_categories
where pro.price>1000 and cat.name='Super Luxury'