public class Lines {
    public static void main(String[] args) {
        String one = "Hello";
        String two = "World!";

        // соединение строк:
        System.out.println(one+" "+two); // присоединение через сложение "+"
        System.out.println(one.concat(" ").concat(two)); // присоединение через метод "concat"
        System.out.println(String.join(" ",one,two)); // присоединение через метод "join"

        // Извлечение символов и подстрок:
        char a = one.charAt(0); // метод "charAT" получает символ через индекс
        int start = 0;
        int end = 3;

        char[] dst = new char[end-start]; // вопрос, если поменять местами енд и старт, то выдаст ошибку, почему???
        one.getChars(start,end,dst,0);
        System.out.println(dst); // извлекает группу символов или подстроку "getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)"

        // Сравнение строк:
        System.out.println(one.equals(two)); // сравнение через метод equals()
        System.out.println(one.equalsIgnoreCase(one)); // сравнение через метод  equalsIgnoreCase()

        boolean result = one.regionMatches(2,two,1,4); // я сравниваю4 символа из страко, начиная со 2 и с 1
        System.out.println(result); // метод "regionMatches()" , простая идея, сложно запомнить!!!

        System.out.println(one.compareTo(two)); // метод int compareTo(String str) сравнивает строки и говорит, больше ли одна строка другой или нет, сравнивает по алф., есть игнор кейс.

        // Поиск в строке:
        // indexof , indexof str , lastindexof
        System.out.println(one.indexOf('H'));
        System.out.println(two.indexOf("x"));
        System.out.println(one.lastIndexOf("o"));
        System.out.println(one.lastIndexOf('H', 5));
        String three = "I said Hello World";
        System.out.println(three.indexOf("Hello",766)); // индекс больше, чем существует в строке.

        // startsWith()
        System.out.println(three.startsWith("I said")); // позволяет понять, правда ли строка начинается с данных символов
        System.out.println(three.endsWith("Hello")); // позволяет понять, правда ли строка заканчивается на данных символах

        // Замена в строке: метод replace()
        System.out.println(three.replace("I", "s")); // меняет одну последовательность символов на другую
        System.out.println(three.replace("said", "World"));

        // Обрезка строки:
        // trim()
        String four = "      I said Die World ! ";
        System.out.println(four.trim()); // обрезает пробелы в начале и в конце
        // substring()
        System.out.println(three.substring(0,10));
        System.out.println(three.substring(4));
        System.out.println(three.substring(3, 18)); // нельзя задавать по число, превышающее length

        // Изменение регистра: toLowerCase() , toUpperCase()
        System.out.println(three.toLowerCase()); // без капса
        System.out.println(three.toUpperCase()); // все символы КАПСОМ
        System.out.println(three.substring(0,6).toUpperCase()+three.substring(6,18).toLowerCase()); // написал КАПСОМ до 7 сивола, после без

        // Split:
        String five = "I said Hello World! twice";  // есть вопросы!!!!!!!
        String[] words = five.split("");
        for (String word : words){
            System.out.print(word);
        }
        String six = "8-922-865-45-12";
        int limit = 2;
        String[] numbers = six.split("-");
        for (String number : numbers){
            System.out.println(number);
        }
        String[] str1 = five.split("",limit);
        for (String str : str1){
            System.out.println(str);
        }

    }
}
