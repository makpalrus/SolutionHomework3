package com.example.builder;

import com.example.prototype.NPC;
import com.example.prototype.Room;
import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    private String name;
    public List<Room> rooms;
    private List<NPC> npcs;

    public Dungeon(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.npcs = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addNPC(NPC npc) {
        npcs.add(npc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dungeon: ").append(name).append("\nRooms:\n");
        for (Room room : rooms) {
            sb.append(" - ").append(room.toString()).append("\n");
        }
        sb.append("NPCs:\n");
        if (npcs.isEmpty()) {
            sb.append(" - None\n");
        } else {
            for (NPC npc : npcs) {
                sb.append(" - ").append(npc.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
