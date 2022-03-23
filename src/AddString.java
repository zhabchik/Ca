public class AddString {
    String str1;
    String str2;

    AddString(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }


    public String addString() {
        str1 = str1.substring(0, str1.length() - 1); // "Hello" -> "Hello
        str2 = str2.substring(1);                   //"World" -> World"
        //System.out.println(str1 + str2);            //Вывод
        return str1 + str2;                         //вернули строку в основную программу
    }
}