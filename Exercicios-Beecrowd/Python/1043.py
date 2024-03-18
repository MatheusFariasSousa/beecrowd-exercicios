a,b,c=input().split()
a=float(a)
b=float(b)
c=float(c)
if a+b > c and b+c>a and c+a>b:
    print(f'Perimetro = {a+b+c}')
else:
    print(f'Area = {((a+b)*c)/2}')