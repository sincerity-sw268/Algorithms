word =input()

for i in range(len(word)):
    if word.index(word[i]) > word.index(word[i]):
        print("같은 문자열이 없습니다.")
    elif word.index(word[i]) <= word.index(word[i]):
        print("같은 문자열이 있습니다.")




cnt = {c: word.count(c) for c in set(word)}

for i in cnt.keys():
    if cnt[i] > 1:
        print("같은 문자열이 있습니다")
        break












