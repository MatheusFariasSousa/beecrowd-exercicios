SELECT C.NAME, CAST(((S.math*2)+(S.specific*3)+(S.project_plan*5))/10 AS NUMERIC(15,2)) AS avg FROM candidate C
INNER JOIN score S on C.id = S.candidate_id
ORDER by avg DESC