nums = [str(i) for i in range(1, 201) if i % 7 == 0 and i % 5 != 0]
result = ",".join(nums)
print(result)