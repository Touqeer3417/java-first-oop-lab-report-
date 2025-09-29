public class DataTypeConvert {
    public static void main(String[] args) {

        int num = 130;
        byte b = (byte) num; 

        System.out.println("Integer is   " + num);
        System.out.println("Integer to byte is  " + b);

       
        int number = 100;
        String str1 = String.valueOf(200);

        System.out.println("  Int is the  " + number);
        System.out.println("integer to string is  " + str1 );


        String str2 = "200";
        int number2 = Integer.parseInt(str2);

        System.out.println("String value is the " + str2);
        System.out.println("String to int is   " + number2);
    }
}
