contador=0
media=0
maior=0
while contador != 6 :
    x=float(input())
    if x>0:
        maior+=1
        media += x
    contador+=1
print(f'{maior} valores positivos')
print(f'{media/maior:.1f}')