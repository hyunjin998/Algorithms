def LongerStr(str1, str2):
    return str1 if len(str1) > len(str2) else str2

str1, str2 =input().split(', ')
print(LongerStr(str1, str2))