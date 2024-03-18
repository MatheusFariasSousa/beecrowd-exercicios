x=float(input())
if x <= 2000:
    print(f'Isento')
elif x>200 and x<=3000:
    print(f'R$ {(x-2000)*0.08:.2f}')
elif x>3000 and x <=4500:
    print(f'R$ {((x-3000)*0.18)+80:.2f}')
else:
    print(f'R$ {((x-4500)*0.28)+350:.2f}')