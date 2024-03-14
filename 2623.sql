select pro.name,cat.name from products pro
join categories cat on cat.id=pro.id_categories
where  pro.amount>100 and cat.id in (1,2,3,6,9)
order by cat.id