public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(true);
        System.out.println(list.get(1));
    }
}
