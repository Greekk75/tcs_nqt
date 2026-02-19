package session;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Doctor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total =0;
        int patientCount=0;
        while(patientCount<20){

            String ageS = in.nextLine();

            if(ageS.isEmpty()){
                break;
            }

            int age = Integer.parseInt(ageS);

            if(age <=0 || age>120){
                System.out.println("INVALID INPUT");
                return;
            }

            if(age<17){
                total += 200;
            }
            else if(age <= 40){
                total+=400;
            }
            else {
                total+=300;
            }
            patientCount++;
        }
        System.out.println("Total Income "+total+" INR");
    }
}
