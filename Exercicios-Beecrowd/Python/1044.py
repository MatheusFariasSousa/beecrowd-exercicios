x,y= input().split(" ")
x = int(x)
y= int(y)
if(y%x== 0)or(x%y== 0): print('Sao Multiplos')
if(y%x!=0)and(x%y!=0):print('Nao sao Multiplos')