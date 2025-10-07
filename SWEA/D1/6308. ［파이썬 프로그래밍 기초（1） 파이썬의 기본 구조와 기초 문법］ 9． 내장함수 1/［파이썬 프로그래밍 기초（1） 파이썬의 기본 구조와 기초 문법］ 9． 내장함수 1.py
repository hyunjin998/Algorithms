# from datetime import date

def when100(name, age):
    # year = date.today().year - age + 100
    year = 2019 - age + 100
    print(f"{name}(은)는 {year}년에 100세가 될 것입니다.")

name = input()
age = int(input())
when100(name, age)