package services;
import models.CustomArrayList;
import models.CustomSet;
import models.KeyValueStore;

import java.util.InputMismatchException;


public class MainService {
private CustomArrayList<String> list1;
private CustomArrayList<Integer> list2;
private CustomSet<String> set1;
private CustomSet<Integer> set2;
private KeyValueStore<String, Integer> kvStore1;
private KeyValueStore<String, String> kvStore2;
private KeyValueStore<Integer, Integer> kvStore3;
private KeyValueStore<Integer, String> kvStore4;
private InputDataService inputDataService;
public MainService(){}
public MainService(CustomArrayList<String> list1, CustomArrayList<Integer> list2,CustomSet<String> set1, CustomSet<Integer> set2, KeyValueStore<String, Integer> kvStore1,KeyValueStore<String, String> kvStore2, KeyValueStore<Integer, Integer> kvStore3,KeyValueStore<Integer, String> kvStore4, InputDataService inputDataService){
    this.list1=list1;
    this.list2=list2;
    this.set1=set1;
    this.set2=set2;
    this.kvStore1=kvStore1;
    this.kvStore2=kvStore2;
    this.kvStore3=kvStore3;
    this.kvStore4=kvStore4;
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
                System.out.println("What type of data do you want to use?(1)\n" + "1. String\n" + "2. Integer\n"+ "0. Back");
                choise = inputDataService.inputInt();
                check = choise;

                if (check ==1){
                   check = firstStringCollection(check,choise);
                }
                else if (check == 2){
                  check = firstIntCollection(check);
                }
               }
            if (check == 2) {
                System.out.println("What type of data do you want to use?(2)\n" + "1. String\n" + "2. Integer\n"+ "0. Back");
                choise = inputDataService.inputInt();
                check = choise;

                if (check ==1){
                    check = secondStringCollection(check);
                }
                else if (check == 2){
                    check = secondIntCollection(check);
                }
            }
            if (check == 3) {
                System.out.println("What type of data do you want to use?(3)\n" + "1. String key + integer value\n" + "2. String key + string value\n"+ "3. Integer key + integer value\n" + "2. Integer key + string value\n"+ "0. Back");
                choise = inputDataService.inputInt();
                check = choise;

                if (check ==1){
                    check = thirdStringIntCollection(check);
                }
                else if (check == 2){
                    check = thirdStringStringCollection(check);
                }
                else if (check == 3){
                    check = thirdIntIntCollection(check);
                }
                else if (check == 4){
                    check = thirdIntStringCollection(check);
                }

            }

        } catch(InputMismatchException e) {System.out.println("Wrong choice!!!");}
        catch (NullPointerException | ArrayIndexOutOfBoundsException e) {System.out.println("You have gone beyond the acceptable limits!!!");}
        }

}

