# Assignment 1: Implement a Builder for a Complex Object

## Overview
This project demonstrates the use of the **Builder** and **Prototype** design patterns by constructing a dungeon with rooms and NPCs.

## How to Run
1. Ensure you have Java installed.
2. Navigate to the `src` directory.
3. Compile the Java files:
   ```sh
   javac *.java
   ```
4. Run the demo class:
   ```sh
   java MUDBuilderDemo
   ```

## Design Patterns Used
### Builder Pattern
The **Builder Pattern** is used to create a `Dungeon` object step by step, allowing flexibility in its construction.

### Prototype Pattern
The **Prototype Pattern** is used for cloning objects, ensuring that new instances can be created efficiently without relying on constructors.

## Class Descriptions
### `MUDBuilderDemo`
- The main class that demonstrates the functionality of the dungeon builder.
- It creates a `SimpleDungeonBuilder` instance and builds a `Dungeon` step by step.
- Calls `displayDungeon()` to print the dungeon details.

### `Dungeon`
- Represents the dungeon with a name, rooms, and NPCs.
- Has methods to display its contents.

### `Room`
- Represents a room in the dungeon.
- Stores a name and can be part of a dungeon.

### `NPC`
- Represents a Non-Playable Character (NPC) in the dungeon.
- Each NPC has a type (e.g., "Goblin" or "Dragon").

### `IDungeonBuilder`
- Interface defining methods for building a dungeon step by step.
- Includes methods for setting the dungeon name, adding rooms, and NPCs.

### `SimpleDungeonBuilder`
- Implements `IDungeonBuilder`.
- Uses the builder pattern to create and return a `Dungeon` instance.

## Sample Output
```
Dungeon: Dark Caverns
Rooms:
- Entrance
- Treasure Chamber
NPCs:
- Goblin
- Dragon
```

## Project Structure
```
solution-homework3/
├── src/
│   ├── Dungeon.java
│   ├── IDungeonBuilder.java
│   ├── MUDBuilderDemo.java
│   ├── NPC.java
│   ├── Room.java
│   ├── SimpleDungeonBuilder.java
│   ├── (Compiled .class files)
└── README.md
```

