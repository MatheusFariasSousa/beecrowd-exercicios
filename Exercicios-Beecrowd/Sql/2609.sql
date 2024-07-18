SELECT CAT.NAME,SUM(PRO.AMOUNT)
FROM categories CAT
JOIN products PRO ON PRO.id_categories=CAT.id
GROUP BY CAT.name