package com.question3;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int users = in.nextInt();
        in.nextLine();
        List<Address> list = new ArrayList<>();
        System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");
        while (users-- != 0){
            String details = in.nextLine();
            String[] sArr = details.split(",");
            list.add(new Address(sArr[0],sArr[1],sArr[2],Integer.parseInt(sArr[3])));
        }
        Collections.sort(list);
        System.out.println("User Details:");
        for(Address a : list){
            StringJoiner sj = new StringJoiner(",");
            sj.add(a.getUserName());
            sj.add(a.getAddressLine1());
            sj.add(a.getAddressLine2());
            sj.add(String.valueOf(a.getPinCode()));
            System.out.println(sj);
        }
    }
}
