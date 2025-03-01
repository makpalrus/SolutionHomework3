package com.example.builder;

import com.example.prototype.NPC;
import com.example.prototype.Room;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private Dungeon dungeon;

    public SimpleDungeonBuilder() {
        this.dungeon = new Dungeon("Unnamed Dungeon");
    }

    @Override
    public IDungeonBuilder setDungeonName(String name) {
        this.dungeon = new Dungeon(name);
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(Room room) {
        this.dungeon.addRoom(room);
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(NPC npc) {
        this.dungeon.addNPC(npc);
        return this;
    }

    @Override
    public Dungeon build() {
        return dungeon;
    }
}
