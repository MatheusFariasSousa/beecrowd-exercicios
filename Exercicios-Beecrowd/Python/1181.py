lista=[]
linha=int(input())
operacao=str(input()).upper()
contagem=0
comeco=0
teste=0
while contagem != 144:
    numero=float(input())
    comeco+=1
    if comeco > (linha*12):
        lista.append(numero)
        teste+=1
        if teste==12:
            if operacao=='S':
                resultado=sum(lista)
            elif operacao=='M':
                resultado=sum(lista)/len(lista)
            print(f'{resultado:.1f}')
    


    contagem+=1