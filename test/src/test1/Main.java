package test1;

import java.util.*; 

import java.util.Map.Entry;

import java.lang.*;

import java.io.*;

import java.lang.Math;



public class Main {

    public static String cipher(String S) {

        //this is default OUTPUT. You can change it

        String result="";

        S = S.toLowerCase();

        Map<Character, String> mp = new LinkedHashMap<>();

        Character c = 'a';

        for(int i = 0; i<9; i++){

                mp.put(c,"0"+(i+1)+"");
                c++;

        }

        

        for(int i = 9; i<26; i++){

            mp.put(c,(i+1)+"");

            c++;

        }


        for(int j = 0; j<S.length();j++) {
        for(Entry<Character, String> e : mp.entrySet()){

            
                if(S.charAt(j) == e.getKey()){

                    result = result+e.getValue();

                }
            }
        }

        
        //WRITE YOUR LOGIC HERE:

        //For optimizing code, You are free to make changes to "return type", "variables" and "Libraries".        

        return result;

    }

    public static void main(String[] args) {

        // INPUT [uncomment & modify if required]

        Scanner sc = new Scanner(System.in);

        String S = sc.next();

       

        // OUTPUT [uncomment & modify if required]

        System.out.print(cipher(S));

        sc.close();

    }

}