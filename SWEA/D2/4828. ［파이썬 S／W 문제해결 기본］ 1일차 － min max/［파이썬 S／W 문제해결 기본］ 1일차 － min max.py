for t in range(1, int(input()) + 1):
    input()
    a = list(map(int, input().split()))
    print("#{0} {1}".format(t, max(a)-min(a)))