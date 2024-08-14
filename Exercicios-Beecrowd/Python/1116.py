x=int(input())
contador=0
while x != contador:
    a,b=input().split()
    a=int(a)
    b=int(b)
    if b==0:
        print('divisao impossivel')
        
    else:
        print(f'{a/b:.1f}')
    contador+=1