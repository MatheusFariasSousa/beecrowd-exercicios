while True:
    x=int(input())
    if x==0:
        break
    teste=1
    valor=1
    correspondente=True
    
    for l in range (x):
        for c in range (1,x+1):
            if c+1==x+1:
                print(f"{valor}".rjust(3))
            elif c==1:
                print(f"{valor}".rjust(3),end=" ")
            else:
                 print(f"{valor}".rjust(3),end=" ")
            if valor>1 and correspondente==True:
                valor-=1
            elif valor==1:
                correspondente=False
                valor+=1
            else:
                 valor+=1
        valor=teste+1
        teste+=1
        correspondente=True
    print()