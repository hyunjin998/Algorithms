def game(p1, p2):
    if p1 == p2: return "무승부입니다!"
    elif (rules[p1] == p2): return f"{p1}가 이겼습니다!"
    else: return f"{p2}가 이겼습니다!"

rules = {"가위": "보", "바위": "가위", "보": "바위"}

person1 = input().strip()
person2 = input().strip()
p1 = input().strip()
p2 = input().strip()

print(game(p1, p2))