import models.CustomArrayList;
import services.InputDataServiceImpl;
import services.MainService;


public class Main {
    public static void main(String[] args) {
        InputDataServiceImpl inputDataServiceImpl = new InputDataServiceImpl();
        CustomArrayList<Integer> list2 = new CustomArrayList<>();
        CustomArrayList<String> list1 = new CustomArrayList<>();
        MainService mainService = new MainService(list1, list2, inputDataServiceImpl);
        mainService.start();
    }
}