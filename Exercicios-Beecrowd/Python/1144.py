x=int(input())
contador=1
n1=1
n2=1
n3=1
contadorn1=0
contadorn2=0
contadorn3=6

for a in range(0,x*2):
    print(n1,n2,n3),
    contadorn1 +=1
    
    if contadorn1==2:
        n1+=1
        contadorn1=0
    if a % 2 !=0:
        contadorn2+=2
        n2 += contadorn2
        n3+=contadorn3
        contador+=1
        contadorn3+=6*contador
        
        
        
    else:
        n2+=1
        n3+=1
    