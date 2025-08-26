T = int(input())
for test_case in range(T):
    a = input()
    upperOrLower = '소문자' if 'a' <= a <= 'z' else '대문자'
    print("#{0} {1} 는 {2} 입니다.".format(test_case+1, a, upperOrLower))