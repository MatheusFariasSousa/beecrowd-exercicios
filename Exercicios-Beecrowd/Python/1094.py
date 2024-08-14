quantidade=int(input())
contador=0
total_cobaias=0
coelhos=0
ratos=0
sapos=0
while contador!=quantidade:
    numero,animal=input().split()
    numero=int(numero)
    total_cobaias+=numero
    if animal=='C':
        coelhos+=numero
    elif animal=='R':
        ratos+=numero
    else:
        sapos+=numero
    contador+=1
print(f'Total: {total_cobaias} cobaias')
print(f'Total de coelhos: {coelhos}')
print(f'Total de ratos: {ratos}')
print(f'Total de sapos: {sapos}')
print(f'Percentual de coelhos: {(coelhos*100)/total_cobaias:.2f} %')
print(f'Percentual de ratos: {(ratos*100)/total_cobaias:.2f} %')
print(f'Percentual de sapos: {(sapos*100)/total_cobaias:.2f} %')