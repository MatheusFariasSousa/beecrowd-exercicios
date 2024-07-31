while True:
    a=float(input())
    if a > 10 or a<0:
        print('nota invalida')
    else:
        break
while True:
    b=float(input())
    if b > 10 or b<0:
        print('nota invalida')
    else:
        break
media=(a+b)/2
print(f'media = {media:.2f}')