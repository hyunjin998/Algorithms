def getMax(*args):
    return max(args)

a = [3, 5, 4, 1, 8, 10, 2]
print("max{0} => {1}".format(tuple(a), getMax(*a)))