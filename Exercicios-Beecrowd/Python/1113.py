while True:
    a,b=input().split()
    b=int(b)
    a=int(a)
    if a>b:
        print('Decrescente')
    elif b>a:
        print('Crescente')
    elif a==b:
        break