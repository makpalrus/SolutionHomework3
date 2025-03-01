# SolutionHomework3

## Project Description

This project demonstrates three different design patterns: **Builder**, **Prototype**, and their **combination**.

### Functionality:

1. **Builder** — step-by-step object creation.
2. **Prototype** — object cloning.
3. **Combined Approach** — integration of both approaches.

## Project Structure and Class Logic

```
/src/com/example/builder/
    IDungeonBuilder.java        # Interface for dungeon construction
    SimpleDungeonBuilder.java  # Implementation of the dungeon builder
    Dungeon.java               # Dungeon class
    MUDBuilderDemo.java        # Demonstration of the Builder pattern

/src/com/example/prototype/
    CloneableGameEntity.java   # Base class for cloneable objects
    Room.java                  # Room class (supports cloning)
    NPC.java                   # NPC class (supports cloning)
    MUDPrototypeDemo.java      # Demonstration of the Prototype pattern

/src/com/example/combined/
    MUDCombinedDemo.java       # Combined approach
```

### Detailed Explanation of Classes

#### **Builder Pattern**

- `IDungeonBuilder.java` — Interface defining methods for step-by-step dungeon creation.
- `SimpleDungeonBuilder.java` — Concrete builder implementation that creates dungeons with specified parameters (name, rooms, NPCs).
- `Dungeon.java` — Main dungeon class containing a list of rooms and NPCs.
- `MUDBuilderDemo.java` — Demonstration of the **Builder** pattern, where a dungeon is created following a predefined scenario.

#### **Prototype Pattern**

- `CloneableGameEntity.java` — Abstract class implementing the `Cloneable` interface, allowing game objects to be cloned.
- `Room.java` — Room class containing a name and description, supports cloning.
- `NPC.java` — NPC class containing a name, description, and health level, also supports cloning.
- `MUDPrototypeDemo.java` — Demonstration of the **Prototype** pattern, where room and NPC objects are cloned.

#### **Combined Approach**

- `MUDCombinedDemo.java` — Integrates both **Builder** and **Prototype** patterns. Rooms are created using the Builder, then their copies are cloned using the Prototype.


