package Test1;

import java.math.BigInteger;

public class Test1 {

    public static BigInteger[][] mat_mul(BigInteger[][] x, BigInteger[][] y) {
        BigInteger[][] res = new BigInteger[][]{
                new BigInteger[]{
                        new BigInteger("0"), new BigInteger("0")
                },
                new BigInteger[]{
                        new BigInteger("0"), new BigInteger("0")
                }
        };
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    res[i][j] = res[i][j].add(x[i][k].multiply(y[k][j]));
        return res;
    }

    public static void mat_pow(int n) {
        BigInteger[][] res = new BigInteger[2][2];
        BigInteger[][] c = new BigInteger[2][2];
        c[0][0] = new BigInteger("1");
        c[0][1] = new BigInteger("1");
        c[1][0] = new BigInteger("1");
        c[1][1] = new BigInteger("0");
                for (int i = 0; i < 2; i++) res[i][i] = new BigInteger("1");
        for (int i = 0; i < 2; i++) res[i][1 - i] = new BigInteger("0");
        while (n > 0) {
        if ((n & 1) == 1) res = mat_mul(res, c);
                c = mat_mul(c, c);
                n = n >> 1;
                }
                char[] chars = res[0][1].toString().toCharArray();
                System.out.println(new String(chars, chars.length - 4, 4));
                }

public static void main(String[] args) {
        mat_pow(1000000);
        }
        }
