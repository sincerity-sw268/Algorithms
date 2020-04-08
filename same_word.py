def permutation(word1, word2):
    if sorted(word1) == sorted(word2):      # O(nlogn)
        return "같다"
    else:
        return "다르다"

print(permutation(list(input()),list(input())))
