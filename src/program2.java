public class program2 {
    public static void main(String[] args) {
        //input:"hello"
        // print alphabetical order number of each alphabet of string
        String str = "hello";
        for (int i = 0; i < str.length(); i++) {
            int ch =((int) str.charAt(i));
            if (ch >= 'A' && ch <= 'Z') {
                int position = ch - 'A' + 1;
                System.out.print(position);
            } else if (ch >= 'a' && ch <= 'z') {
                int position = ch - 'a' + 1;
                System.out.print(position);}
        }
    }
}
