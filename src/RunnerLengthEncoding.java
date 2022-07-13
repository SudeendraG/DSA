public class RunnerLengthEncoding {
    //input : aabbbcaad -9
    //output : a2b3c1a2d1
    public static void Encode(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length()-1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(str.charAt(i));
                System.out.print(count);
                count = 1;
            }
        }
    }

    public static void main(String[] args) {
        Encode("aabbbcaad");
    }
}
