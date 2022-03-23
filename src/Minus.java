public class Minus {
    String str1;
    String str2;

    Minus(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public String minus(){
        str1 = str1.substring(1, str1.length()-1); //hello world - world
        str2 = str2.substring(1, str2.length()-1);
        if (str1.contains(str2)){
            String str11 = str1.substring(0, str1.indexOf(str2));
            String str12 = str1.substring(str1.indexOf(str2) + str2.length());
            return "\"" + str11 + str12 + "\"";
        }else {
//        System.out.println("\"" + str1 + "\"");
            return "\"" + str1 + "\"";
        }
    }
}