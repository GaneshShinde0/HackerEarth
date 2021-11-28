'''
Problem
You are given an array  of length  and can perform the following operation on the array:

Select a subarray from array  having the same value of elements and decrease the value of all the elements in that subarray by any positive integer .
Find the minimum number of operations required to make all the elements of array  equal to zero.

Input format

The first line contains an integer  denoting the number of elements in the array.
The next line contains space-separated integers denoting the elements of array .
Output format

Print the minimum number of operations required to make all the elements of array  equal to zero.

Constraints


Sample Input
5
2 2 1 3 1
Sample Output
4
Time Limit: 1
'''
n=int(input())
#for i in range(n):
    #m,k=map(int, input().split())
seq=list(map(int, input().split()))
j=0
c=1
while (j<len(seq)-1):
    if seq[j]!=seq[j+1]:
        c+=1
    j+=1
print(c)
