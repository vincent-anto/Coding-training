def minimum_num(numbers):
    minimum = numbers[0]
    for num in numbers:
        if num < minimum:
            minimum = num
    print(f"The minimum number in the list is: {minimum}")
    return
"""----------------------------------------------------------------------------------------------------------------------------"""
def sorting_num(a):
    for i in range(len(a)):
        for j in range(0, len(a) - i - 1):
            if a[j] > a[j + 1]:
                a[j], a[j + 1] = a[j + 1], a[j]
    print(a)
    return a
"""----------------------------------------------------------------------------------------------------------------------------"""
def rotate_list_clockwise(lst, rotations):
    num_rotations = rotations % len(lst)
    return lst[-num_rotations:] + lst[:-num_rotations]
my_list = ["MCA", 100, 99.56, "-200"]
rotated_list = rotate_list_clockwise(my_list, 3)
print(f"Original list: {my_list}")
print(f"List after 3 rotations: {rotated_list}")
"""----------------------------------------------------------------------------------------------------------------------------"""
source_list = [ [ 1, 20, -60,0], [2, 10, -6 ], [3, 4], [ 70,-80,90,100,0,0] ]
list1_positives = []
list2_negatives = []
list3_zeros = []
for sublist in source_list:
    for item in sublist:
        if isinstance(item, str):
            parts = item.split(',')
            for part in parts:
                try:
                    num = int(part)
                    if num > 0:
                        list1_positives.append(num)
                    elif num < 0:
                        list2_negatives.append(num)
                    else:
                        list3_zeros.append(num)
                except ValueError:
                    pass
        else:
            if item > 0:
                list1_positives.append(item)
            elif item < 0:
                list2_negatives.append(item)
            else:
                list3_zeros.append(item)
print(f"List 1 (Positives): {list1_positives}")
print(f"List 2 (Negatives): {list2_negatives}")
print(f"List 3 (Zeros): {list3_zeros}")
"""----------------------------------------------------------------------------------------------------------------------------"""
def find_max_frequency_element(input_list):
    max_frequency = 0
    most_frequent_element = None

    for element in sorted(set(input_list), reverse=True):
        current_frequency = input_list.count(element)
        
        if current_frequency > max_frequency:
            max_frequency = current_frequency
            most_frequent_element = element
        elif current_frequency == max_frequency:
            pass 
            
    return most_frequent_element, max_frequency

my_list = [45, 20, 11, 50, 17, 45, 50, 13, 45]
element, frequency = find_max_frequency_element(my_list)
print(f"element = {element} frequency = {frequency}")
"""----------------------------------------------------------------------------------------------------------------------------"""
def input_list():
    my_list=[]
    num = int(input("Enter the number of data you want to input : "))
    for j in range(1, num + 1):
            elem = int(input(f"Enter the element {j}: "))
            my_list.append(elem)
    return my_list;



print("Options:\n\t\t\t 1.Minimum number \n\t\t\t 2.Sorting \n\t\t\t 3.Rotate list \n\t\t\t 4.Separation \n\t\t\t 5.Maximum frequency\n")
cho=int(input("Enter your choice : "))
lis=[]
if cho==1:
    lis=input_list()
    minimum_num(lis)
elif cho==2:
    lis=input_list()
    lis=sorting_num(lis)
elif cho==3:
    
elif cho==4:
    n = int(input("Enter the number of sets you want to input: "))
    num = int(input("Enter the number of data you want to input for each set: "))
    result = []
    for i in range(1, n + 1):
        a = []
        for j in range(1, num + 1):
            elem = int(input(f"Enter the element for set {i} & element {j}: "))
            a.append(elem)
        result.append(a)
elif cho==5:
    
else:
    print("Invalid choice...")






