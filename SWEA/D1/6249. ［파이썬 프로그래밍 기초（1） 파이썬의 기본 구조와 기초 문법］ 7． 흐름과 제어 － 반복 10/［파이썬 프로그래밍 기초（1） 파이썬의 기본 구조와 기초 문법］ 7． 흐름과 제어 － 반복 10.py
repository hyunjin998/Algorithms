num = int(input())
dic = {}

while(num > 0):
    idx = num%10
    dic[idx] = dic.get(idx, 0)+1
    num //= 10

print(" ".join(str(i) for i in range(10)))
print(" ".join(str(dic.get(i, 0)) for i in range(10)))