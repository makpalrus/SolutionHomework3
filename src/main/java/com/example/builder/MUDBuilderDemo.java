package com.example.builder;

import com.example.prototype.NPC;
import com.example.prototype.Room;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance", "A dark, damp entrance."))
                .addRoom(new Room("Treasure Room", "A room filled with gold."))
                .addNPC(new NPC("Dragon", "A fierce dragon guards the treasure.", 100))
                .build();

        System.out.println(dungeon);
    }
}
