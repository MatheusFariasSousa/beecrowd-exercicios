select pro.name,der.name
from products pro 
join categories on pro.id_categories=categories.id
join providers der on pro.id_providers = der.id
where id_categories = 6