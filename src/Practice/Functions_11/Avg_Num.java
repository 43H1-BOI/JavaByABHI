package Practice.Functions_11;

public class Avg_Num {
    public static float Avg(float a , float b , float c) {
        float avg = (float)(a+b+c)/3;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println(Avg(2,4,7));
    }
}
