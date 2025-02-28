package com.example;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();

        Dungeon dungeon = builder
                .setDungeonName("Dark Caverns")
                .addRoom(new Room("Entrance"))
                .addRoom(new Room("Treasure Chamber"))
                .addNPC(new NPC("Goblin"))
                .addNPC(new NPC("Dragon"))
                .build();

        dungeon.displayDungeon();
    }
}

