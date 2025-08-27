list = ["가위", "바위", "보"]
man1 = list.index(input())
man2 = list.index(input())
result = "Win!" if (man1 - man2) % 3 == 1 else "Draw" if man1 == man2 else ""
print(f"Result : Man1 {result}")