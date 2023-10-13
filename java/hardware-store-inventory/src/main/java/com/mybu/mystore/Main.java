package com.mybu.mystore;

import com.corporate.store.Item;

public class Main {
    public static void main(String[] args) {
        System.out.println("Store Inventory System");

        Item[] items = new Item[]{
                new Item("Folha de Zinco", 10, 20), //
                new Item("Sal para Piscinas", 2, 0), //
                new Item("Martelo Inox DEXTER", 0, 80), //
                new Item("Martelo Inox DEXTER", -1, 80),
                new Item("Pulseira Festival 2022", 15, 20),
                new Item("Pulseira Festival 2022", 10, 49),
                new Item("Pulseira Festival 2022", 5, 49),

                // this item does not work properly yet
                new Item("Pregos de Ferro", 3, 6)};

        Inventory inventory = new Inventory(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            inventory.updateQuality();
        }
    }
}

