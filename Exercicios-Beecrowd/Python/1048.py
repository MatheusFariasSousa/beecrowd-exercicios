x=float(input())
if x <=400:
    print(f'Novo salario: {(x*0.15)+x:.2f}')
    print(f'Reajuste ganho: {x*0.15:.2f}')
    print(f'Em percentual: 15 %')

elif x>400 and x<=800:
    print(f'Novo salario: {(x*0.12)+x:.2f}')
    print(f'Reajuste ganho: {x*0.12:.2f}')
    print(f'Em percentual: 12 %')

elif x>800 and x<=1200:
    print(f'Novo salario: {(x*0.10)+x:.2f}')
    print(f'Reajuste ganho: {x*0.10:.2f}')
    print(f'Em percentual: 10 %')
elif x>1200 and x<=2000:
    print(f'Novo salario: {(x*0.07)+x:.2f}')
    print(f'Reajuste ganho: {x*0.07:.2f}')
    print(f'Em percentual: 7 %')
else:
    print(f'Novo salario: {(x*0.04)+x:.2f}')
    print(f'Reajuste ganho: {x*0.04:.2f}')
    print(f'Em percentual: 4 %')