str = "ADCBBBBCABBCBDACBDCAACDDDCAABABDBCBCBDBDBDDABBAAAAAAADADBDBCBDABADCADC"
total = list(map(lambda x: ord('E') - ord(x), str))
print(sum(total))