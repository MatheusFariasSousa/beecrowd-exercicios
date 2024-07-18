select pro.id,pro.name
from products pro
join categories on categories.id=pro.id_categories
where categories.name like ('%super%')