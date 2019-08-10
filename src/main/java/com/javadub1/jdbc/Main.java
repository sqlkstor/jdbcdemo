package com.javadub1.jdbc;


import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        StudentDao dao = new StudentDao();

        Scanner scanner = new Scanner(System.in);

        boolean isWorking = true;

        do{
            String komenda = scanner.nextLine();

            if (komenda.equalsIgnoreCase("dodaj")){
                Student nowyStudent = new Student();

                System.out.println("Podaj imie: ");
                nowyStudent.setName(scanner.nextLine());

                System.out.println("Podaj indeks: ");
                nowyStudent.setIndeks(scanner.nextLine());

                System.out.println("Podaj age: ");
                nowyStudent.setAge(Integer.parseInt(scanner.nextLine()));


            } else if (komenda.equalsIgnoreCase("usun")){
                System.out.println("Podaj id do usunięcia: ");

                dao.deleteStudent(Long.parseLong(scanner.nextLine()));

            }else if (komenda.equalsIgnoreCase("listuj")){
                // listowanie
                dao.getAllStudents().forEach(System.out::println);
            }else if (komenda.equalsIgnoreCase("quit")){

            }
        } while(isWorking);
    }
}
