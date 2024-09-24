package services;
import models.CustomArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MainService {
private CustomArrayList<String> list1;
private CustomArrayList<Integer> list2;
private InputDataService inputDataService;
public MainService(){}
public MainService(CustomArrayList<String> list1, CustomArrayList<Integer> list2, InputDataService inputDataService){
    this.list1=list1;
    this.list2=list2;
    this.inputDataService=inputDataService;
}

public void start() {
    int check = 1;
    while (check != 4) {
        System.out.println("Which collection do you want to use?\n" +
                "1. First collection\n" + "2. Second collection \n" + "3. Third collection\n" + "4. Exit");
        try {
            int choise = inputDataService.inputInt();
            check = choise;

            if (check == 1) {
                System.out.println("What type of data do you want to use?\n" + "1. String\n" + "2. Integer\n"+ "0. Back");
                choise = inputDataService.inputInt();
                check = choise;

                if (check ==1){while (check!=0) { System.out.println("Which operation do you want to use?\n" +
                        "1. Add\n" + "2. Remove\n" + "3. Print\n" + "0. Exit");
                    try {
                        choise = inputDataService.inputInt();
                        check = choise;
                        if (check == 1) {
                            System.out.println("What do you want to add?\n");
                            list1.add(inputDataService.inputString());
                        } else if (check == 2) {
                            System.out.println("Which element do you want to remove?\n");
                            list1.remove(inputDataService.inputString());
                        } else if (check == 3) {
                            list1.print();
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Wrong choice!!!");

                    }
                }}
                else if (check == 2){
                    while (check!=0) { System.out.println("Which operation do you want to use?\n" +
                            "1. Add\n" + "2. Remove\n" + "3. Print\n" + "0. Exit");
                        try {
                            choise = inputDataService.inputInt();
                            check = choise;
                            if (check == 1) {
                                System.out.println("What do you want to add?\n");
                                list2.add(inputDataService.inputInt());
                            } else if (check == 2) {
                                System.out.println("Which element do you want to remove?\n");
                                list2.remove(inputDataService.inputInt());
                            } else if (check == 3) {
                                list2.print();
                            }


                        } catch (InputMismatchException e) {
                            System.out.println("Wrong choice!!!");
                        }
                        catch (NullPointerException | ArrayIndexOutOfBoundsException e) {System.out.println("You have gone beyond the acceptable limits!!!");}
                    }
                }
               }

        } catch(InputMismatchException e) {System.out.println("Wrong choice!!!");}
        catch (NullPointerException | ArrayIndexOutOfBoundsException e) {System.out.println("You have gone beyond the acceptable limits!!!");}
        }

} }