i=1
j=7
contador=0
while True:
    print(f'I={i} J={j}')
    contador+=1
    j-=1
    if i==9 and contador==3:
        break
    
    if contador==3:
        i+=2
        contador=0
        j=7