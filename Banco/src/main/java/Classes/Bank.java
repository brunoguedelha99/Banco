package Classes;

import DataBase.DataBase;

import java.util.ArrayList;
import java.util.Scanner;

public class  Bank {

    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Hello insert the number of the option that you pretend:");
        System.out.println("1: Create Client.");
        System.out.println("2: Login to your Client.");
        System.out.println("3: ATM");
        int option;
        System.out.print("Option:");
        option = teclado.nextInt();
        switch(option){
            case 1 -> {
                System.out.println("Create Client:");

                System.out.print("Nome:");
                String nome= teclado.next();


                System.out.println("");
                System.out.print("NIF:");
                int nif=teclado.nextInt();

                System.out.println("");
                System.out.print("Profissão:");
                String prof= teclado.next();

                System.out.println("");
                System.out.print("Idade:");
                int idade=teclado.nextInt();

                System.out.println("");
                System.out.print("Data de Nascimento:");
                String data= teclado.next();

                System.out.println("");
                System.out.print("Email:");
                String email=teclado.next();

                System.out.println("");
                System.out.print("Password:");
                String pass=teclado.next();

                Cliente client = new Cliente(nome,nif,prof,idade,data,email,pass);
                dataBase.clientes.add(client);
                System.out.println(dataBase.toString());

            }

            case 2 -> {
                System.out.println("Login");

                System.out.print("NIF:");
                int nif=teclado.nextInt();

                System.out.print("Password:");
                String pass=teclado.next();

                for(Cliente client: dataBase.clientes){
                    if(client.getNif() == nif && client.getSenha().equals(pass)){
                        System.out.println("Successful login!");
                        System.out.println("Welcome to the menu");
                        System.out.println("1: Alterar informação pessoal");
                        System.out.println("2: Ver contas");
                        System.out.println("3: Ver cartões");

                        switch(option){
                            case 1 ->{


                            }
                        }
                        break;
                    }
                }


            }

            case 3 ->{
                System.out.println("ATM");
                System.out.println("Card number:");
                int card=teclado.nextInt();

                System.out.println("");
                System.out.print("PIN");
                int pin=teclado.nextInt();


            }

        }
    }
}
