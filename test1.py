#!/usr/bin/python
import sys
def max_list(lt):
    temp = 0
    for i in lt:
        if lt.count(i) > temp:
            max_str = i
            temp = lt.count(i)
    return max_str
try:
    # print("please input")
    if __name__ == "__main__":
        strList = []
        for line in sys.stdin:  # 当没有接受到输入结束信号就一直遍历每一行
            tempStr = line.split()  # 对字符串利用空字符进行切片
            strList.extend(tempStr)  # 把每行的字符串合成到列表
        n = strList[1:]
        # print(n)
        length = len(n)
    if n.count(max_list(n)) > length / 2:
        print(max_list(n))
except:
    pass