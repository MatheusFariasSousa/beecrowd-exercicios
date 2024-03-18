x = int(input())
y= int(input())
resultado = 0
if x==y:print('0')
while y < x :
    if y%2 ==0:
        y -= 1
    y += 2
    if y >= x: break
    resultado += y
while y > x :
    if x%2 == 0:
        x -= 1
    x+= 2
    if x >= y: break
    resultado+= x
print(resultado)