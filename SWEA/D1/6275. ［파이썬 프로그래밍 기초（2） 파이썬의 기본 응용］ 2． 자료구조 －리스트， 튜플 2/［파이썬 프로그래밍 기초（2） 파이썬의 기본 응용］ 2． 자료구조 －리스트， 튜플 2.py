a = 'Python is powerful... and fast; plays well with others; runs everywhere; is friendly & easy to learn; is Open.'
b = 'aeiou'
c = [char for char in a if char not in b]
print(*c, sep='')