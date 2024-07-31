x=int(input())
y=int(input())
contador_x=0
contador_y=0
decoy=x
deoy2=y

if x>=y:
    while decoy>=y:
        if decoy % 13 !=0:
            contador_x+=decoy
        decoy-=1
        
    print(contador_x)
if y>=x:
    while deoy2>=x:
        if deoy2 % 13 !=0:
            contador_y+=deoy2
        deoy2-=1
        

    print(contador_y)