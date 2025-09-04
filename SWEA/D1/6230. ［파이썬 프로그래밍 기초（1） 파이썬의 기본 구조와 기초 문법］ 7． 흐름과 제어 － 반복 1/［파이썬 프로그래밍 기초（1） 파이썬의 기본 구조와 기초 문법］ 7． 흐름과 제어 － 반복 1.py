grade = [88, 30, 61, 55, 95]
for i in range(0, len(grade)):
    result = "합격" if (grade[i]>=60) else "불합격"
    print("{0}번 학생은 {1}점으로 {2}입니다.".format(i+1, grade[i], result))