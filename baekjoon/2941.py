word = input()
croatians = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
for c in croatians:
  word = word.replace(c, ' ')
print(len(word))