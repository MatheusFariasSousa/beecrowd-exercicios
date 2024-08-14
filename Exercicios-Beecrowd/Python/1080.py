lista=[]



for x in range(1,101):
    numeros=int(input())
    lista.append(numeros)
maximo=max(lista)
print(maximo)
for a,b in enumerate(lista):
    if b ==maximo:
        print(a+1)
        break