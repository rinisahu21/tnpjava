public class program3 {
    public static void main(String[] args) {
        //input:"hello"
        //string arrangement:concert:first char and last char,second char and second last char , then so on
        String str = "aman";
        String str1 = str.toUpperCase();
        String res = "";
        for (int i = 0; i < str1.length() / 2; i++) {
            char result = str1.charAt(i);
            char result2 = str1.charAt(str1.length() - 1 - i);
            res = res + result + result2;
        }
        if (str1.length() % 2 != 0) {
            char ch3 = str1.charAt(str1.length() / 2);
            res = res + ch3;
        }
        System.out.print(res);
    }
}

