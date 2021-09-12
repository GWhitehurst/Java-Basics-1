package com.gw.sse;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++){
            System.out.println(i + ")");
            switch (i) {
                case 1:
                    for(int j = 1; j <= 5; j++){
                        if(j == 5){
                            printDot(9);
                        }
                        else {
                            printStar(j);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for(int j = 5; j >= 1; j--){
                        if(j == 5){
                            printDot(9);
                        }
                        else{
                            printStar(j);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for(int j = 1; j <= 5; j++){
                        if(j == 5){
                            printDot(11);
                        }
                        else{
                            printSpace(6-j);
                            printStar((j * 2) - 1);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    for(int j = 5; j >= 1; j--){
                        if(j == 5){
                            printDot(11);
                        }
                        else{
                            printSpace(6-j);
                            printStar((j * 2) - 1);
                        }
                        System.out.print("\n");
                    }
                    break;
            }
        }
    }

    public static void printDot(int count){
        for(int i = 0; i < count; i++){
            System.out.print(".");
        }
    }

    public static void printStar(int count){
        for(int i = 0; i < count; i++){
            System.out.print("*");
        }
    }

    public static void printSpace(int count){
        for(int i = 0; i < count; i++){
            System.out.print(" ");
        }
    }
}