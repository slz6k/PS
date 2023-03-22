import math
score, grade = list(), list()
sum = 0.0
for x in range(20):
  subject, s, g = input().split()
  score.append(float(s))
  if(g == 'A+'): grade.append(4.5)
  elif(g == 'A0'): grade.append(4.0)
  elif(g == 'B+'): grade.append(3.5)
  elif(g == 'B0'): grade.append(3.0)
  elif(g == 'C+'): grade.append(2.5)
  elif(g == 'C0'): grade.append(2.0)
  elif(g == 'D+'): grade.append(1.5)
  elif(g == 'D0'): grade.append(1.0)
  elif(g == 'F'): grade.append(0.0)
  else: 
    score[x] = 0.0
    grade.append(0.0)

for i in range(20):
  sum += score[i] * grade[i]
print(sum / math.fsum(score))