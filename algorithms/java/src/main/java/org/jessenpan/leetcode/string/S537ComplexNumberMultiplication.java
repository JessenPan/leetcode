package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S537ComplexNumberMultiplication {

    private static final char PLUS = '+';

    private static final char MINUS = '-';

    private static final char SYMBOL = 'i';

    static class Plural{
        int a,b;
    }

    public String complexNumberMultiply(String x, String y) {

        Plural pluralX=parseStr(x);
        Plural pluralY = parseStr(y);

        return new StringBuilder().append(pluralX.a * pluralY.a - pluralX.b * pluralY.b).append("+").append(pluralX.a * pluralY.b + pluralX.b * pluralY.a).append("i").toString();
    }

    private Plural parseStr(String x){
        int plusIndex = 0;
        Plural plural = new Plural();
        int len = x.length();
        for (int i = 0; i < len; i++) {
            if(x.charAt(i)==PLUS){
                plural.a=Integer.parseInt(x.substring(0,i));
                plusIndex=i;
                continue;
            }
            if(x.charAt(i)==SYMBOL){
                plural.b=Integer.parseInt(x.substring(plusIndex+1,i));
            }
        }
        return plural;
    }
}
