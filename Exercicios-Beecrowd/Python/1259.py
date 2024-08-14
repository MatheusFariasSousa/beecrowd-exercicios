x=int(input())
par=[]
impar=[]
while True:
    valor=int(input())
    if valor %2==0:
        par.append(valor)
    else:
        impar.append(valor)
    x-=1
    if x==0:
        break
teste=sorted(par)
for a in teste:
    print(a)
teste2=sorted(impar)
teste3=reversed(teste2)


for b in teste3:
    print(b)