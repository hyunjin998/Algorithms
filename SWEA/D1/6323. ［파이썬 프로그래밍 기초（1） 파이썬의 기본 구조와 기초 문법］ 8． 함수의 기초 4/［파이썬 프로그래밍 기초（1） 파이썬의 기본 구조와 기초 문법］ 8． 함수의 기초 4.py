def Fibo(num):
    if num <= 0: return []
    if num == 1: return [1]
    
    list = [1, 1]
    while len(list) < num:
        list.append(list[-1] + list[-2])
    return list[:num]

num = int(input())
print(Fibo(num))