x=144
coluna=int(input())
operacao=str(input()).upper()
contador=-1
lista_da_coluna=[]
while x!=0:
    valor=float(input())
    contador+=1
    if contador==coluna:
        lista_da_coluna.append(valor)
    if contador==12:
        contador=0
    x-=1
resposta=sum(lista_da_coluna)
if operacao=="S":
    print(resposta)
elif operacao=="M":
    media=resposta/12
    print(f"{media:.1f}")