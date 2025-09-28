def squareNum(num):
    print(f"square({num}) => {num**2}")

num1, num2 = map(int, input().split(', '))
squareNum(num1)
squareNum(num2)