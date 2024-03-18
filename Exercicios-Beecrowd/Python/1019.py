x= int(input())
segundos = x%60
horas= x//3600
minutoss= x%(24*3600)
minutosss= minutoss%3600
minutos= minutosss//60
print(f'{horas}:{minutos}:{segundos}')