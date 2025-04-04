h,m = map(int,input().split())
x = int(input())
m=m+x
h=h+m//60
if(h>23):
    h=h%24
if(m>59):
    m=m%60
print(h,m)