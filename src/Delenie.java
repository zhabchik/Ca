public class Delenie {
    String str1;
    int num;

    Delenie(String str1, int num) {
        this.str1 = str1;
        this.num = num;
    }

    public String delenie(){
        str1 = str1.substring(1, str1.length() - 1);
        int strLen = str1.length();
        int n = strLen / num;
        str1 = str1.substring(0, n);
        return "\"" + str1 + "\"";
    }
}