a,b,c=input().split()
a=float(a)
b=float(b)
c=float(c)
lista=[]
lista.append(a)
lista.append(b)
lista.append(c)
lista.sort()
if (lista[2]**2)>(lista[0]**2)+(lista[1]**2):
    if lista[2]>=lista[0]+lista[1]:
        print('NAO FORMA TRIANGULO')
    elif lista[2]==lista[0] or lista[0]==lista[1] or lista[1]==lista[2]:
        print('TRIANGULO OBTUSANGULO')
        print('TRIANGULO ISOSCELES')
    else:
        print('TRIANGULO OBTUSANGULO')
elif (lista[2]**2)==(lista[0]**2)+(lista[1]**2):
    print('TRIANGULO RETANGULO')
elif (lista[2]**2)<(lista[0]**2)+(lista[1]**2):
    print('TRIANGULO ACUTANGULO')
    if lista[2]==lista[0]==lista[1]:
        print('TRIANGULO EQUILATERO')
    elif lista[2]==lista[0] or lista[0]==lista[1] or lista[1]==lista[2]:
        print('TRIANGULO ISOSCELES')