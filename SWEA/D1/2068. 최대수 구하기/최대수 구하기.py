T = int(input())

for test_case in range(1, T+1):
    a = list(map(int, input().split()))
    print("#{0} {1}".format(test_case, max(a)))