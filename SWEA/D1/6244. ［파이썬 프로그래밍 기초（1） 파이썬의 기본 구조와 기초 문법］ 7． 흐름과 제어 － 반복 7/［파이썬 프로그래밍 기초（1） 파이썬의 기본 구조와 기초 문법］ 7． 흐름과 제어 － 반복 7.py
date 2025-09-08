list = [85, 65, 77, 83, 75, 22, 98, 88, 38, 100]
i=0

while(i<len(list)):
    if(list[i] >=80): i+=1
    else: list.pop(i)
print(sum(list))