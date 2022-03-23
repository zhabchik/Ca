import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in); //Для чтения из консоли
        String str = console.nextLine(); //"Hello" + 5

        if (str.charAt(0) == '\"'){

        }else {
            System.out.println("ошибка");
            System.exit(-1);
        }

        if (str.indexOf('\"', 1) != -1){

        }else {
            System.out.println("ошибка");
            System.exit(-1);
        }

        String str1 = str.substring(0, str.indexOf('\"', 1) + 1);
        if (str1.length() > 12){
            System.out.println("длина строки не должна превышать 10 символов");
            System.exit(-1);
        }

        String strDop = str.substring(str1.length());
        char ch = strDop.charAt(1);

        String str2 = strDop.substring(3);
        if (str2.length() > 12){
            System.out.println("длина строки не должна превышать 10 символов");
            System.exit(-1);
        }
        int strNum = 0;
        if (str2.charAt(0) == '\"' && str2.charAt(str2.length() - 1) == '\"'){

        }else if (str2.charAt(0) != '\"' && str2.charAt(str2.length() - 1) != '\"'){
            try {
                strNum = Integer.parseInt(str2);
                if (strNum < 0 || strNum > 10){
                    System.out.println("число должно быть от 1 до 10");
                    System.exit(-1);
                }
            } catch (NumberFormatException e){
                System.out.println("Операция не возможна");
                e.printStackTrace();
                System.exit(-1);
            }

            if (ch == '+' || ch == '-'){
                System.out.println("операция не возможна");
                System.exit(-1);
            }
        }else {
            System.out.println("это не строка и не число");
            System.exit(-1);
        }

        switch (ch){
            case '+':
                AddString addStr = new AddString(str1, str2);
                System.out.println(addStr.addString());
                break;
            case '-':
                Minus strMinus = new Minus(str1, str2);
                System.out.println(strMinus.minus());
                break;
            case '*':
                if (strNum > 0) {
                    Umnogenie umnogenie = new Umnogenie(str1, strNum);
                    umnogenie.umnogenie();
                } else {
                    System.out.println("ошибка во втором элементе");
                    System.exit(-1);
                }
                break;
            case '/':
                try {
                    Delenie delenie = new Delenie(str1, strNum);
                    System.out.println(delenie.delenie());
                }catch (ArithmeticException e){
                    System.out.println("ошибка во вторм элементе");
//                    e.printStackTrace();
                    System.exit(-1);
                }
                break;
            default:
                System.out.println("нет такогоо знака. Ошибка!");
                System.exit(-1);
                break;
        }

    }

}