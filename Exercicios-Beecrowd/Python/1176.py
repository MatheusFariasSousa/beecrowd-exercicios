lista=[0,1]
contagem=int(input())
while True:
    valor=int(input())
    if valor<2:
        print(f'Fib({valor}) = {lista[valor]}')
    else:
        for x in range(0,valor):
            resultado=lista[x]+lista[x+1]
            lista.append(resultado)
        print(f'Fib({valor}) = {lista[valor]}')
    lista.clear()
    lista=[0,1]

    
    contagem-=1
    if contagem==0:
        break  