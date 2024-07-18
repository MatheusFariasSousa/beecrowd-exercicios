select mo.id,mo.name from movies mo 
join genres ge on ge.id=mo.id_genres
where ge.description = 'Action'