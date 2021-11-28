'''
# Sample code to perform I/O:
 
name = input()                  # Reading input from STDIN
print('Hi, %s.' % name)         # Writing output to STDOUT
 
# Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
'''
 
# Write your code here
t = int(input())
while t > 0:
    t -= 1
    n, k = map(int, input().split())
    s = sum(map(int, input().split()))
    
    print(max(0, s // (k + 1) - n + 1))
