#Bài 1:
""" Cho list A chứa các số nguyên đã sắp xếp theo thứ tự tăng dần.
Vd A = [3, 6, 7, 9, 11, 12] và một số nguyên sum. Tìm tất cả các cặp số (a,b) trong mảng A có tổng bằng sum
vd ở đây nếu sum = 18 thì kết quả là [(7,11), (6,12)]. Nếu không có cặp số nào thỏa mãn thì in ra list rỗng [] """

list_A = [3, 6, 7, 9, 11, 12]
list_result = []
sum = int(input("Nhập tổng:"))
for a in list_A:
    index_a = list_A.index(a)
    list_temp = list_A[(index_a + 1):]
    #print(list_temp)
    for b in list_temp:
        sum_temp = a + b
        if (sum_temp == sum):
            list_result.append((a,b))
if len(list_result) == 0:   
    print("Không có cặp số nào thỏa mãn.")         
else:
    print("Các cặp số thỏa mãn là:")
    print(list_result)