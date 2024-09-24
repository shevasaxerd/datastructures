package services;

import java.util.Scanner;

public class InputDataServiceImpl implements InputDataService {
    public String inputString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int inputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