int firstStringCollection(int check, int choise){
    while (check!=0) { System.out.println("Which operation do you want to use?\n" +
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
    } return check;
}
int firstIntCollection(int check){
    while (check!=0) { System.out.println("Which operation do you want to use?\n" +
            "1. Add\n" + "2. Remove\n" + "3. Print\n" + "4. Check for element presence\n" + "5. Get element by index\n" + "6. Sort\n" + "0. Exit");
        try {
            check = inputDataService.inputInt();
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
    } return check;
}
int secondStringCollection(int check){
    while (check!=0) { System.out.println("Which operation do you want to use?\n" +
            "1. Add\n" + "2. Remove\n" + "3. Print\n" + "4. Check for element presence\n"  + "0. Exit");
        try {
            check = inputDataService.inputInt();
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
    } return check;
}
int secondIntCollection(int check){while (check!=0) { System.out.println("Which operation do you want to use?\n" +
        "1. Add\n" + "2. Remove\n" + "3. Print\n" + "4. Check for element presence\n" + "0. Exit");
    try {
        check = inputDataService.inputInt();
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
}return check;}
int thirdStringIntCollection(int check){while (check!=0) { System.out.println("Which operation do you want to use?\n" +
        "1. Add key & value\n" + "2. Remove\n" + "3. Get value by key\n" + "4. Print pairs \n"  + "0. Exit");
    try {
        check = inputDataService.inputInt();
        if (check == 1) {
            System.out.println("Enter key(string): ");
            String key = inputDataService.inputString();
            System.out.println("Enter value(integer): ");
            int value = inputDataService.inputInt();
            kvStore1.put(key, value);
        } else if (check == 2) {
            System.out.println("Enter key(string) to remove: ");
            String key = inputDataService.inputString();
            kvStore1.remove(key);
        } else if (check == 3) {
            System.out.println("Enter key(string) to get value: ");
            String key = inputDataService.inputString();
            System.out.println(kvStore1.get(key));
        } else if (check == 4) {
            kvStore1.forEachPair();
        }


    } catch (InputMismatchException e) {
        System.out.println("Wrong choice!!!");

    }
}return check;}
int thirdStringStringCollection(int check){while (check!=0) { System.out.println("Which operation do you want to use?\n" +
        "1. Add key & value\n" + "2. Remove\n" + "3. Get value by key\n" + "4. Print pairs \n"  + "0. Exit");
    try {
        check = inputDataService.inputInt();
        if (check == 1) {
            System.out.println("Enter key(string): ");
            String key = inputDataService.inputString();
            System.out.println("Enter value(string): ");
            String value = inputDataService.inputString();
            kvStore2.put(key, value);
        } else if (check == 2) {
            System.out.println("Enter key(string) to remove: ");
            String key = inputDataService.inputString();
            kvStore2.remove(key);
        } else if (check == 3) {
            System.out.println("Enter key(string) to get value: ");
            String key = inputDataService.inputString();
            System.out.println(kvStore2.get(key));
        }else if (check == 4) {
            kvStore2.forEachPair();
        }


    } catch (InputMismatchException e) {
        System.out.println("Wrong choice!!!");
    }
    catch (NullPointerException | ArrayIndexOutOfBoundsException e) {System.out.println("You have gone beyond the acceptable limits!!!");}
}return check;}
int thirdIntIntCollection(int check){while (check!=0) { System.out.println("Which operation do you want to use?\n" +
        "1. Add key & value\n" + "2. Remove\n" + "3. Get value by key\n" + "4. Print pairs \n"  + "0. Exit");
    try {
        check = inputDataService.inputInt();
        if (check == 1) {
            System.out.println("Enter key(integer): ");
            int key = inputDataService.inputInt();
            System.out.println("Enter value(integer): ");
            int value = inputDataService.inputInt();
            kvStore3.put(key, value);
        } else if (check == 2) {
            System.out.println("Enter key(integer) to remove: ");
            int key = inputDataService.inputInt();
            kvStore3.remove(key);
        } else if (check == 3) {
            System.out.println("Enter key(integer) to get value: ");
            int key = inputDataService.inputInt();
            System.out.println(kvStore3.get(key));
        }else if (check == 4) {
            kvStore3.forEachPair();
        }


    } catch (InputMismatchException e) {
        System.out.println("Wrong choice!!!");
    }
    catch (NullPointerException | ArrayIndexOutOfBoundsException e) {System.out.println("You have gone beyond the acceptable limits!!!");}
}return check;}
int thirdIntStringCollection(int check){while (check!=0) { System.out.println("Which operation do you want to use?\n" +
        "1. Add key & value\n" + "2. Remove\n" + "3. Get value by key\n" + "4. Print pairs \n"  + "0. Exit");
    try {
        check = inputDataService.inputInt();
        if (check == 1) {
            System.out.println("Enter key(integer): ");
            int key = inputDataService.inputInt();
            System.out.println("Enter value(string): ");
            String value = inputDataService.inputString();
            kvStore4.put(key, value);
        } else if (check == 2) {
            System.out.println("Enter key(integer) to remove: ");
            int key = inputDataService.inputInt();
            kvStore4.remove(key);
        } else if (check == 3) {
            System.out.println("Enter key(integer) to get value: ");
            int key = inputDataService.inputInt();
            System.out.println(kvStore4.get(key));
        }else if (check == 4) {
            kvStore4.forEachPair();
        }


    } catch (InputMismatchException e) {
        System.out.println("Wrong choice!!!");
    }
    catch (NullPointerException | ArrayIndexOutOfBoundsException e) {System.out.println("You have gone beyond the acceptable limits!!!");}
}return check;}

}
