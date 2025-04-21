def square(x, y):
    print("square(%d) => %d\nsquare(%d) => %d" % (x, x**2, y, y**2))

a, b = input().split(',')
square(int(a), int(b))