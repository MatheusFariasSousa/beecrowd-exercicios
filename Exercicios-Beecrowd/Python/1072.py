x=int(input())
contador=0
out=0
inn=0
while x !=contador:
    teste=int(input())
    if teste >=10 and teste<=20:
        inn+=1
    else:
        out+=1
    contador+=1
print(f'{inn} in')
print(f'{out} out')
