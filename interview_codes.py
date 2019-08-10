

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

def main():
    print(is_unique("afdgfj"))
    print(is_unique_clean("afdgfj"))



if __name__ == '__main__':
    main()

