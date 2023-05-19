public class App13 {
    public static void main(String[] args) throws Exception {
        System.out.println(totalSum());
    }

    private static float totalSum() {
        float total = 0;
        int i = 1;
        while (i <= 100) {
            total += i;
            i++;
        }
        return total;
    }
}
