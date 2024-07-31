grenais=0
vitoria_inter=0
vitoria_gremio=0
empates=0

while True:
    inter,gremio=input().split()
    inter=int(inter)
    gremio=int(gremio)
    grenais+=1
    if inter>gremio:
        vitoria_inter+=1
    elif gremio>inter:
        vitoria_gremio+=1
    elif inter==gremio:
        empates+=1
    print('Novo grenal (1-sim 2-nao)')
    config=int(input())
    if config ==2:
        break


print(f'{grenais} grenais')
print(f'Inter:{vitoria_inter}')
print(f'Gremio:{vitoria_gremio}')
print(f'Empates:{empates}')
if vitoria_gremio>vitoria_inter:
    print('Gremio venceu mais')
elif vitoria_gremio<vitoria_inter:
    print('Inter venceu mais')
else:
    print('Nao houve vencedor')