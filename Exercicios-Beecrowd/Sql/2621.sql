select pro.name from products pro
join providers vid on vid.id=pro.id_providers
where pro.amount between 10 and 20 and left(vid.name,1)='P'