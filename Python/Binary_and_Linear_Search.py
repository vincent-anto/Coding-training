def linear_search(arr,key):
    for i in range(len(arr)):
        if arr[i]==key:
            return i+1
    return -1
def binary_search(arr,key):
    low=0
    high=len(arr)-1
    while low<=high:
        mid=(low+high)//2
        if arr[mid]==key:
            return mid
        elif arr[mid]<key:
            low=mid+1
        else:
            high=mid-1
    return -1

n=int(input("Enter the number of elements you wanna input :"))
arr=[]
for i in range(0,n):
    num=int(input(f"Enter the element {i+1} :"))
    arr.append(num)
while (1):
    key=int(input("Enter the element to search :"))
    print("\n---Options---")
    print("\n\t\t\t1.Linear Search\n\t\t\t2.Binary Search\n\t\t\t3.Exit")
    choice=int(input("Enter your choice :"))
    if choice==1:
        print("\n---Linear Search---")
        pos=linear_search(arr,key)
        if pos!=-1:
            print(f"Element {key} found at position {pos}")
        else:
            print(f"Element {key} Not found in the array")
    elif choice==2:
        arr.sort()
        print(f"Sorted list for Binary search :")
        for i in range(0,n):
            print(arr[i])
        pos=binary_search(arr,key)
        if pos!=-1:
            print(f"Element {key} found at position of {pos+1}")
        else:
            print(f"Element {key} Not found in the Array")
    elif choice==3:
        print("Exiting the program")
        break
    else:
        print("Invalid choice")
