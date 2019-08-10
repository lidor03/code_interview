

#Q 1.1

def is_unique(str):
    #check if str has a unique chars
    my_set = set([])
    for a in str:
        if a in my_set:
            return False
        my_set.add(a)
    return True

def is_unique_clean(str):
    # check if str has a unique chars without extra DS
    first = False
    for x in range(256):
        for a in str:
            if ord(a) == x and first:
                return False
            elif ord(a) == x:
                first = True
        first = False
    return True

# Q 1.2

def check_permutation(str1, str2):
    #check if str2 is a permutation of str1
    my_dict = {}
    for i in range(256):
        my_dict[chr(i)] = 0
    for a in str1:
        my_dict[a] += 1
    for b in str2:
        my_dict[b] -= 1
    for i in range(256):
        if my_dict[chr(i)] != 0:
            return False
    return True

def main():
    print(is_unique("afdgfj"))
    print(is_unique_clean("afdgfj"))
    print(check_permutation("123456", "654321"))
    print(check_permutation("123456", "112233445566"))




if __name__ == '__main__':
    main()

