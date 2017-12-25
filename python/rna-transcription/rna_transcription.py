import re

def to_rna(dna_strand):
    if re.search(r"[^GCTA]", dna_strand): raise ValueError("DNA strand must not contain except G, C, T, A.")

    return dna_strand.translate(str.maketrans("GCTA", "CGAU"))
