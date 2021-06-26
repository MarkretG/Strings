package Strings;

public class RomanSymbolsToDecimal {
    int valueOfRomanSymbols(char c) {
        if (c == 'I')
            return 1;
        if (c == 'V')
            return 5;
        if (c == 'X')
            return 10;
        if (c == 'L')
            return 50;
        if (c == 'C')
            return 100;
        if (c == 'D')
            return 500;
        if (c == 'M')
            return 1000;
        return -1;
    }

    int ConvertRomanToDecimal(String str, int len) {
        int n1, n2, res = 0;
        for (int i = 0; i < len; i++)
        {
            n1 = valueOfRomanSymbols(str.charAt(i));
            if (i + 1<len)
            {
                n2 = valueOfRomanSymbols(str.charAt(i + 1));
                if (n1 >= n2)
                    res = res + n1;
                else {
                    res = res + n2 - n1;
                    i++;
                }

            }
            else
                return res+n1;
        }
        return res;
    }
}