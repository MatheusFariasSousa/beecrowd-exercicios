i=0
j=1
b=0.2
contador=0
outro=0
sem_virgula=0
while True:
    
    contador+=1
    if sem_virgula <3 or sem_virgula>=15 and sem_virgula<18 or sem_virgula>=30:
        print(f'I={i:.0f} J={j:.0f}')
    else:
        print(f'I={i:.1f} J={j:.1f}')
    sem_virgula+=1
    
    if contador==3 and j==5:
        break
    j+=1
    if contador==3:
        contador=0
        i+=b
        j-=3
        j+=b
        outro+=1
    
    if outro==11:
        break