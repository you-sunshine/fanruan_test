#!/usr/bin/env python
# Created by iFantastic on 2019/12/3 10:06
import sys
import hashlib
if __name__ == '__main__':
    strList = []
    for line in sys.stdin:  # 当没有接受到输入结束信号就一直遍历每一行
        tempStr = line.split()  # 对字符串利用空字符进行切片
        strList.extend(tempStr)  # 把每行的字符串合成到列表
    strList1 = list(map(int, strList))
    m = strList1[0]
    rest = strList1[1:]
    a = rest[0:m]
    n = rest[m]
    b = rest[m + 1:len(rest)]  # 截取数组b
    tmp = [val for val in a if val in b]
    s = "".join(map(lambda x: str(x), tmp))  # 将数组转化为字符串
    s1 = '[' + s + ']'
    Md5 = hashlib.md5()  # 将字符串用MD5加密
    Md5.update(s1.encode("utf8"))
    print(Md5.hexdigest())
