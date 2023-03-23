word = input()
p = 1
for i in range(len(word)):
  if(word[i] != word[len(word)-1-i]):
    p = 0
    break
print(p)