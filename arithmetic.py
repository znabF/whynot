def generate(start, common_difference, numOfTerms):
    sequence = [numOfTerms]

    for i in range(numOfTerms + 1):
        previous = i - 1
        if previous < 0:
            sequence[i] = start
        elif previous == 0:
            sequence[i] = start + common_difference
        else:
            sequence[i] = start + common_difference * previous
    
    print("Sequence:", end="")
    for i in range(numOfTerms):
        print(sequence[i], end="")

generate(5, 6, 5)