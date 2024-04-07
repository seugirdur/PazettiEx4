package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Criando a lista encadeada com os elementos anta, paca, tatu, cotia e prea
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("anta");
        linkedList.add("paca");
        linkedList.add("tatu");
        linkedList.add("cotia");
        linkedList.add("prea");

        // Imprimindo a lista encadeada original
        System.out.println("Lista Encadeada original:");
        for (String item : linkedList) {
            System.out.print(item + " ");
        }

        // Removendo o item "anta" da lista
        linkedList.remove("anta");

        // Imprimindo a lista encadeada após a remoção
        System.out.println("\nLista Encadeada após remoção de anta:");
        for (String item : linkedList) {
            System.out.print(item + " ");
        }

        // Adicionando o item "leao" antes de paca
        linkedList.add(linkedList.indexOf("paca"), "leao");

        // Imprimindo a lista encadeada após a adição
        // O item "leao" deve ser impresso antes de "paca"
        System.out.println("\nLista Encadeada após adição de leão:");

        for (String item : linkedList) {
            System.out.print(item + " ");
        }

        // Removendo o item da posição 5 (index 4) (prea)
        linkedList.remove(4);

        // Imprimindo a lista encadeada após a remoção

        System.out.println("\nLista Encadeada após remoção de item 5:");
        for (String item : linkedList) {
            System.out.print(item + " ");
        }

        // Removendo Tatu
        linkedList.remove("tatu");

        // Imprimindo a lista encadeada após a remoção
        System.out.println("\nLista Encadeada após remoção de tatu:");
        for (String item : linkedList) {
            System.out.print(item + " ");
        }



    }
}
