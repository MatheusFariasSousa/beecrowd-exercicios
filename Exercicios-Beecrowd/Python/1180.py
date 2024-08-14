lista=[]
x=int(input())
teste=input().split()
for a in teste:
    a=int(a)
    lista.append(a)

print(f'Menor valor: {min(lista)}')
print(f'Posicao: {lista.index(min(lista))}')