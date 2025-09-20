def isPrime(num):
    for i in range (2, num):
        if num%i == 0: return 0;

num = int(input())
print("소수가 아닙니다." if isPrime(num) == 0 else "소수입니다.")