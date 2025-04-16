def longer_than(x, y):
    if len(x) > len(y): return print_longer_than(x)
    elif len(x) == len(y):
        print("길이가 같습니다.")
    else: return print_longer_than(y)

def print_longer_than(z):
    print(z)

a, b = input().split(', ')
longer_than(a, b)