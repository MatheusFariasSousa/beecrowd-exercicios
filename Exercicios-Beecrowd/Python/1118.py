while True:
    nota1=float(input())
    while nota1 > 10 or nota1 <0:
        print('nota invalida')
        nota1=float(input())
    nota2=float(input())
    while nota2 > 10 or nota2 <0:
        print('nota invalida')
        nota2=float(input())
    print(f'media = {(nota1+nota2)/2:.2f}')
    print('novo calculo (1-sim 2-nao)')
    config=int(input())
    while config != 1 and  config!=2 :
        print('novo calculo (1-sim 2-nao)')
        config=int(input())
    if config == 2 :
        break
