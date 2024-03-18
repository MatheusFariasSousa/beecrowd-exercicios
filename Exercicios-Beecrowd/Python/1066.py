impar=0
par=0
neg=0
pos=0
contador=0
while contador != 5 :
    x=int(input())
    contador+=1
    if x>0:
        pos+=1
        if x % 2 ==0 :
            par+=1
        else:
            impar+=1
    elif x<0:
        neg+=1
        if x % 2 ==0 and x!=0:
            par+=1
        elif x %2 != 0 and x!=0:
            impar+=1
    else:
        par+=1
        



print(f'{par} valor(es) par(es)')
print(f'{impar} valor(es) impar(es)')
print(f'{pos} valor(es) positivo(s)')
print(f'{neg} valor(es) negativo(s)')