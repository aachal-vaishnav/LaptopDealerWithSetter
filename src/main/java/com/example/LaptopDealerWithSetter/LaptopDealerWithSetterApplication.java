package com.example.LaptopDealerWithSetter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class LaptopDealerWithSetterApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LaptopDealerWithSetterApplication.class, args);
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Scanner input = new Scanner(System.in);

        String ans = "y";
        do {
            System.out.println("""
                    Choose the brand you want to buy
                    1.Dell
                    2.MacBook
                    3.Microsoft Laptop
                    """);
            int userBrandeSelect = input.nextInt();
            System.out.println("""
                    Choose the Processor you want to buy
                    1.i3
                    2.i5
                    3.i7
                    """);
            int userProcessorSelect = input.nextInt();

            String beanId = null;
            switch (userBrandeSelect) {
                case 1 -> {
                    if (userProcessorSelect == 1) beanId = "dellwithi3";
                    else if (userProcessorSelect == 2) beanId = "dellwithi5";
                    else if (userProcessorSelect == 3) beanId = "dellwithi7";
                }
                case 2 -> {
                    if (userProcessorSelect == 1) beanId = "macBookwithi3";
                    else if (userProcessorSelect == 2) beanId = "macBookwithi5";
                    else if (userProcessorSelect == 3) beanId = "macBookwithi7";
                }
                case 3 -> {
                    if (userProcessorSelect == 1) beanId = "microsoftLaptopi3";
                    else if (userProcessorSelect == 2) beanId = "microsoftLaptopi5";
                    else if (userProcessorSelect == 3) beanId = "microsoftLaptopi7";
                }
                default -> {
                    System.out.println("Invalid brand selected");
                    context.close();
                    return;
                }
            }

            if (beanId == null) {
                System.out.println("Invalid processor selected");
                context.close();
                return;
            }
            LaptopBrand brand = (LaptopBrand) context.getBean(beanId);
            brand.showDetails();

            System.out.println("You want to Continue(y/n)");
            ans = input.next().toLowerCase();
        } while (ans.equals("y"));

        System.out.println("Thank you for visiting Laptop Dealer 😊");

        input.close();
        context.close();
    }
}
