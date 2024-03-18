a,b,c,d= input().split(" ")
a= float(a)
b= float(b)
c= float(c)
d= float(d)
media= ((a*2) + (b*3) + (c*4) + (d))/10
print(f'Media: {media:.1f}')
if media>= 7:
    print('Aluno aprovado.')
elif media<5:
    print('Aluno reprovado.')
elif media >=5 and media<6.9:
     print('Aluno em exame.')
     exame= float(input())
     print(f'Nota do exame: {exame:.1f}')
     media_final = (exame+media)/2
     if media_final>=5 :print('Aluno aprovado.')
     if media_final<=4.9: print('Aluno reprovado.')
     print(f'Media final: {media_final:.1f}')