def generate():
    start = int(input("Start of sequence: "))
    numOfTerms = int(input("# of terms: "))
    common_ratio = int(input("Factor to multiply by: "))

    geo_seq = []

    for i in range(numOfTerms):
        previous = i-1
        # if i = 0
        if previous < 0:
            geo_seq.append(start)
        # second term
        elif previous == 0:
            new = start * common_ratio
            geo_seq.append(new)
        else:
            start * (common_ratio**i)
    
    print("Geometric Sequence: ", end="")
    for i in range(numOfTerms):
        print(geo_seq[i], end=" ")
    print()
generate()
    
