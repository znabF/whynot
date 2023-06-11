def generate(start, commonDifference, numOfTerms):
    sequence = []
    sequence[0] = start

    for i in range(numOfTerms):
        previous = i - 1
        sequence[i] = start + commonDifference * previous    
    print(sequence)

generate(5, 6, 5)