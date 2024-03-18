a,b=input().split()
a=int(a)
b=int(b)
if a > b :
    a -= 24
    a *= -1
    a +=b
    print(f'O JOGO DUROU {a} HORA(S)')
elif a < b:
    b -=a
    print(f'O JOGO DUROU {b} HORA(S)')
elif a==b:
    print('O JOGO DUROU 24 HORA(S)')