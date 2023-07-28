words = [["" for i in range(15)] for j in range(5)]
result = ""
for i in range(5):
    word = input()
    for j in range(len(word)):
        words[i][j] = word[j]

for x in range(15):
    for y in range(5):
        if words[y][x] != "":
            result += words[y][x]

print(result)