entrada=144
contador=0
push=0
lista_branca=[]
lista_verde=[]
operacao=str(input()).upper()
try:
    while entrada !=0:
        if push>=0:
            for x in range(12):    
                valor=float(input())
                entrada-=1
            push-=1
        else:
            for x in range(12):
                valor=float(input())
                entrada-=1
                lista_branca.append(valor)
        if len(lista_branca)!=0:
            for verde in range(push,0):
                numero=lista_branca[verde]
                lista_verde.append(numero)
            lista_branca.clear()
            push-=1
    
        


        
except:
    EOFError
soma=sum(lista_verde)
if operacao=="S":
    print(f"{soma:.1f}")
elif operacao=="M":
    print(f"{(soma/66):.1f}")