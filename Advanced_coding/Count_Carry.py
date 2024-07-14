# A carry is a digit that is transferred to left if sum of digits exceeds 9 while adding two numbers from right-to-left one digit at a time

# You are required to implement the following function, Int NumberOfCarries(int num1 , int num2);

# The functions accepts two numbers ‘num1’ and ‘num2’ as its arguments. You are required to calculate and return  the total number of carries generated while adding digits of two numbers ‘num1’ and ‘ num2’.

# Assumption: num1, num2>=0

# Example:

# Input
# Num 1: 451
# Num 2: 349
# Output
# 2


a = int(input())
b = int(input())

carry = 0 
ct = 0
while(a>0 or b>0):
    t1 = a%10
    t2 = b%10
    if(t1+t2+carry>9):
        ct+=1
        carry = 1
    else:
        carry = 0
    
    a = a//10
    b = b//10
        
print(ct)
    

