import re
from functools import reduce

def word_count(phrase):
    return reduce(lambda count_map, word: count_map.update({ word: count_map.get(word, 0) + 1}) or count_map, re.findall(r"[a-z0-9]+(?:'[a-z0-9]+)?", phrase.lower()), {})
