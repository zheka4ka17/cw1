package com.company;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
       int n=4;
       int m =8 ;
        String [][] arr = new String[n][m];
        for(int i=0;i<n;i++){
            for(int j=0; j<m; j++)
                arr[i][j]="";}
            arr[0][m/2]="*";
        arr[1][m/2-1]="*";
        arr[1][m/2+1]="*";
        arr[2][m/2-2]="*";
        arr[2][m/2+2]="*";
        for (int k=0;k<m; k++)
            arr[3][k]= "*";
        for (int g=0; g<n;g++)
        System.out.println(Arrays.toString(arr[g]));



    }
}
