def Factorial(num, total):
    if num == 1: return total

    else:
        total *= num
        return Factorial(num-1, total)

num = int(input())
print(Factorial(num, 1))