package com.company;

public class Main {

    public static void main(String [] args) {
        String[] names = {"Alexander","Andrew","Alex","Drew","Cindy","Kevin","Alexdrandadaa"};
	   int size = names.length;
	   String longestName = names[0];
	   for (int i = 1;i < size;i++) {
	       if (longestName.length() < names[i].length()) {
	           longestName = names[i];
           }
        }
        System.out.println(longestName);
    }
}
