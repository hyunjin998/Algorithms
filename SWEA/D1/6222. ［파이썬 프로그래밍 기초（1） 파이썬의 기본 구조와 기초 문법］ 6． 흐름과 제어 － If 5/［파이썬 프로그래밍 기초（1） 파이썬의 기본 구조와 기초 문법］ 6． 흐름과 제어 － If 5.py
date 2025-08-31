s = input()
S = s.lower() if(65 <=ord(s) <= 91) else s.upper() if (97 <= ord(s) <= 122) else s
print("{0}(ASCII: {1}) => {2}(ASCII: {3})".format(s, ord(s), S, ord(S)))