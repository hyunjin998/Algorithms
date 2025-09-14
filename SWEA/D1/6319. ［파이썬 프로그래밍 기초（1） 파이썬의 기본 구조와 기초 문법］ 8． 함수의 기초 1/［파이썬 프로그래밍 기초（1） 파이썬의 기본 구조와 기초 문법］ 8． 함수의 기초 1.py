def Palindrome(voca):
    reverseVoca = voca[::-1]
    isPalindrome = True
    
    if reverseVoca != voca: isPalindrome = False
    return PrintResult(voca, isPalindrome)

def PrintResult(voca, isPalindrome):
    print(voca)
    if isPalindrome: print("입력하신 단어는 회문(Palindrome)입니다.")

voca = input()
Palindrome(voca)