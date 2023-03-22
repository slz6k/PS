n, k = map(int, input().split())
coins = list()
count = 0
for x in range(n):
  coins.append(int(input()))
coins.reverse()
for coin in coins:
  count += k // coin
  k %= coin
print(count)