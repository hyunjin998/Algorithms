def factorial(x):
    global total
    if x == 1:
        return print("%d" % total)

    else:
        total *= x
        return factorial(x-1)

total = 1
a = int(input())
factorial(a)