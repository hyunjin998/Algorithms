T = int(input())
for test_case in range(1, T+1):
    a = list(map(int, input().split()))
    result = list(filter(lambda x: x % 2 == 1, a))
    print("#{0} {1}".format(test_case, sum(result)))