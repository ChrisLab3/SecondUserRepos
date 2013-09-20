/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Scanner;
//added this comment -Chrisjgo
public class Lab
{

	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner (new File("matrices_values2.txt"));
        int m = 9;
        int n = 10;
        String [][] a = new String [m][n];
        while (input.next()!=null)
        {
            for (int i=0;i<m;i++)
            {
            	for (int j=0;j<n;j++)
            	{
            	    String value;

            	    value = input.next();
            	    a[i][j] = value;
            	    System.out.println("value[" + i + "][" + j + "]  = " + value);
            	}
            }   

        }
        //print the input matrix
        System.out.println("The input sorted matrix is : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.println(a[i][j]);
        }

    }
	}
