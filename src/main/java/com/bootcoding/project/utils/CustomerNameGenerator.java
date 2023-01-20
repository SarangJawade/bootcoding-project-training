package com.bootcoding.project.utils;

import java.util.Random;

public class CustomerNameGenerator {
    private static final String[] RestaurantName = {
            "Sujal", "Sumit", "Aryan", "Atul", "Manjeet", "Nikhil"};

    private static Random random = new Random();

    public static String getName(){
        int randomIndex = random.nextInt(RestaurantName.length);

        return RestaurantName[randomIndex];
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(CustomerNameGenerator.getName());
        }
    }
}
