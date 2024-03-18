dias= int(input())
ano= dias//365
meses= (dias%365)//30
diass= dias%365%30
print(f'{ano} ano(s)')
print(f'{meses} mes(es)')
print(f'{diass} dia(s)')