import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
        Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
        yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

        Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.
        Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

        9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34*/


        int a = 0,b = 1,c ,d;
        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci sersinin eleman sayisini yaziniz: ");
        d = scan.nextInt();
        System.out.print(a +", "+b);

        for (int i = 2; i <=d; i++) {
            c = b+a;
            System.out.print(", "+c);
            a = b;
            b = c;
            System.out.print(" ");
        }
    }

}