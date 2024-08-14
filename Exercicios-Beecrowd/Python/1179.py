def func(lista):
    pos=0
    while pos!=5:
        if lista[0] %2 == 0:
            print(f'par[{pos}] = {lista[0]}')
        else:
            print(f'impar[{pos}] = {lista[0]}')
        lista.pop(0)
        if len(lista)==0:
            break
        pos+=1





lista_par=[]
lista_impar=[]

for x in range(0,15):
    valor=int(input())
    if valor %2==0:
        lista_par.append(valor)
    else:
        lista_impar.append(valor)
    if len(lista_par) ==5:
        for a,b in enumerate(lista_par):
            print(f'par[{a}] = {b}')
        lista_par.clear()
    if len(lista_impar) ==5:
        for a,b in enumerate(lista_impar):
            print(f'impar[{a}] = {b}')
        lista_impar.clear()


while len(lista_impar)!=0:
    func(lista_impar)

while len(lista_par)!=0:
    func(lista_par)