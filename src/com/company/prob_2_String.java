package com.company;

import javax.management.remote.rmi._RMIConnectionImpl_Tie;

public class prob_2_String {
    public static void main(String[] args) {
        // String name = "krishna hi ";
        // name  = name.replace("hi " ,"_");
       //  System.out.println(name);

        String letter  = "krishna hi <|name|>,Thanks a lot;";
        letter = letter.replace("<|name|> ","Harry");
        System.out.println(letter);
    }
}
