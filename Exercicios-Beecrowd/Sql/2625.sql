SELECT 
    SUBSTRING(N.CPF FROM 1 FOR 3) || '.' || 
    SUBSTRING(N.CPF FROM 4 FOR 3) || '.' || 
    SUBSTRING(N.CPF FROM 7 FOR 3) || '-' || 
    SUBSTRING(N.CPF FROM 10 FOR 2) AS resultado 
FROM 
    natural_person N
INNER JOIN 
    customers C 
ON 
    C.id = N.id_customers