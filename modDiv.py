def modDiv():
    print("b * c % m = a % m, if inverse it true then modular divison of both occurs and both equations have same answer.")
    a = int(input("Enter a: "))
    b = int(input("Enter b: "))
    m = int(input("Enter m: "))

    modCheck = (a % m)
    i = 0
    # clock analogy-Khan Academy
    for i in range(m + 1):
        if (b * i % m) == modCheck:
            inverse = i
            print("We can successfully do modular division if inverse",inverse,"is applied")
            return inverse
    if inverse > (m+1):
        print("Unsuccessful modular divison, change the numbers so both expressions become true to each other.")

modDiv()