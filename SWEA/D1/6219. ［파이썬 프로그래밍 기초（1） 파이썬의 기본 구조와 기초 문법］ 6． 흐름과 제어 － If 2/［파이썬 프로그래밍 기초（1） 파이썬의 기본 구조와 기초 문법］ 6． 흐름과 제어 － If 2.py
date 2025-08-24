num = int(input())
cnt = 0;
for i in range (1, num+1):
    if(num%i==0):
        print("%d(은)는 %d의 약수입니다." %(i, num))
        cnt+=1
if(cnt==2): print("%d(은)는 1과 %d로만 나눌 수 있는 소수입니다." %(num, num))