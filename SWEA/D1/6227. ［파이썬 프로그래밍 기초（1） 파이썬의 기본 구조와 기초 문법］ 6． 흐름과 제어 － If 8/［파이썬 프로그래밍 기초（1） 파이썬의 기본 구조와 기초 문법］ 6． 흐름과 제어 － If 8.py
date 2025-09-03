nums = [str(i) for i in range(200, 300) if i//10%2==0 and  i%2==0]
result = ",".join(nums)
print(result)