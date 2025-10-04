a = ['영', '일', '이', '삼', '사']
print(a[-0])    # -0은 0
print(a[-1])    # -1은 맨뒤
print(a[-2])    # -2는 맨뒤에서 두번째

b = 'abcdef'
print(b[2])     # 문자열도 배열 취급

c = [1,2,3,4]
# 배열 초기화
c = []
c = list()

# 슬라이싱
print( a[0:2])  # 0부터 2 바로 앞
print( a[1:2])
print( a[1:20]) # 마지막 index가 커도 배열의 끝까지만
print( a[10:20]) # 에러 없음
print( a[100:20]) # 에러 없음

print(6, a[1:]) # 1부터 끝까지
print(7, a[:3]) # 처음부터 3번째까지

d = ['오', '육', '칠']
print(a + d)    # 배열도 더하기가 된다.
print(a * 3)    # 곱하기도 된다. 반복됨
print(len(a))
# print(1 + "a")    문자와 숫자는 더할수 없다
# print("a" + 1)
print("a" + str(1)) # str: 문자와 숫자를 더해줌

del a[1]    # 지우기
# del a[2:] 슬라이싱으로도 가능

# range
## range(시작숫자, 종료숫자, step)
## 시작 숫자부터 종료 숫자 바로앞까지 step씩 증가하면서
r = range(10)   # 자동으로 숫자 생성
print(1, r)
print(2, list(r))