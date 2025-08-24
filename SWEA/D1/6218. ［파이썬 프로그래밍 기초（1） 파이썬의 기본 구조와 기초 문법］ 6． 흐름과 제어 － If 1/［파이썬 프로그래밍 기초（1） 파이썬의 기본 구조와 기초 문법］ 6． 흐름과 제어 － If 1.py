num = int(input())
for i in range(1, num+1):
    if num%i == 0:
        print("%d(은)는 %d의 약수입니다." % (i, num))