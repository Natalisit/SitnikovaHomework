package ru.sitnikova.homework1;

public class Homework1 {
    /**
     * Çàäàíèå ¹1-2
     * Ñîçäàòü ïóñòîé ïğîåêò è ïğîïèñàòü ìåòîä main().
     * Ñîçäàòü ïåğåìåííûå âñåõ ïğîéäåííûõ òèïîâ äàííûõ è èíèöèàëèçèğîâàòü èõ.
     */
    public static void main(String[] args) {
        byte a = -110;
        short b = 22652;
        int c = 2000;
        long d = 66666666L;
        float e = 10.10f;
        double f = -236.115;
        //char g = '\u1158'; äàííûé òèï íå èçó÷àëè íà çàíòèÿõ è ñàìîñòîÿòåëüíîå åùå íå äîøëà;
        boolean h = false;  // èëè true;

        System.out.println("Çíà÷åíèå äëÿ òèïà byte = " + a);
        System.out.println("Çíà÷åíèå äëÿ òèïà short = " + b);
        System.out.println("Çíà÷åíèå äëÿ òèïà int = " + c);
        System.out.println("Çíà÷åíèå äëÿ òèïà long = " + d);
        System.out.println("Çíà÷åíèå äëÿ òèïà float = " + e);
        System.out.println("Çíà÷åíèå äëÿ òèïà double = " + f);
        //System.out.println("Çíà÷åíèå äëÿ òèïà char = " + g);
        System.out.println("Çíà÷åíèå äëÿ òèïà byte = " + h);

    }

    /**
     * Çàäàíèå ¹3
     * Íàïèñàòü ìåòîä âû÷èñëÿşùèé âûğàæåíèå a * (b + (c / d)) è âîçâğàùàşùèé ğåçóëüòàò,
     * ãäå a, b, c, d – âõîäíûå ïàğàìåòğû ıòîãî ìåòîäà.
     */
    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));

    }
    /**
     * Çàäàíèå ¹4
     * Íàïèñàòü ìåòîä, ïğèíèìàşùèé íà âõîä äâà ÷èñëà, è ïğîâåğÿşùèé, ÷òî èõ ñóììà ëåæèò
     * â ïğåäåëàõ îò 10 äî 20(âêëş÷èòåëüíî), åñëè äà – âåğíóòü true, â ïğîòèâíîì ñëó÷àå – false;
     */

    public static boolean task10and20(int x1, int x2){
        int sum = x1 + x2;
        if (sum > 10 && sum < 20)
            return true;
        else
            return false;

//        èëè êğàñèâåå â îäíó ñòğîêó:
//        if (sum > 10 && sum < 20) return true;
//        else return false;
    }
}