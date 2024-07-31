x=int(input())
y=int(input())
fakex=x
fakey=y

if x>y:
    while x>fakey:
        fakey+=1
        if fakey %5 ==2 or fakey%5==3:
            print(fakey)
        
if y>x:
    while y>fakex:
        fakex +=1
        if fakex %5 ==2 or fakex%5==3:
            print(fakex)
        