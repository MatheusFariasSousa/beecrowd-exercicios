t=int(input())
a=0
for x in range(0,1000):
    print(f'N[{x}] = {a}')
    a+=1
    if a==t:
        a=0