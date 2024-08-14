x=int(input())
contador=0
while x != contador:
    media1,media2,media3=input().split()
    media1=float(media1)
    media2=float(media2)
    media3=float(media3)
    media1*=2
    media2*=3
    media3*=5
    media_final=(media1+media2+media3)/10
    print(f'{media_final:.1f}')
    contador+=1