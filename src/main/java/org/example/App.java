/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ){
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("What is your name :");
        String name = keyboardInput.nextLine();
        System.out.print("Hello, " + name +", nice to meet you!" );
    }
}

