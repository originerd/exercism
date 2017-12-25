import string
import re

lowercases = list(string.ascii_lowercase)

def is_pangram(sentence):
    return lowercases == sorted(set(list(re.sub(r"[^a-z]", "", sentence.lower()))))
