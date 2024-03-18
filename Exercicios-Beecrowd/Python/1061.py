letra,dia=input().split()
hora,minuto,segundo=input().split(':')
dia=int(dia)
hora=int(hora)
minuto=int(minuto)
segundo=int(segundo)

letra_2,dia_2=input().split()
hora_2,minuto_2,segundo_2=input().split(':')
dia_2=int(dia_2)
hora_2=int(hora_2)
minuto_2=int(minuto_2)
segundo_2=int(segundo_2)


segundo_final=0
minuto_final=0
hora_final=0


while True:
    if segundo<=segundo_2:
        segundo_final = segundo_2-segundo
    elif segundo>segundo_2:
        segundo_final = 60-segundo+segundo_2
        minuto+=1
    if minuto<=minuto_2:
        minuto_final=minuto_2-minuto
    elif minuto>minuto_2:
        minuto_final=60-minuto+minuto_2
        hora+=1
    if hora<=hora_2:
        hora_final=hora_2-hora
    elif hora> hora_2:
        hora_final=24-hora+hora_2
        dia +=1
    break
dia_final=dia_2-dia
print(f'{dia_final} dia(s)')
print(f'{hora_final} hora(s)')
print(f'{minuto_final} minuto(s)')
print(f'{segundo_final} segundo(s)')