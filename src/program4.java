public class program4 {
    public static void main(String[] args) {
//wipro
        //ques-4 input:string:world wide web
        //step - 1
        //world = [W-0]=[0-L]+[R]= [23-4]+[15-12]+[18]=40
        //step - 2
        //convert all result into int
        String str = "World Wide Web";
        //string str1= str.toUpperCase();
        //string res = "";
        int sum = 0;
        String total = "";
        String arr[]= str.toUpperCase().split(" ");
        for (String s : arr) {
            for (int i = 0; i < s.length() / 2; i++) {
                char result = s.charAt(i);
                int result2 = s.charAt(s.length() - 1 - i)-64;
                int diff = Math.abs(result - result2);
                sum = sum + diff;
            }
            if (s.length() % 2 != 0) {
                int ch3 = s.charAt(s.length() / 2) - 64;
                sum = sum + ch3;
            }
        }
        total = total + sum;
        System.out.print(total);
    }
}
