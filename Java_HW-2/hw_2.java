class HomeWarkTwo  {

    static String firstStr = "hello";
    static String secondStr = "hello";

    public static void twoStr(String one, String two) {
        System.out.println(firstStr.equals(secondStr));
    }

    public static void reverseStr(String strOne, String strTwo) {
        String first = new StringBuilder(strOne).reverse().toString();
        String second = new StringBuilder(strTwo).reverse().toString();
        if (first.equals(second)) {
             System.out.println("Являются");
        } else {
            System.out.println("Не являются");
        }
    }

    public static String reverseRekurse(String str) {
        String rightStr;
        String leftStr;
        int lenght = str.length();
        if (lenght <= 1) {
            System.out.println(str);
            return str;
        }
        leftStr = str.substring(0, lenght / 2);
        rightStr = str.substring(lenght/ 2, lenght);
        return reverseRekurse(rightStr) + reverseRekurse(leftStr);
    }

    public static String replaceToStr(StringBuilder str) {
        String res = str.toString().replace("=", "равно");
        System.out.println(res);
        return res;
    }

    public static String insertIndexStr(StringBuilder str) {
        StringBuilder tmp = new StringBuilder();
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == '=') {
                str.deleteCharAt(index);
                str.insert(index, "равно");
            }
            tmp.append(str.charAt(index));
        }
        String res = tmp.toString();
        System.out.println(res);
        return res;
    }

    public static StringBuilder helpPrintResult(Integer res, int numOne, int numTwo, String signInput ) {
        StringBuilder result = new StringBuilder();
        result = result.append(String.valueOf(numOne))
                                .append(" ")
                                .append(signInput)
                                .append(" ")
                                .append(String.valueOf(numTwo))
                                .append(" ")
                                .append("=")
                                .append(" ")
                                .append(res);
        return result;
        
    }

    public static void convertIntStringBuolder(int a, int b, String sign) {
        StringBuilder result = new StringBuilder();
        switch (sign) {
            case "+":
                Integer res1 = a + b;
                result = helpPrintResult(res1, a, b, sign);
                break;
            case "-":
                Integer res2 = a - b;
                result = helpPrintResult(res2, a, b, sign);
                break;
            case "*":
                 Integer res3 = a * b;
                 result = helpPrintResult(res3, a, b, sign);
            default:
                break;
        }
        System.out.println(result);
        replaceToStr(result);
        insertIndexStr(result);   
    }

    public static void main(String[] args) {
        reverseStr(firstStr, secondStr);
        reverseRekurse("firstStr");
        convertIntStringBuolder(3, 56, "*");
    }
}