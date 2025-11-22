//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        StepTracker tracker = new StepTracker(scanner);
//        while (true) {
//            System.out.println("1.Ввести количество шагов за определенный день");
//            System.out.println("2.Изменить цель по количеству шагов в день");
//            System.out.println("3.Напечататать статистику за определенный месяц");
//            System.out.println("4.Выйти из приложения");
//            int command = scanner.nextInt();
//            if (command == 1) {
//                tracker.addNewNumberStepsPerDay();
//            } else if (command == 2) {
//                tracker.changeStepGoal();
//            } else if (command == 3) {
//                tracker.printStatistic();
//            } else if (command == 4) {
//                System.out.println("Пока!");
//                break;
//            } else {
//                System.out.println("Такой команды нет");
//            }
//
//        }
//
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Product product1 = new Product("Футболка", 8900);
        products.add(product1);

        Product product2 = new Product("Джинсы", 23990);
        products.add(product2);

        Product product3 = new Product("Шапка", 5500);
        products.add(product3);

        Product product4 = new Product("Кофта", 15760);
        products.add(product4);


        double sum = getProductsSum(products);
        String expensiveProduct = getMostExpensiveProduct(products);
        ArrayList<Product> filteredProducts = getProductsInRange(products, 10000, 20000);
        System.out.println("Цена всех товаров: " + sum);
        System.out.println("Самый дорогой продукт: " + expensiveProduct);
        System.out.println("Продукты в данном диапазоне:" );

    }


    static double getProductsSum(ArrayList<Product> products) {
        double sum = 0;
        for (Product product : products) {
            System.out.println(product.name);
            sum += product.price;
        }
        return sum;

    }

    static String getMostExpensiveProduct(ArrayList<Product> products) {
        double expensiveProduct = products.getFirst().price;
        String nameOfExpensiveProduct = products.getFirst().name;
        for (Product product : products) {
            if (product.price > expensiveProduct) {
                expensiveProduct = product.price;
                nameOfExpensiveProduct = product.name;
            }

        }
        return nameOfExpensiveProduct;
    }


    static ArrayList<Product> getProductsInRange(ArrayList<Product> products, int number1, int number2) {
        ArrayList<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.price > number1 && product.price < number2) {
                filteredProducts.add(product);
            }

        }

        return filteredProducts;


    }
}





























