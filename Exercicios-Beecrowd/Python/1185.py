entrada=144
contador=11
linha=0
lista=[]
operacao=str(input()).upper()
try:
    while entrada !=0:
        for x in range(contador):
            valor=float(input())
            lista.append(valor)
            linha+=1
            entrada-=1
        while linha !=12:
            valor=float(input())
            linha+=1
            entrada-=1
        contador-=1
        linha=0
except:
    EOFError
soma=sum(lista)
if operacao=="S":
    print(f"{soma:.1f}")
elif operacao=="M":
    print(f"{(soma/66):.1f}")