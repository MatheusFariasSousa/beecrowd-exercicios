contador=0
maior=0
while contador != 6 :
    x=float(input())
    if x>0:
        maior+=1
    contador+=1
print(f'{maior} valores positivos')