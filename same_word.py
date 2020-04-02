word1 = list(input())
word2 = list(input())

if sorted(word1) == sorted(word2):
    print("같다")
else:
    print("다르다")