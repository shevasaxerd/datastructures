import models.CustomSet;
import models.CustomArrayList;
import models.KeyValueStore;
import services.InputDataServiceImpl;
import services.MainService;


public class Main {
    public static void main(String[] args) {
        InputDataServiceImpl inputDataServiceImpl = new InputDataServiceImpl();
        CustomArrayList<Integer> list2 = new CustomArrayList<>();
        CustomArrayList<String> list1 = new CustomArrayList<>();
        CustomSet<String> set1 = new CustomSet<>();
        CustomSet<Integer> set2 = new CustomSet<>();
        KeyValueStore<String, Integer> kvStore1 = new KeyValueStore<>();
        KeyValueStore<String, String> kvStore2 = new KeyValueStore<>();
        KeyValueStore<Integer, Integer> kvStore3 = new KeyValueStore<>();
        KeyValueStore<Integer, String> kvStore4 = new KeyValueStore<>();
        MainService mainService = new MainService(list1, list2, set1, set2,kvStore1,kvStore2, kvStore3, kvStore4, inputDataServiceImpl);
        mainService.start();
    }
}