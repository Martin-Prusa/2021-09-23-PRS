package cz.martin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej n");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Zadej m");
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<String> nList = new ArrayList<>();
        ArrayList<String> mList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nList.add(sc.nextLine());
        }
        for (int i = 0; i < m; i++) {
            mList.add(sc.nextLine());
        }
        System.out.println("/////////////////////////////////////////////////");
        String input = sc.nextLine();
        while(!input.equals("END")) {
            if(nList.contains(input)) System.out.println("Zelenina");
            else if(mList.contains(input)) System.out.println("Ovoce");
            else System.out.println("Ostatní");
            input = sc.nextLine();
        }
    }
}
