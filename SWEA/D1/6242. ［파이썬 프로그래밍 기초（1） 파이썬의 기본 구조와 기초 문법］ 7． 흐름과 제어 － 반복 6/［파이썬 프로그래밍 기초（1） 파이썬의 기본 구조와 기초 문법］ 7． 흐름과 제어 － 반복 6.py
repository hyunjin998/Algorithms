list = ['A', 'A', 'A', 'O', 'B', 'B', 'O', 'AB', 'AB', 'O']
dic = {}

for type in list:
    dic[type] = dic.get(type, 0)+1
print(dic)