contagem=0
while True:
    valor=float(input())
    if valor<=10:
        print(f'A[{contagem}] = {valor:.1f}')
    contagem+=1
    if contagem==100:
        break