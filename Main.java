package org.main;

import java.util.*;

class Chance {
    public String Name;
    public long Chance;
    public long Stack = 0;

    Chance(String NameParam, int ChanceParam) {
        Name = NameParam; Chance = ChanceParam;
    }

    void AddStack() {
        Stack ++;
    }
}

public class Main {
    static Chance[] Chances = {
            new Chance("Common", 2),
            new Chance("Uncommon", 4),
            new Chance("Good", 5),
            new Chance("Natural", 8),
            new Chance("Rare", 16),
            new Chance("Divinus", 32),
            new Chance("Crystallized", 64),
            new Chance("Rage", 128),
            new Chance("Glacier", 256),
            new Chance("Wind", 300),
            new Chance("Ruby", 350),
            new Chance("Gilded", 512),
            new Chance("Jackpot", 777),
            new Chance("Diaboli", 1004),
            new Chance("Undefined", 1111),
            new Chance("Precious", 1024),
            new Chance("Magnetic", 2048),
            new Chance("Bleeding", 4444),
            new Chance("Sidereum", 4096),
            new Chance("Lunar", 5000),
            new Chance("Solar", 5000),
            new Chance("Flushed", 6900),
            new Chance("Undead", 10000),
            new Chance("Comet", 12000),
            new Chance("Heated", 12800),
            new Chance("Permafrost", 24500),
            new Chance("Eclipse", 30000),
            new Chance("Stormal", 30000),
            new Chance("Aquatic", 40000),
            new Chance("Lobotomy", 69000),
            new Chance("Nautilus", 70000),
            new Chance("Exotic", 99999),

            new Chance("Devil", 100000),
            new Chance("Void", 100400),
            new Chance("Bounded", 200000),
            new Chance("Celestial", 350000),
            new Chance("Galaxy", 500000),
            new Chance("Full Moon", 500000),
            new Chance("Arcane", 1000000),

            new Chance("Glitch", 12210110),
            new Chance("Gravitational", 2000000),
            new Chance("Virtual", 2500000),
            new Chance("Flame", 4000000),
            new Chance("Hades", 6666666),
            new Chance("Hyper-Volt", 7500000),
            new Chance("Legacy", 15000000),
            new Chance("Starscourge", 15000000),
            new Chance("Chromatic", 20000000),
            new Chance("Dark Arcane", 30000000),
            new Chance("Apex", 49999500),
            new Chance("Matrix", 50000000),
            new Chance("Impeached", 200000000),
    };


    static Random RandomObject = new Random(System.currentTimeMillis());
    static Scanner Input = new Scanner(System.in);

    public static int SelectRNG() {
        for (int Index = Chances.length - 1; Index >= 0; Index--) {
            if (RandomObject.nextLong(Chances[Index].Chance) == 1) {
                Chances[Index].AddStack();
                return Index;
            }
        }
        return 0;
    }

    public static void Clear() {
        for (Chance Value : Chances) {
            Value.Stack = 0;
        }
    }

    public static void main(String[] args) {
        System.out.print("How much rolls: ");
        long SetTries = Input.nextLong();
        for (long Tries = 1; Tries <= SetTries; Tries ++) {
            System.out.println(Tries + "th Try: " + Chances[SelectRNG()].Name);
        }

        System.out.println("\nSimulation Result:");
        for (Chance Value : Chances) {
            System.out.println(Value.Name + ": " + Value.Stack);
        }
    }
}