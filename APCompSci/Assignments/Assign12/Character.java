package APCompSci.Assignments.Assign12;

import java.util.Random;

public abstract class Character {
    // Yeah none of this is really used for the soul purpose of making an entire rpg game would be a lot of work and more of final project type thing so I am not doing all that.
    // CLASSES USED: Barbarian, Cleric, Fighter, Paladin, Rogue, Warlock, Wizard
    // character class has level, hp, hpmax, etc

    // THIS IS DND BASED NOT JUST RPG GAME

    // Variables
    protected String className;
    protected String name;
    protected int level;
    protected int xp;
    protected int toNextLevel;
    protected int hitPoints;
    protected int hitPointsMax;
    protected int healthPotionsCount;
    protected int lockpickingCount;
    protected int trapDisarmCount;
    protected double weight;
    protected int weightLimit;
    protected int hitDice;
    public String enemy;


    /**
     * @param name
     * @param hp
     * @param hitDice
     * @param weightLimit
     * @param level
     * @param xp
     */
    public Character(String name, int hp, int hitDice, int weightLimit, int level, int xp){
        this.name = name;
        this.hitPointsMax = hp;
        hitPoints = hitPointsMax;
        this.hitDice = hitDice;
        this.weightLimit = weightLimit;
        this.level = level;
        this.xp = xp;
    }

    /**
     * @return What your class level is
     */
    protected final int getLevelCount() {
        return level;
    }

    /**
     * @return What how much xp you have
     */
    protected final int getXP() {
        return xp;
    }

    /**
     * @return What your hit point count is at (your health)
     */
    protected final int getHitPoints() {
        return hitPoints;
    }

    /**
     * @return Your hit point max (not including buffs)
     */
    protected final int getHitPointsMax() {
        return hitPointsMax;
    }

    /**
     * @return How many HP you have in your inventory
     */
    protected final int getHealthPotionCount() {
        return healthPotionsCount;
    }

    /**
     * @return How many Lockpicking kits you have in your inventory
     */
    protected final int getLockpickingCount() {
        return lockpickingCount;
    }

    /**
     * @return How many Trap Disarm kits you have in your inventory
     */
    protected final int getTrapDisarmCount() {
        return trapDisarmCount;
    }

    /**
     * @param level What the current character level is at
     */
    protected final void levelUp(int level) {
        level++;
    }

    /**
     * Adds the gained XP to the total XP then checks if the amount of XP is greater
     * than or equal to the XP level up max. It then subtracts that XP, reseting
     * your counter (and keeps any spill over XP)
     * 
     * @param xpToAdd Usually how much XP you get from an encounter, etc
     */
    protected final void addXP(int xpToAdd) {
        xp = xp + xpToAdd;
        if (xp >= toNextLevel) {
            levelUp(level);
            xp = xp - toNextLevel;
        }
    }

    /**
     * Takes in the damage and subtracts it from hp, then checks if the hp is less
     * than or equal to 0, declaring the character 'down' if it is.
     * 
     * @param dmgTaken The amount of damage taken (hp)
     */
    public final void damageTaken(int dmgTaken, Character enemy) {
        
        hitPoints -= dmgTaken;
        if (hitPoints <= 0) {
            hitPoints = 0;
            System.out.println(enemy.getName() + " is down...");
        }
    }
    protected abstract String getName();

    /**
     * @param foundHealthPotions How many health potions you gained
     */
    protected final void addHealthPotion(int foundHealthPotions) {
        healthPotionsCount += foundHealthPotions;
    }

    /**
     * @param foundLockpicks How many lockpicks you found
     */
    protected final void addLockpickingKit(int foundLockpicks) {
        lockpickingCount += foundLockpicks;
    }

    /**
     * @param foundTrapDisarm How many trap disarming kits you found
     */
    protected final void addTrapDisarmKit(int foundTrapDisarm) {
        trapDisarmCount += foundTrapDisarm;
    }
    public void attack(Character enemy){
        int damage = new Random().nextInt(hitDice) + 1;
        enemy.damageTaken(damage, enemy);
    }

    /**
     * An action for a character, etc
     * 
     * @return the action taken and what it did
     */
    abstract void action();
}
