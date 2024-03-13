caso=int(input())
while caso !=0:
    frase=input().split(" ")
    for a in range(len(frase)):
        for posicao,valor in enumerate(frase):
            if posicao+1>=len(frase):
                break
            if len(valor)<len(frase[posicao+1]):
                maior=frase[posicao+1]
                frase.remove(maior)
                frase.insert(posicao,maior)
    for a,b in enumerate(frase):
        if a+1==len(frase):
            print(b)
        else:
            print(b,end=" ")

    
    caso-=1