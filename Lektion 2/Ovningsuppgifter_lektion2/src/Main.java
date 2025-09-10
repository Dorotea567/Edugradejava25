//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Övningsuppgifter lektion 2 !");
        System.out.println("_____");

        System.out.println("1:");
        System.out.println("Uppgift 1.1:");
        int age = 30;
        double height = 1.75;
        char initial = 'A';
        String name = "Anna";
        Boolean isStudent = true;

        System.out.println("_____");

        System.out.println("Uppgift 1.2:");
        System.out.println(((Object) age ).getClass().getName());
        System.out.println(((Object) height ).getClass().getName());
        System.out.println(((Object) initial).getClass().getName());
        System.out.println(((Object) name).getClass().getName());
        System.out.println(((Object) isStudent).getClass().getName());

        System.out.println("_____");

        System.out.println("2:");

        System.out.println("Uppgift 2.1:");
        System.out.println(10 + 20);
        System.out.println(100 - 30);
        System.out.println(5 * 7);
        System.out.println(20 / 4);
        System.out.println(10 % 3);

        System.out.println("_____");

        System.out.println("Uppgift 2.2:");
        int a = 15;
        int b = 20;
        boolean isEqual = (a == b);
        boolean isGrater = (a > b);
        boolean isLess = (a <= b);

        System.out.println("_____");

        System.out.println("Uppgift 2.3:");
        int x = 10;
        int y = 5;
        int z = 20;

        System.out.println((x >= y) && (x >= z));
        System.out.println((x >= y) && (x <= z));
        System.out.println(!(x >= y) && !(x >= z));
        System.out.println((!(x >= y) && !(x >= z)));

        System.out.println("_____");

        System.out.println("Uppgift 2.4:");
        int A =10;
        int B =5;
        int C = 2;
        int D =20;

        System.out.println((A + B) * C > D);

        System.out.println("_____");

        System.out.println("3:");

        System.out.println("Uppgift 3.1:");
        double kateta = 10.0;
        double katetb = 10.0;

       double hypotinusan= Math.sqrt((kateta * kateta)+ (katetb * katetb));
       System.out.println("Hypotinusan är " + hypotinusan);

       System.out.println("_____");

       System.out.println("Uppgift 3.2:");
       int gammal = 20;

       boolean canVote = (gammal >= 18);
       boolean canPension = (gammal <=65);
       System.out.println("Kan rösta: " + canVote);
       System.out.println("Kan gå i pension: " + canPension);

       System.out.println("_____");

       System.out.println("Uppgift 3.3:");
       double m1 = 19.90;
       double m2 = 110.95;
       double m3 = 2.99;
       double m4 = 29.90;
       double m5 = 20.00;
       double m6 = 39.90;

       double totalt = (m1 + m2 + m3 + m4 + m5 + m6);
       System.out.println("Summan på shoppinglistan blev: " + totalt);

       System.out.println("_____");

       System.out.println("Uppgift 3.4:");
       int h = 5;
       int n = 9;

       boolean correct = (h + 2 * n == 10);
       System.out.println("Svaret: " + correct);

       System.out.println("_____");

       System.out.println("Uppgifter från Chatgpt:");

       System.out.println("Uppgift 1:");
       /*
        Uppgift 3.5:
        Skapa ett program där användaren matar in ett heltal. Programmet ska skriva ut om talet är:
        jämnt
                udda
        Tips: Använd modulusoperatorn %.
        */

        int tal = 13;

        boolean even = (tal%2 == 0);
        boolean odd = (tal%2 == 1);

        System.out.println("Jämt: " + even);
        System.out.println("Udda: " + odd);

        System.out.println("_____");

        System.out.println("Uppgift 2:");

        /*
        Uppgift 3.6:
Skriv ett program som beräknar summan av de tre talen a = 5, b = 10, och c = 15.
Kontrollera sedan med en logisk operator om summan är större än 20, och skriv ut resultatet.
         */

        int i = 5;
        int j = 10;
        int k = 15;
        boolean bigger = (i + j + k == 20);
        System.out.println("Summan är större: " + bigger);

        System.out.println("_____");

        System.out.println("Uppgift 3:");
        /*
        Uppgift 3.7:
Skapa ett program där användaren matar in en temperatur i Celsius.
Programmet ska omvandla temperaturen till Fahrenheit med formeln:
F
=
C
×
9
5
+
32
F=C×
5
9
​
 +32
och skriva ut resultatet.
         */
        double Celsius = 25;

        double Fahrenheit = (Celsius * (9/5) + 32);
        System.out.println("Fahrenheit: " + Fahrenheit);

        System.out.println("_____");
        System.out.println("Uppgift 4:");
        /*
        Skriv ett program som tar två heltal x och y.
Programmet ska:
Beräkna summan, differensen, produkten och kvoten.
Kontrollera med en logisk jämförelse om x > y.
Skriva ut alla resultaten.
         */
        int o = 5;
        int p = 8;

        int s = (o + p);
        int d = (o - p);
        int produken = (o * p);
        int kvoten = (o / p);

        boolean c = (x > y);
        System.out.println(("Summan: "+ s) + ("Differensen: "+ d) + ("Produkten:"+ produken)+ ("Kvoten: "+ kvoten) + ("Är x > y: " + c));

        System.out.println("_____");

        System.out.println("Uppgift 5:");
        /*Skapa ett program som frågar efter ett heltal.
        Programmet ska avgöra:
        om talet är positivt, negativt eller noll.
        och om talet är större än 100.
         */

        int heltal  = 43;
        boolean positivt = (heltal%2 == 0);
        boolean negativt = (heltal%2 == 1);
        boolean hundra = (heltal>= 100);
        System.out.println("Positivt:" + positivt + ("Negativt:" + negativt + ("Är talet större än 100:" + hundra)));






























        }
    }
