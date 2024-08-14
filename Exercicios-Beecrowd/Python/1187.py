entrada=144
contador=0
primeiro=1
segundo=11
lista_branca=[]
lista_verde=[]
operacao=str(input()).upper()
try:
    while entrada !=84:
        valor=float(input())
        entrada-=1
        contador+=1
        lista_branca.append(valor)
        if contador==12:
            contador=0
            for a in range(primeiro,segundo):
                lista_verde.append(lista_branca[a])
            lista_branca.clear()
            primeiro+=1
            segundo-=1
        
    
        

    while entrada!=0:
        valor=float(input())
        entrada-=1
        
except:
    EOFError



soma=sum(lista_verde)
if operacao=="S":
    print(f"{soma:.1f}")
elif operacao=="M":
    print(f"{(soma/30):.1f}")