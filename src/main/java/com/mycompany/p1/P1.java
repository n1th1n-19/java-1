/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p1;
import java.util.Scanner;

enum Dig {
    ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);
    public int p;

    Dig(int i) {
        p = i;
    }
}

enum Two {
    TEN(10), ELEVEN(11), TWELVE(12), THIRTEEN(13), FOURTEEN(14), FIFTEEN(15), SIXTEEN(16), SEVENTEEN(17), EIGHTEEN(18), NINETEEN(19);
    public int p;

    Two(int i) {
        p = i;
    }
}

enum Ten {
    TWENTY(20), THIRTY(30), FORTY(40), FIFTY(50), SIXTY(60), SEVENTY(70), EIGHTY(80), NINETY(90);
    public int p;

    Ten(int i) {
        p = i;
    }
}

public class P1 {

    public static void main(String[] args) {
        int num;
        String str = ""; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();

        if (num < 0 || num > 99999) {
            System.out.println("Enter a valid number.");
        } else if (num == 0) {
            System.out.println("ZERO");
        } else {
           
            if (num / 10000 != 0) {
                if (num / 10000 == 1) {
                    for (Two d : Two.values()) {
                        if (d.p == (num / 10000)) {
                            str = str + d.name() + " THOUSAND ";
                        }
                    }
                } else {
                    for (Ten d : Ten.values()) {
                        if (d.p == (num / 10000) * 10) {
                            str = str + d.name() + " THOUSAND ";
                        }
                    }
                }
                num = num % 10000;  
            }

            if (num / 1000 != 0) { 
                for (Dig d : Dig.values()) {
                    if (d.p == (num / 1000)) {
                        str = str + d.name() + " THOUSAND ";
                    }
                }
                num = num % 1000; 
            }

            
            if (num / 100 != 0) {
                for (Dig d : Dig.values()) {
                    if (d.p == (num / 100)) {
                        str = str + d.name() + " HUNDRED ";
                    }
                }
                num = num % 100; 
            }

          
            if (num / 10 == 1) { 
                for (Two d : Two.values()) {
                    if (d.p == num) {
                        str = str + d.name();
                    }
                }
                num = 0;
            } else if (num / 10 != 0) {
                for (Ten d : Ten.values()) {
                    if (d.p == (num / 10) * 10) {
                        str = str + d.name() + " ";
                    }
                }
                num = num % 10;
            }


            if (num != 0) {
                for (Dig d : Dig.values()) {
                    if (d.p == num) {
                        str = str + d.name();
                    }
                }
            }

            
            System.out.println(str.trim());  
        }

        sc.close();
    }
}
