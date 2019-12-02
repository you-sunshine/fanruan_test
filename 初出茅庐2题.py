#!/usr/bin/env python
import sys
try:
    if __name__ == "__main__":
        strList = []
        for line in sys.stdin:  # 当没有接受到输入结束信号就一直遍历每一行
            tempStr = line.split()  # 对字符串利用空字符进行切片
            strList.extend(tempStr)  # 把每行的字符串合成到列表
    num = list(map(int, strList))
    if -1 in num:
       num.pop()
    num.sort()
    for i in num:
        print(i)
except:
    pass

