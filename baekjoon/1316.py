N = int(input())
answer = 0
for _ in range(N):
    word = input()
    isGroupWord = True
    for i in range(len(word)-1):
        if word[i] != word[i+1]:
            if word[i] in word[i+1:]:
                isGroupWord = False
    if isGroupWord:
        answer += 1
print(answer)