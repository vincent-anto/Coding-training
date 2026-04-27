c=1
while(c==1):
    print("\n\n\t\t\t ***Number operations***")
    num=int(input("Enter a number :"))
    #Reverse number
    rev=0
    temp=num
    while temp>0:
        digit=temp%10
        rev=rev*10+digit
        temp//=10
    print(f"Reversed Number = {rev}")
    #Palindrome
    print("Palindrome : Yes" if num==rev else "Palindrome : No")
    #Strong number
    def factorial(n):
        f=1
        for i in range(1,n+1):
            f*=i
        return f
    temp=num
    strong_sum=0
    if num==0:
        strong_sum=1
    else:
        while temp>0:
            digit=temp%10
            strong_sum+=factorial(digit)
            temp//=10
    print("Strong number : Yes" if strong_sum==num else "Strong sum : No")
    #Armstrong number
    temp=num
    n=len(str(num))
    arm_sum=0
    while temp>0:
        digit=temp%10
        arm_sum+=digit**n
        temp//=10
    print("Armstrong number : Yes" if arm_sum==num else "Armstrong number : No")
