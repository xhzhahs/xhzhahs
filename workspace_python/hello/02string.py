a = '글씨'
# length
print( len(a) )

# printf같은 역할
b = f'이번 {a}는 '
print( b )

# count는 몇개가 들어가는지 세줌

# find는 indexOf 없으면 -1

c = '123123'
d = c.replace('2', '이')
print(c)
# 원본은 바꾸지 않는다.
# 한개만 replace하지 않고 그 문장에 있는 것을 다 바꾼다.
print(d)