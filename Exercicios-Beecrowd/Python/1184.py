x=0
operacao=str(input()).upper()
contador=-1
push=0
lista_da_coluna=[]
try:
    while x!=144:
        if contador<11:
            valor=float(input())
            contador+=1
            x+=1
            if x==144:
                break
        else:
            contador=push
            push+=1
            for a in range(push):
                valor=float(input())
                lista_da_coluna.append(valor)
                x+=1
                if x==144:
                    break
            
except:
        EOFError
        
    


soma=float(sum(lista_da_coluna))
if operacao=="S":
    print(soma)
elif operacao=="M":
    print(f"{(soma/66.0):.1f}")