def modInverse(a, m):
    print("( x *", a, ") %", m)
    print("Computing for x to complete the modular multiplicative inverse...")
    for i in range(m):
        if (i * a) % m == 1:
            print("(",i,"*",a , ") %",m)
            print("x is", i)
modInverse(10, 17)      