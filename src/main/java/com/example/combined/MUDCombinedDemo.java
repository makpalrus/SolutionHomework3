package com.example.combined;

import com.example.builder.Dungeon;
import com.example.builder.SimpleDungeonBuilder;
import com.example.prototype.Room;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Ancient Dungeon")
                .addRoom(new Room("Main Hall", "A large hall with torches on the walls."))
                .build();

        // Используем прототип для создания копий комнаты
        Room clonedRoom1 = dungeon.rooms.get(0).cloneEntity();
        Room clonedRoom2 = dungeon.rooms.get(0).cloneEntity();

        dungeon.addRoom(clonedRoom1);
        dungeon.addRoom(clonedRoom2);

        System.out.println("Dungeon layout:");
        System.out.println(dungeon);
    }
}
