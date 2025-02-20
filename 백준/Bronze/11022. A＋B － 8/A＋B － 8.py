k = int(input())
resulta = [0]*k
resultb = [0]*k
result = [0]*k
for i in range(k):
    a, b= map(int, input().split())
    resulta[i]=a
    resultb[i]=b
    result[i]=a+b
for j in range(k):
    print("Case #",(j+1),": ",resulta[j]," + ",resultb[j]," = ",result[j], sep='')