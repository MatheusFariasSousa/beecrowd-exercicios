contagem=0
while True:
    vetor=int(input())
    if vetor < 1:
        print(f'X[{contagem}] = 1')
    else:
        print(f'X[{contagem}] = {vetor}')
    contagem+=1
    if contagem==10:
        break