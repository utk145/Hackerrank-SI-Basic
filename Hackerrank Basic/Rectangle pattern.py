n=int(input())
val=1
for i in range(n):
    for j in range(n,0,-1):
        if j==val:
            print('*',end = '')
        else:    
            print(j,end = '')
    val+=1
    print()    

