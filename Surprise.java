package com.zoho;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Surprise 
{
    void fibonacci()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number :");
        int n1=input.nextInt();
        System.out.print("Enter the second number :");
        int n2=input.nextInt();

        int count=0;

        while(count<10)
        {
            boolean check=true;
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            for(int i=2; i<n3/2; i++)
            {
                if(n3%i==0){
                    check=false;
                    break;
                }
            }
            if(check){
                System.out.print(n3+" ");
                count++;
            }
        }

    }

    void checkAnagram()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first string :");
        String s1=input.next();
        System.out.print("Enter second string :");
        String s2=input.next();

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.length()==s2.length())
        {
            char []array=s2.toCharArray();

            boolean check=true;
            for(int i=0; i<s1.length(); i++)
            {
                for (int j = 0; j < s1.length(); j++)
                {
                    if (s1.charAt(i)==array[j]){
                        array[j]=' ';
                        break;
                    }
                }
            }
            for(int i=0; i< array.length; i++)
            {
                if(array[i]!=' ')
                {
                    check=false;
                    break;
                }
            }
            if(check){
                System.out.println("Anagram");
            }else{
                System.out.println("Not anagram");
            }

        }else{
            System.out.println("Not anagram");
        }

    }

    void getPairs()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter length of an array :");
        int n=input.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the elements of an array");

        for(int i=0; i<n; i++)
        {
            arr[i]=input.nextInt();
        }

        System.out.println("Enter k");
        int k=input.nextInt();

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if((arr[i]+arr[j])%k==0 && arr[i]<arr[j])
                {
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
    }

    void game()
    {
        getNumber();



        String exp = "22*3+";

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++)
        {

            if (exp.charAt(i) > 47 && exp.charAt(i) < 58)

                stack.push(exp.charAt(i)-'0');

            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (exp.charAt(i)) {
                    case '+':
                        stack.push(val2 + val1);
                        break;

                    case '-':
                        stack.push(val2 - val1);
                        break;

                    case '/':
                        stack.push(val2 / val1);
                        break;

                    case '*':
                        stack.push(val2 * val1);
                        break;
                }
            }

        }
        System.out.println(stack.pop());
    }

    private void getNumber()
    {
        int number[]=new int[4];

        for(int i=0; i<4; i++)
        {
            number[i]=(int)(Math.random()*(9-1+1)+1);
        }
        System.out.println(Arrays.toString(number));

    }

    private void getOperator()
    {
        char operator[]=new char[6];

        operator[0]='(';
        operator[1]='+';
        operator[2]='-';
        operator[3]='*';
        operator[4]='/';
        operator[5]=')';

        System.out.println(Arrays.toString(operator));
    }
}
