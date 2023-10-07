
# Input the number of rows
print("Enter the Number of Rows: ", end="")
row = int(input())

num = 1
for i in range(row):
    for j in range(i+1):
        print(num, end=" ")
        num = num+1
    print()



"""
OUTPUT:

Enter the Number of Rows: 5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

"""