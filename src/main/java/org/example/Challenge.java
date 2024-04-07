package org.example;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> removedIndexes = new Stack<>();
        Stack<String> removedNames = new Stack<>();

        // Criando uma LinkedList para armazenar os nomes
        LinkedList<String> linkedList = new LinkedList<>();

        // Adicionando 10 nomes à lista encadeada
        for (int i = 0; i < 10; i++) {
            String name;
            do {
                System.out.print("Digite o nome " + (i + 1) + ": ");
                name = scanner.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println("Nome inválido. Por favor, digite um nome válido.");
                }
            } while (name.isEmpty());
            linkedList.add(name);
        }

        // Imprimindo a lista encadeada
        System.out.println("\nLista Encadeada:");
        for (String name : linkedList) {
            System.out.println(name);
        }

        // Menu para adicionar ou remover nomes
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar um nome");
            System.out.println("2. Remover um nome");
            System.out.println("0. Sair");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            switch (choice) {
                case 1:
                    // Adicionar um nome
                    if (linkedList.size() >= 10) {
                        System.out.println("Não é possível adicionar mais nomes. A lista já possui 10 nomes.");
                    } else {
                        String newName;
                        do {
                            System.out.print("Digite o nome que deseja adicionar: ");
                            newName = scanner.nextLine().trim();
                            if (newName.isEmpty()) {
                                System.out.println("Nome inválido. Por favor, digite um nome válido.");
                            }
                        } while (newName.isEmpty());

                        // Verifica se há algum nome removido anteriormente
                        if (!removedIndexes.isEmpty()) {
                            int index = removedIndexes.pop();
                            linkedList.add(index, newName);
                            for (String name : linkedList) {
                                System.out.println(name);
                            }
                        } else {
                            linkedList.add(newName);
                            for (String name : linkedList) {
                                System.out.println(name);
                            }
                        }
                    }
                    break;
                case 2:
                    // Remover um nome
                    if (linkedList.isEmpty()) {
                        System.out.println("A lista já está vazia. Não há nomes para remover.");
                    } else {
                        System.out.print("Digite o nome que deseja remover: ");
                        String nameToRemove = scanner.nextLine().trim();
                        int indexToRemove = linkedList.indexOf(nameToRemove);
                        if (indexToRemove != -1) {
                            removedIndexes.push(indexToRemove);
                            removedNames.push(nameToRemove);
                            linkedList.remove(indexToRemove);
                            for (String name : linkedList) {
                                System.out.println(name);
                            }
                        } else {
                            System.out.println("O nome especificado não está na lista.");
                        }
                    }
                    break;
                case 0:
                    // Sair do programa
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
