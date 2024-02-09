import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    static String ilksayi;
    static String ikincisayi;
    static String islem;
    public static void main(String[] args) {
        sayiAl1();
        islem();
        sayiAl2();
        hesap();
        scanner.close();
    }
    public static void islem(){
        System.out.println("Toplama işlemi için + tuşuna bas");
        System.out.println("Çıkarma işlemi için - tuşuna bas");
        System.out.println("Çarpma işlemi için * tuşuna bas");
        System.out.println("Bölme işlemi için / tuşuna bas");
        islem = scanner.nextLine().trim();
        if(!islem.equals("+")&&!(islem.equals("-"))&&!(islem.equals("*"))&&!(islem.equals("/"))){
            System.out.println("Geçerli bir işlem seçiniz");
            islem();
        }
    }
    public static void hesap(){
        if(islem.equals("+")){
            int toplam = Integer.parseInt(ilksayi) + Integer.parseInt(ikincisayi);
            System.out.println(ilksayi + " + " + ikincisayi + " = " + toplam);
        }else if(islem.equals("-")){
            int cıkarma = Integer.parseInt(ikincisayi) - Integer.parseInt(ikincisayi);
            System.out.println(ilksayi + " - " + ikincisayi + " = " + cıkarma);  
        }else if(islem.equals("*")){
            int carpma = Integer.parseInt(ilksayi) * Integer.parseInt(ikincisayi);
            System.out.println(ilksayi + " * " + ikincisayi +" = " + carpma);
        }else if(islem.equals("/")){
            if(ikincisayi.equals("0")){
                System.out.println("bir sayıyı sıfıra bölemezsiniz");
                sayiAl2();
                hesap();
            }else{
                int bolme = Integer.parseInt(ilksayi) / Integer.parseInt(ikincisayi);
                System.out.println(ilksayi + " / " + ikincisayi + " = " + bolme);
            }
        }
    }
    public static void sayiAl1(){
        System.out.println("ilk sayıyı giriniz");
        ilksayi = scanner.nextLine().trim();
        if(!isInteger(ilksayi)){
            System.out.println("Geçerli bir sayı giriniz");
            sayiAl1();
        }
    }
    public static void sayiAl2(){
        System.out.println("ikinci sayıyı giriniz");
        ikincisayi = scanner.nextLine().trim();
        if(!isInteger(ikincisayi)){
        System.out.println("Geçerli bir sayı giriniz");
        sayiAl2();
        }
    }
    public static boolean isInteger(String srt){
        if(srt == null || srt.isEmpty()){
            return false;
        }
        for (char c:srt.toCharArray()){
            if(!Character.isDigit(c)&& c !='-'){
                return false;
            }
        }
        return true;
    }
}
