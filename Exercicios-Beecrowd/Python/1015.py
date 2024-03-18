xum,ym,= input().split(" ")
xoi,yoi= input().split(" ")
xum= float(xum)
xoi= float(xoi)
yoi= float(yoi)
ym= float(ym)
raiz= (xoi-xum)**2 +(yoi-ym)**2
resultado= (raiz**0.5)
print(f"{resultado:.4f}")