package com.example.prototype;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room originalRoom = new Room("Dark Chamber", "A mysterious and spooky chamber.");
        Room clonedRoom = originalRoom.cloneEntity();

        NPC originalNPC = new NPC("Goblin", "A sneaky goblin.", 30);
        NPC clonedNPC = originalNPC.cloneEntity();

        System.out.println("Original Room: " + originalRoom);
        System.out.println("Cloned Room: " + clonedRoom);
        System.out.println("Original NPC: " + originalNPC);
        System.out.println("Cloned NPC: " + clonedNPC);
    }
}
