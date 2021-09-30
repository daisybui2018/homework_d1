import sys
def get_words(filename):
    print("function get_words")  

def get_top_words(filename):
  print("function get_top_words")

def main():
    if len(sys.argv) != 3:
        print('usage: ./wordcount.py {--count | --topcount} file')
        sys.exit(1)
    option = sys.argv[1]
    print("option")
    print(option)
    filename = sys.argv[2]
    print(option)
    print(filename)
    sys.exit(1)

if __name__ == '__main__':
  main()