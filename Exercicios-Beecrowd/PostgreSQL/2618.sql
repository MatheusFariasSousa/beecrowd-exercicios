select pro.name,vid.name,cat.name from products pro
join providers vid on pro.id_providers=vid.id
join categories cat on cat.id=pro.id_categories
where vid.name='Sansul SA' and cat.name='Imported'