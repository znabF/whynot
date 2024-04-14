def generate():
    start = int(input("Start of sequence: "))
    numOfTerms = int(input("# of terms: "))
    common_ratio = int(input("Factor to multiply by: "))

    geo_seq = [start * (common_ratio**n) for n in range(numOfTerms)]

    # for i in range(numOfTerms):
    #     previous = i-1
    #     # if i = 0
    #     if previous < 0:
    #         geo_seq.append(start)
    #     # second term
    #     elif previous == 0:
    #         new = start * common_ratio
    #         geo_seq.append(new)
    #     else:
    #         factor = common_ratio**(i-1)
    #         new = start * factor
    #         geo_seq.append(new)
    
    print("Geometric Sequence: ", end="")
    length = len(geo_seq) + 1
    for i in range(len(geo_seq)):
        print(geo_seq[i], end=" ")
    print()
generate()
    
