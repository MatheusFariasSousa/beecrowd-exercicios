x= int(input())
contador=0
soma=0
while x != contador:
    n1,n2=input().split()
    n1=int(n1)
    n2=int(n2)
    if n1>n2:
        while n1>n2:
            n1-=1
            if n2==n1:
                break
            if n1 %2 !=0:
                soma+=n1
    elif n2>n1:
        while n2>n1:
            n2-=1
            if n2==n1:
                break
            if n2%2 !=0:
                soma+=n2

    
    print(soma)
    soma=0
    contador+=1