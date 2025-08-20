list = [85, 65, 77, 83, 75, 22, 98, 88, 38, 100]
idx = 0
while(idx < len(list)):
    if(list[idx] < 80): list.pop(idx)
    else: idx+=1
print(sum(list))