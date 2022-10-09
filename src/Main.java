public class Main {
    public static void main(String[] args) {
        int [] arr = new int[] {5, 80 ,7 ,150};
        SalesManager salesManager = new SalesManager(arr);

        int max = salesManager.max();
        System.out.println(max);
    }
}
