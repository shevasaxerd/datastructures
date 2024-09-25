package services;
import models.CustomArrayList;
import models.CustomSet;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MainService {
private CustomArrayList<String> list1;
private CustomArrayList<Integer> list2;
private CustomSet<String> set1;
private CustomSet<Integer> set2;
private InputDataService inputDataService;
public MainService(){}
public MainService(CustomArrayList<String> list1, CustomArrayList<Integer> list2,CustomSet<String> set1, CustomSet<Integer> set2, InputDataService inputDataService){
    this.list1=list1;
    this.list2=list2;
    this.set1=set1;
    this.set2=set2;
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
                        "1. Add\n" + "2. Remove\n" + "3. Print\n" + "4. Check for element presence\n" + "5. Get element by index\n" + "6. Sort\n" + "0. Exit");
                    try {
                        choise = inputDataService.inputInt();
                        check = choise;
                        if (check == 1) {
                            System.out.println("What do you want to add?");
                            list1.add(inputDataService.inputString());
                        } else if (check == 2) {
                            System.out.println("Which element do you want to remove?");
                            list1.remove(inputDataService.inputString());
                        } else if (check == 3) {
                            list1.print();
                        } else if (check == 4) {
                            System.out.println("Which element do you want to check in list?");
                            System.out.println(list1.contains(inputDataService.inputString()));
                        } else if (check == 5) {
                            System.out.println("Enter the index of the element you want to get");
                            System.out.println(list1.get(inputDataService.inputInt() - 1));
                        } else if (check == 6) {
                            list1.sort(String::compareTo);
                            list1.print();
                        }


                    } catch (InputMismatchException e) {
                        System.out.println("Wrong choice!!!");

                    }
                }}
                else if (check == 2){
                    while (check!=0) { System.out.println("Which operation do you want to use?\n" +
                            "1. Add\n" + "2. Remove\n" + "3. Print\n" + "4. Check for element presence\n" + "5. Get element by index\n" + "6. Sort\n" + "0. Exit");
                        try {
                            choise = inputDataService.inputInt();
                            check = choise;
                            if (check == 1) {
                                System.out.println("What do you want to add?");
                                list2.add(inputDataService.inputInt());
                            } else if (check == 2) {
                                System.out.println("Which element do you want to remove?");
                                list2.remove(inputDataService.inputInt());
                            } else if (check == 3) {
                                list2.print();
                            }else if (check == 4) {
                                System.out.println("Which element do you want to check in list?");
                                System.out.println(list2.contains(inputDataService.inputInt()));
                            } else if (check == 5) {
                                System.out.println("Enter the index of the element you want to get");
                                System.out.println(list2.get(inputDataService.inputInt() - 1));
                            } else if (check == 6) {
                                list2.sort(Integer::compareTo);
                                list2.print();
                            }


                        } catch (InputMismatchException e) {
                            System.out.println("Wrong choice!!!");
                        }
                        catch (NullPointerException | ArrayIndexOutOfBoundsException e) {System.out.println("You have gone beyond the acceptable limits!!!");}
                    }
                }
               }
            if (check == 2) {
                System.out.println("What type of data do you want to use?\n" + "1. String\n" + "2. Integer\n"+ "0. Back");
                choise = inputDataService.inputInt();
                check = choise;

                if (check ==1){while (check!=0) { System.out.println("Which operation do you want to use?\n" +
                        "1. Add\n" + "2. Remove\n" + "3. Print\n" + "4. Check for element presence\n"  + "0. Exit");
                    try {
                        choise = inputDataService.inputInt();
                        check = choise;
                        if (check == 1) {
                            System.out.println("What do you want to add?");
                            set1.add(inputDataService.inputString());
                            set1.sort(String::compareTo);
                        } else if (check == 2) {
                            System.out.println("Which element do you want to remove?");
                            set1.remove(inputDataService.inputString());
                        } else if (check == 3) {
                            set1.print();
                        } else if (check == 4) {
                            System.out.println("Which element do you want to check in list?");
                            System.out.println(set1.contains(inputDataService.inputString()));
                        }


                    } catch (InputMismatchException e) {
                        System.out.println("Wrong choice!!!");

                    }
                }}
                else if (check == 2){
                    while (check!=0) { System.out.println("Which operation do you want to use?\n" +
                            "1. Add\n" + "2. Remove\n" + "3. Print\n" + "4. Check for element presence\n" + "0. Exit");
                        try {
                            choise = inputDataService.inputInt();
                            check = choise;
                            if (check == 1) {
                                System.out.println("What do you want to add?");
                                set2.add(inputDataService.inputInt());
                                set2.sort(Integer::compareTo);
                            } else if (check == 2) {
                                System.out.println("Which element do you want to remove?");
                                set2.remove(inputDataService.inputInt());
                            } else if (check == 3) {
                                set2.print();
                            }else if (check == 4) {
                                System.out.println("Which element do you want to check in list?");
                                System.out.println(set2.contains(inputDataService.inputInt()));
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

}


}
