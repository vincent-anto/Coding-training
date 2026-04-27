ch=1
while ch==1 :
    n=input("\n\nEnter the patient name :")
    id1=input("Enter the patient ID :")
    ad=input("Enter the patient address :")
    wei=float(input("Enter patient weight :"))
    hei=float(input("Enter patient height :"))
    bmi=wei/hei**2
    if(bmi<=18.5):
        c="Under weight"
    elif(18.5<bmi<=24.9):
        c="Normal weight"
    elif(24.9<bmi<29.9):
        c="Over weight"
    else:
        c="Obesity"
    print("\n\n\t\t\t *** Body Mass Index Calculation ***")
    print("Person ID :",id1)
    print("Name :",n)
    print("Address :",ad)
    print("Weight :",wei)
    print("Height :",hei)
    print(f"BMI :{bmi:.2f}")
    print("Status :",c)
    ch=int(input("Enter '1' to continue :"))

