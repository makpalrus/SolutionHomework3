package com.example.builder;

import com.example.prototype.NPC;
import com.example.prototype.Room;

public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    Dungeon build();
}
