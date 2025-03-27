def greater(x, y):
    if x < y:
        return "<"
    elif x == y:
        return "="
    else :
        return ">"

T = int(input())
for test_case in range(1, T+1):
    a, b = map(int, input().split())

    print("#{0} {1}".format(test_case, greater(a, b)))