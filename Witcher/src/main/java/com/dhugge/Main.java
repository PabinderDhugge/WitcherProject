package com.dhugge;

import com.dhugge.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final Random GENERATOR = new Random();
    public static final int HEALTH = 500;

    public static void main(String[] args) {
        Witcher geraltOfRivia = new Geralt("Geralt of Rivia", Witcher.School.WOLF, 2000.0,100.3);
        Witcher merten = new Merten("Merten", Witcher.School.MANTICORE,1500.0,110.6);
        List<Monster> monsterPack = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            monsterPack.add(new Monster(HEALTH, 50));
        }

        List<Witcher> witcherSquad = new ArrayList<>();
        witcherSquad.add(geraltOfRivia);
        witcherSquad.add(merten);
        fight(witcherSquad, monsterPack);
        Class<Merten> mertenClass = Merten.class;
        Gourmet gourmet = mertenClass.getDeclaredAnnotation(Gourmet.class);
        System.out.println(gourmet.amount());
    }

    public static void fight(List<Witcher> witchers, List<Monster> monsters){
        while (witchers.size() > 0 && monsters.size() > 0){
            int witcherIndex = GENERATOR.nextInt(witchers.size());
            int monsterIndex = GENERATOR.nextInt(monsters.size());
            Witcher witcher = witchers.get(witcherIndex);
            Monster monster = monsters.get(monsterIndex);
            witcher.setHealth(witcher.getHealth() - monster.getDamage());
            monster.setHealth((monster.getHealth() - witcher.getDamage()));
            if(witcher.getHealth() <= 0){
                witchers.remove(witcherIndex);
            }
            if(monster.getHealth()<= 0){
                monsters.remove(monsterIndex);
            }
            if (monsters.isEmpty()){
                System.out.println("Witchers Win!");
            }
            if(witchers.isEmpty()){
                System.out.println("Monsters Win!");
            }

        }
    }
}
