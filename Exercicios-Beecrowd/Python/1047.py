hora_inicial,minuto_inicial,hora_final,minuto_final=input().split()
hora_inicial=int(hora_inicial)
minuto_inicial=int(minuto_inicial)
hora_final=int(hora_final)
minuto_final=int(minuto_final)

contador_hora=0
contador_minuto=0
while True:
    if minuto_inicial<=minuto_final:
        contador_minuto=minuto_final-minuto_inicial
    elif minuto_inicial>minuto_final:
        contador_minuto=60-minuto_inicial+minuto_final
        hora_inicial+=1
    if hora_inicial<=hora_final:
        contador_hora=hora_final-hora_inicial
    elif hora_inicial>hora_final:
        contador_hora=24-hora_inicial+hora_final

    break

if contador_hora==0 and contador_minuto==0:
    contador_hora+=24

print(f'O JOGO DUROU {contador_hora} HORA(S) E {contador_minuto} MINUTO(S)')