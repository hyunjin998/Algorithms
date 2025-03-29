a = []
b = []
for i in range(0, 10, 1):
    a.append(i)
    b.append(0)

num = int(input())

while(num>0):
    b[num%10] += 1
    num = num // 10

print(*a)
print(*b)