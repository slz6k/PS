n, m = map(int, input().split())
buckets = [b for b in range(n+1)]
for _ in range(m):
  i, j = map(int, input().split())
  buckets[i:j+1] = reversed(buckets[i:j+1])
for b in buckets[1:]:
  print(b, end=' ')