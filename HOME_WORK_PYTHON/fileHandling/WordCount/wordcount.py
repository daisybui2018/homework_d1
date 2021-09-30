#!/usr/bin/python -tt
# Copyright 2010 Google Inc.
# Licensed under the Apache License, Version 2.0
# http://www.apache.org/licenses/LICENSE-2.0
# Quang Le - Techmaster.vn - 09/2021


"""Wordcount exercise

Hàm main() đã được định nghĩa hoàn chỉnh ở dưới. Bạn phải viết hàm get_words()
và get_top_words() mà sẽ được gọi từ main().

1. Với đối số --count, viết hàm get_words(filename) đếm số lần xuất hiện của mỗi từ 
trong file đầu vào và trả list các tuple theo định dạng sau:
[(word1, count1), 
(word2, count2)
...]

Trả ra danh sách trên theo thứ tự từ điển các từ (python sẽ sắp xếp dấu câu đứng trước
các chữ cái nên cũng không thành vấn đề). Lưu tất cả các từ dưới dạng chữ thường,
vì vậy 'The' và 'the' được tính là cùng một từ.

2. Với đối số --topcount, viết hàm get_top_words(filename) tương tự như get_words()
nhưng chỉ trả ra 20 từ thông dụng nhất sắp xếp theo từ thông dụng nhất ở trên cùng.

Tùy chọn: định nghĩa một hàm helper để tránh lặp lại code trong các hàm 
get_words() và get_top_words().

"""

import sys

# +++your code here+++
def get_words(filename):
  # open the file in read mode
  file = open(filename, "r")

  # Create an empty dictionary
  d_result = dict()

  #Loop through each line of the line
  for line in file:
    #Remove the leading spaces and newline character
    line = line.strip()

    #Convert the characters in line to lowercase to avoid case mismatch
    line = line.lower()

    #Split the line into words
    words = line.split(" ")

    # Iterate over each word in line
    for word in words:
      # Check if the word is already in dictionary
      if word in d_result:
        # Increment count of word by 1
            d_result[word] = d_result[word] + 1
      else:
            # Add the word to dictionary with count 1
            d_result[word] = 1
  list_result = list(d_result.items())
  return list_result
  

def get_top_words(filename):
  pass

###

# This basic command line argument parsing code is provided and
# calls the get_words() and get_top_words() functions which you must define.
def main():
  # print(sys.argv)
  if len(sys.argv) != 3:
    print('usage: ./wordcount.py {--count | --topcount} file')
    sys.exit(1)
  option = sys.argv[1]
  filename = sys.argv[2]
  ans = []
  if option == '--count':
    ans = get_words(filename)
  elif option == '--topcount':
    ans = get_top_words(filename)
  else:
    print('unknown option: ' + option)
    sys.exit(1)

  # print out the answer
  for item in ans:
    print(item[0], item[1])

if __name__ == '__main__':
  main()
