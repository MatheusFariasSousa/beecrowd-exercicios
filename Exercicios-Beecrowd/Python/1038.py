codigo=str(input()).strip()
contador=0
preço=0
dicionario_preço={'1':4.00,'2':4.50,'3':5.00,'4':2.00,'5':1.50 }
dicionario_codigo={'1':1,'2':2,'3':3,'4':4,'5':5}
for x in dicionario_preço.keys():
    if codigo[0]==x:
        contador=dicionario_preço[x]
for z in dicionario_codigo.keys():
    if codigo[2]==z:
        preço=dicionario_codigo[z]


resultado = contador*preço
print(f'Total: R$ {resultado:.2f}')