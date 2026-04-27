print("Choices:\n\t\t 1.Sum of the tuple \n\t\t 2.all pair combinations\n")
cho=int(input("Enter your choice :"))
if cho==1:
    n = int(input("Enter the number of sets you want to input: "))
    num = int(input("Enter the number of data you want to input for each set: "))
    result = []
    for i in range(1, n + 1):
        a = []
        for j in range(1, num + 1):
            elem = int(input(f"Enter the element for set {i} & element {j}: "))
            a.append(elem)
        tup = tuple(a)
        result.append(sum(tup))
    print(tuple(result))
elif cho==2:
    nu = int(input("Enter the number of data you want to input for tuple 1 :"))
    tup1 = tuple(input(f"Enter element {i+1}: ")for i in range(nu))
    nu = int(input("Enter the number of data you want to input for tuple 2 :"))
    tup2 = tuple(input(f"Enter element {j+1}: ")for j in range(nu))
    print(tup1)
    print(tup2)
    res = []
    for x in tup1:
        for y in tup2:
            res.append((x, y))
            res.append((y, x))
    print("All pair combination : ",res)
else:
    print("Invalid choice...")
