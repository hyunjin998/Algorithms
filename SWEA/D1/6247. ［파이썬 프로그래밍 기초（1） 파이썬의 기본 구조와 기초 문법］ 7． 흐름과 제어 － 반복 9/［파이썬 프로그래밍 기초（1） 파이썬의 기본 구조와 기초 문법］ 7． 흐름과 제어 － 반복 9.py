i, j = 0, 7
while i<4:
    while j>0:
        print("{0}{1}".format(" "*i, "*"*j))
        j-=2
        i+=1