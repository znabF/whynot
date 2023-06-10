
def main():
    number = int(input("Enter a number to compute the factorial of: "))

    i = number
    factorial = number
    while(i != 0):
        lessThan = i - 1
        if(lessThan == 0):
            break
        factorial = i * lessThan
        i = i - 1
    return factorial

print(main())