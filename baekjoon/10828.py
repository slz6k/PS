import sys
n = int(sys.stdin.readline())
stack = []
for x in range(n):
  ins = sys.stdin.readline().split()
  if('push' == ins[0]):
    stack.append(ins[1])
  elif('top' == ins[0]):
    if(len(stack) == 0):
      print(-1)
    else:
      print(stack[-1])
  elif('pop' == ins[0]):
    if(len(stack) == 0):
      print(-1)
    else:
      print(stack.pop())
  elif('size' == ins[0]):
    print(len(stack))
  elif('empty' == ins[0]):
    if(len(stack) == 0):
      print(1)
    else:  print(0)