def generate():
    start = int(input("Starting # of sequence: "))
    numOfTerms = int(input("# of terms: "))
    common_difference = int(input("Enter common difference: "))
    sequence = []

    for i in range(numOfTerms):
        previous = i - 1
        if previous < 0:
            sequence.append(start)
        elif previous == 0:
            sequence.append(start + common_difference)
        else:
            sequence.append(start + common_difference * previous)
    
    print("Sequence: ", end="")
    for i in range(numOfTerms):
        print(sequence[i], end=" ")
    print()

generate()