import models.CustomArrayList;


public class Main {
    public static void main(String[] args) {
        CustomArrayList<String> list1 = new CustomArrayList<>();
        CustomArrayList<Integer> list2 = new CustomArrayList<>();
        list1.add("Banana");
        list1.add("Apple");
        list1.add("Orange");
        list1.add("Zakhar");
        list2.add(52);
        list2.add(394);
        list2.add(1000-7);
        list2.add(69);

        System.out.println("List1: ");
        list1.print();
        System.out.println("List2: ");
        list2.print();


        list1.remove("Apple");
        list2.remove(394);
        list1.print();
        list2.print();


        System.out.println("Does the list1 contain Bannana? " + list1.contains("Banana"));
        System.out.println("Does the list2 contain 52? " + list2.contains(52));
        System.out.println("Does the list1 contain March? " + list1.contains("March"));
        System.out.println("Does the list2 contain 12? " + list2.contains(12));

        list1.sort(String::compareTo);
        list2.sort(Integer::compareTo);
        System.out.println("After sorting:");
        list1.print();
        list2.print();
    }
}