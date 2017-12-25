import re

def is_isogram(string):
    return not re.search(r"([^-\s]).*\1", string.lower())
