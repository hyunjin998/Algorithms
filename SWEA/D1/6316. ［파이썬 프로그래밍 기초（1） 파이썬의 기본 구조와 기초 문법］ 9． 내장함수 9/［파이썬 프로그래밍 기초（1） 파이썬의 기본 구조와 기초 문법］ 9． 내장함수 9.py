nums = list(range(1, 11))
evenNums = list(filter(lambda x: x%2==0, nums))
squareNums = list(map(lambda x: x**2, evenNums))
print(squareNums)