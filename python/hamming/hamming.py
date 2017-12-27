def distance(strand_a, strand_b):
    if len(strand_a) != len(strand_b): raise ValueError("Two strands must be same lengths")

    return len([x for x in zip(strand_a, strand_b) if x[0] != x[1]])
