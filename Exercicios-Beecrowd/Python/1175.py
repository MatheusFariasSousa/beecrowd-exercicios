lista=[]
for x in range(0,20):
    valor=int(input())
    lista.append(valor)

lista.reverse()
for a,b in  enumerate(lista):
    print(f'N[{a}] = {b}')