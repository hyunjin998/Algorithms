def Multiply(*args):
    if all(isinstance(n, int) for n in args):
        result = 1
        for n in args:
            result *= n
        return result
    else:
        return "에러발생"

print(Multiply(1, 2, '4', 3))