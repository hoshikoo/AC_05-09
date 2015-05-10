package nyc.c4q.hoshikoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(reverse("hoshiko"));
    }

    public static String reverse (String str){
        ArrayList charList = new ArrayList();
        for (int i = str.length()-1; i>=0;i--){
            charList.add(str.charAt(i));
        }

        String newStr ="";
        for (int j = 0; j<charList.size();j++){
            newStr = newStr + charList.get(j);

        }
        return newStr;
    }


}
