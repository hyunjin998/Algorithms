def fibonacci(x):
    global a
    curr, next = 0, 1
    for i in range (x):
        curr, next = next, curr+next
        a.append(curr)
    return curr

a = []
num = int(input())
fibonacci(num)
print(a)