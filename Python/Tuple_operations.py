def check_palindromes_in_tuple(tup,tup1):
    for i in range(len(tup)):
        if(tup[i]==tup1[i]):
            print(f"{tup[i]} is a Palindrome")
        else:
            print(f"{tup[i]} is a NOT Palindrome")
    return;
def is_balanced(string):
    stack = []
    for char in string:
        if char in "({[":
            stack.append(char)
        elif char in ")}]":
            if not stack:
                return False
            top = stack.pop()
            if (char == ")" and top != "(") or \
               (char == "}" and top != "{") or \
               (char == "]" and top != "["):
                return False
    return not stack
a=[]
b=[]
n=int(input("Enter the number of tuple you wanna input:"))
tup = tuple(input(f"Enter element {i+1}: ")for i in range(n))
print("Given tuple :",tup)
for i in range(0,len(tup)):
    cout=0
    reversed_string=""
    for char in (tup[i]):
        reversed_string = char + reversed_string
        if char in ('p', 'P'):
            cout += 1
    a.append(reversed_string)
    b.append(cout)
tup1=tuple(a)
tup2=tuple(b)
print("Reversed tuple :",tup1)
print("Frequency of 'P' or 'p' in tuple :",tup2)
check_palindromes_in_tuple(tup,tup1)
for string in tup:
    if is_balanced(string):
        print(f"The string '{string}' is balanced.")
    else:
        print(f"The string '{string}' is NOT balanced.")
