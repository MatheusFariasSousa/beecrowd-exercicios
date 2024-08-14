while True:
    soma=0
    number1,number2=input().split()
    number1=int(number1)
    number2=int(number2)
    if number2 <=0 or number1 <=0:
        break
    
    elif number1 > number2:
        while number1 >= number2:
            print(number2,end=' ')
            soma +=number2
            number2+=1
        print(f'Sum={soma}')
    elif number2> number1:
        while number2 >= number1:
            print(number1,end=' ')
            soma+=number1
            number1+=1
        print(f'Sum={soma}')
    