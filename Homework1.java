package ru.sitnikova.homework1;

public class Homework1 {
    /**
     * ������� �1-2
     * ������� ������ ������ � ��������� ����� main().
     * ������� ���������� ���� ���������� ����� ������ � ���������������� ��.
     */
    public static void main(String[] args) {
        byte a = -110;
        short b = 22652;
        int c = 2000;
        long d = 66666666L;
        float e = 10.10f;
        double f = -236.115;
        //char g = '\u1158'; ������ ��� �� ������� �� ������� � ��������������� ��� �� �����;
        boolean h = false;  // ��� true;

        System.out.println("�������� ��� ���� byte = " + a);
        System.out.println("�������� ��� ���� short = " + b);
        System.out.println("�������� ��� ���� int = " + c);
        System.out.println("�������� ��� ���� long = " + d);
        System.out.println("�������� ��� ���� float = " + e);
        System.out.println("�������� ��� ���� double = " + f);
        //System.out.println("�������� ��� ���� char = " + g);
        System.out.println("�������� ��� ���� byte = " + h);

    }

    /**
     * ������� �3
     * �������� ����� ����������� ��������� a * (b + (c / d)) � ������������ ���������,
     * ��� a, b, c, d � ������� ��������� ����� ������.
     */
    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));

    }
    /**
     * ������� �4
     * �������� �����, ����������� �� ���� ��� �����, � �����������, ��� �� ����� �����
     * � �������� �� 10 �� 20(������������), ���� �� � ������� true, � ��������� ������ � false;
     */

    public static boolean task10and20(int x1, int x2){
        int sum = x1 + x2;
        if (sum > 10 && sum < 20)
            return true;
        else
            return false;

//        ��� �������� � ���� ������:
//        if (sum > 10 && sum < 20) return true;
//        else return false;
    }
}