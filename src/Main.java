import models.CustomSet;
import models.CustomArrayList;
import services.InputDataServiceImpl;
import services.MainService;


public class Main {
    public static void main(String[] args) {
        InputDataServiceImpl inputDataServiceImpl = new InputDataServiceImpl();
        CustomArrayList<Integer> list2 = new CustomArrayList<>();
        CustomArrayList<String> list1 = new CustomArrayList<>();
        CustomSet<String> set1 = new CustomSet<>();
        CustomSet<Integer> set2 = new CustomSet<>();
        MainService mainService = new MainService(list1, list2, set1, set2, inputDataServiceImpl);
        mainService.start();
    }
}