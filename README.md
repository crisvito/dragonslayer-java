# Mid Exam Exercise - DragonSlayer

## Learning Outcomes
- Implementing how to use multiple classes in object-oriented programming
- Implementing how to use the Wrapper Class data type
- Implementing how to use the encapsulation concept
- Implementing how to use class relationships using Java (Association, Aggregation, Composition)
- Implementing how to get high cohesion and low coupling with Java

## Main Goals
- Achieve expected output
- Maintain ***High Cohesion** and **Loose Coupling***

## Preparation
Before working on this case, create all class names and attributes in the development environment 
based on the ***class diagram***, then copy the ***Main class*** code into your workspace to facilitate easy 
reference and testing.

## Class Diagram
### Shop Class
![image](https://github.com/user-attachments/assets/bef8a298-1270-4747-b22e-babd0730af78)

### Dragon Class
![image](https://github.com/user-attachments/assets/05b787d0-178f-4dad-861d-51fe94271595)

### Knight Class
![image](https://github.com/user-attachments/assets/67d2d328-1d6d-446a-8bbd-10ab12bf7e9e)

### Inventory Class
![image](https://github.com/user-attachments/assets/4b1b33eb-e960-4ffd-a686-abb0172c92c3)

### Gold Class
![image](https://github.com/user-attachments/assets/2a6a1e8b-e345-4e74-a362-af32cf92f1ef)

### Item Class
![image](https://github.com/user-attachments/assets/9f713bf7-6da3-4e74-b7d1-665f6b68ca0e)


## Main Class
    public class Main {
         public static void main(String[] args) {
                Shop shop = new Shop();
                shop.addItem(new Item("Inferno Blade", "SWORD", 300, 100, 0, true, 0));
                shop.addItem(new Item("Frostfang", "SWORD", 200, 90, 0, false, 0));
                shop.addItem(new Item("Thunderstrike", "SWORD", 500, 150, 0, false, 0));
                shop.addItem(new Item("Obsidian Slayer", "SWORD", 800, 250, 0, true, 0));
                shop.addItem(new Item("Blazebringer", "SWORD", 2000, 500, 0, true, 0));
                shop.addItem(new Item("Dragonbone Plate", "ARMOR", 100, 0, 100, false, 0));
                shop.addItem(new Item("Celestial Armor", "ARMOR", 200, 0, 200, true, 0));
                shop.addItem(new Item("Elixir of Vitality", "CONSUMABLE", 75, 0, 0, false, 75));
                shop.addItem(new Item("Phoenix Draught", "CONSUMABLE", 100, 0, 0, false, 100));
        
                Knight darius = new Knight("Darius", new Gold(1700));
        
                shop.buyItem("Berserker Brew", darius);
                shop.buyItem("Blazebringer", darius);
                shop.buyItem("Obsidian Slayer", darius);
                shop.buyItem("Celestial Armor", darius);
                shop.buyItem("Phoenix Draught", darius);
        
                Dragon dragon = new Dragon("Obsidian Dreadwing", 5000, 50, 200, 1000);
        
                darius.attack(dragon);
        
                darius.equipSword("Inferno Blade");
                darius.equipSword("Obsidian Slayer");
                darius.equipArmor("Dragonbone Plate");
                darius.equipArmor("Celestial Armor");
        
                dragon.attack(darius, "CLAW");
                darius.attack(dragon);
                dragon.attack(darius, "FIRE");
        
                dragon.buff();
        
                darius.enhanceWeapon();
                darius.enhanceWeapon();
        
                dragon.attack(darius, "FIRE");
                dragon.attack(darius, "FIRE");
                dragon.attack(darius, "FIRE");
                dragon.attack(darius, "FIRE");
        
                darius.useConsumable("Phoenix Draught");
        
                darius.earnGold(500);
        
                shop.buyItem("Phoenix Draught", darius);
                shop.buyItem("Elixir of Vitality", darius);
        
                shop.upgradeInventory(darius, 10);
                shop.upgradeInventory(darius, 1);
        
                darius.unequipArmor();
                darius.unequipSword();
        
                shop.sellItem("Inferno Blade", darius);
                shop.sellItem("Celestial Armor", darius);
        
                dragon.attack(darius, "FIRE");
                dragon.attack(darius, "FIRE");
                dragon.attack(darius, "FIRE");
                dragon.attack(darius, "FIRE");
                dragon.attack(darius, "FIRE");
        
                Knight orin = new Knight("Orin", new Gold(3000));
        
                shop.buyItem("Blazebringer", orin);
                shop.buyItem("Celestial Armor", orin);
        
                orin.equipSword("Blazebringer");
                orin.equipArmor("Celestial Armor");
        
                dragon.buff();
                dragon.buff();
        
                orin.attack(dragon);
                dragon.attack(orin, "FIRE");
                dragon.attack(orin, "CLAW");
                dragon.attack(orin, "FIRE");
    
                orin.enhanceWeapon();    
    
                orin.attack(dragon);
                orin.attack(dragon);
                orin.attack(dragon);
                orin.attack(dragon);
                orin.attack(dragon);
                orin.attack(dragon);
                orin.attack(dragon);
                orin.attack(dragon);
                orin.attack(dragon);
                orin.attack(dragon);
                orin.attack(dragon);
                orin.attack(dragon);
            }
        }


## Dragon Slayer (Storyline)

## Chapter 1: **The Blackened Sky**

The kingdom of Eldoria lay under the shadow of an ancient terror. The Obsidian Dreadwing, a dragon of immense power, had emerged from the abyssal chasm, razing villages with its fiery breath and shattering armies with its talons. The king had sent his best warriors, yet none returned.

Desperate, the call for heroes echoed across the land. Among those who answered was Darius, a seasoned knight wielding nothing but his resolve and a modest purse of gold. He arrived at the grand market, seeking the finest weapons and armor.

### Todo:

- Establish a shop in Eldoria.
- Add new legendary items to the shop's inventory.
- Set up Darius visiting the shop to acquire his first gear.

## Chapter 2: **The Forge of Destiny**

Darius entered the famed shop of Eldoria, where the legendary arms of dragon slayers past lay in wait. He procured the Blazebringer, a sword forged in the flames of the First Sun, and the Obsidian Slayer, a blade rumored to have ended the reign of ancient drakes. He donned the Celestial Armor, a divine relic said to resist the searing breath of dragons, and stocked his pouch with potions that could mend wounds and rekindle life.

With his arsenal complete, Darius rode towards the blackened peaks where the dragon made its lair. The sky darkened, and the air grew thick with smoke and sulfur as he reached the battlefield.

### Todo:

- Attempt to purchase Berserker Brew but find it does not exist in the shop.
- Attempt to purchase Blazebringer but lack enough gold.
- Successfully purchase Obsidian Slayer and add the item to his inventory.
- Successfully purchase Celestial Armor and add the item to his inventory.
- Successfully purchase Phoenix Draught and add the item to his inventory.
- Show Darius preparing for battle and journeying to the dragon’s lair.

## Chapter 3: **Fire and Steel**

The Obsidian Dreadwing descended with a deafening roar, its obsidian scales gleaming with dark fire. Without hesitation, Darius lunged, swinging his blade in a fierce arc. The dragon retaliated, its claws raking through the air, striking against his armor with earth-shattering force. Flames erupted from its maw, engulfing the battlefield in a storm of fire.

Wounded but unyielding, Darius enhanced his weapons with enchanted reforging, his strikes growing swifter and deadlier. Yet, even the strongest steel was no match for the relentless firestorm of the beast. With each strike of the dragon’s breath, Darius' strength waned, until he fell to one knee.

### Todo:

- Introduce the **Obsidian Dreadwing**, an ancient dragon with high health and fire-based attacks.
- Start the battle with Knight unequipped, triggering a warning that he must equip a sword before attacking.
- Have the Knight equip sword and armor before engaging.
- Implement the **dragon’s attack** logic:
    - The initial damage is based on the dragon's attack type (claw or fire)
    - If the Knight has armor equipped, reduce damage taken by the defence value of the armor.
    - If the attack is fire-based and the armor has anti-fire properties, decrease damage further by 20%.
    - If the damage is less than or equal 0, show the message that the attack has been blocked
    - Otherwise, deal full damage.
- Implement the **dragon’s buff** logic:
    - Increase the claw damage by 10%
    - Increase the fire damage by 25%
    - Increase the health by 10%
- Allow Knight to enhance weapon attack damage by 10% if he has 500 gold; otherwise, display an error message.
- If the Knight takes too much damage, let him use consumable to heal, ensuring he does not exceed 1000 HP.
- Implement an inventory system where the Knight can purchase and store items, but prevent him from carrying more than the limit unless he upgrades inventory.
- Allow Knight to upgrade his inventory if he has enough gold (100 gold for 1 size); otherwise, display an error.
- Allow Knight to sell his items, checking if Knight has the item first. If he does, he earns 80% of the item's original price.
- If the Knight health reaches zero, display a message where the knight is dead.

## Chapter 4: **A New Challenger**

As all seemed lost, another knight emerged from the smoke. Orin, a warrior of unmatched skill, clad in Celestial Armor and wielding Blazebringer, charged into the fray. The dragon roared in fury as Orin’s strikes blazed with an intensity to rival its own flames. Blow after blow, Orin relentlessly carved through the dragon’s defenses.

The dragon, sensing its impending doom, summoned its infernal energy, buffing itself beyond its former strength. But Orin was undeterred. With unwavering focus, he unleashed a flurry of attacks, each strike chipping away at the beast’s immense vitality.

### Todo:

- Introduce Orin, the second knight.
- Show Orin’s skill and how he turns the tide of battle.
- Describe the dragon using its ultimate buff.

## Chapter 5: **The Final Blow**

With one final burst of strength, Orin delivered the decisive blow. His blade, burning with celestial fire, plunged deep into the dragon’s heart. The beast let out a final, earth-shaking roar before collapsing into a lifeless heap. The battle was over. Eldoria was free.

But the echoes of dragon wings still whispered in the wind, hinting that another darkness might one day rise. And when it did, the slayers of Eldoria would be ready.

### Todo:

- Describe the climactic moment where Orin delivers the finishing strike.
- Reward Orin with gold equal to the dragon’s rank multiplied by 5.

## Excpected Output
Berserker Brew does not exist in the shop!
Darius does not have enough gold to buy Blazebringer!
Darius has purchased Obsidian Slayer!
Darius has purchased Celestial Armor!
Darius has purchased Phoenix Draught!
Darius is not using any kind of sword!
Darius does not have Inferno Blade in the inventory!
Darius is equipping Obsidian Slayer!
Darius does not have Dragonbone Plate in the inventory!
Darius is equipping Celestial Armor!
Darius has successfully blocked the dragon's attack!
Dealing 250 damage to Obsidian Dreadwing! You need 4750 more damage to defeat the dragon!
Darius has successfully blocked the dragon's attack!
Obsidian Dreadwing has buffed his abilities!
Darius has enhanced Obsidian Slayer!
Darius does not have enough gold to enhance the weapon!
Dealing 40 damage to Darius! Obsidian Dreadwing need 960 more damage to defeat the knight!
Dealing 40 damage to Darius! Obsidian Dreadwing need 920 more damage to defeat the knight!
Dealing 40 damage to Darius! Obsidian Dreadwing need 880 more damage to defeat the knight!
Dealing 40 damage to Darius! Obsidian Dreadwing need 840 more damage to defeat the knight!
Darius use Phoenix Draught! (Health: 940)
Darius earned 500 gold!
Darius has purchased Phoenix Draught!
Darius's inventory is full! Please upgrade the inventory!
Darius does not have enough gold to upgrade 10 more inventory!
Darius has successfully upgraded 1 more inventory!
Darius does not have Inferno Blade in his inventory!
Darius has sold Celestial Armor for 160 gold!
Darius earned 160 gold!
Dealing 250 damage to Darius! Obsidian Dreadwing need 690 more damage to defeat the knight!
Dealing 250 damage to Darius! Obsidian Dreadwing need 440 more damage to defeat the knight!
Dealing 250 damage to Darius! Obsidian Dreadwing need 190 more damage to defeat the knight!
Dealing 190 damage to Darius! Darius has been defeated by Obsidian Dreadwing!
Darius already died!
Orin has purchased Blazebringer!
Orin has purchased Celestial Armor!
Orin is equipping Blazebringer!
Orin is equipping Celestial Armor!
Obsidian Dreadwing has buffed his abilities!
Obsidian Dreadwing has buffed his abilities!
Dealing 500 damage to Obsidian Dreadwing! You need 5821 more damage to defeat the dragon!
Dealing 152 damage to Orin! Obsidian Dreadwing need 848 more damage to defeat the knight!
Orin has successfully blocked the dragon's attack!
Dealing 152 damage to Orin! Obsidian Dreadwing need 696 more damage to defeat the knight!
Orin has enhanced Blazebringer!
Dealing 550 damage to Obsidian Dreadwing! You need 5271 more damage to defeat the dragon!
Dealing 550 damage to Obsidian Dreadwing! You need 4721 more damage to defeat the dragon!
Dealing 550 damage to Obsidian Dreadwing! You need 4171 more damage to defeat the dragon!
Dealing 550 damage to Obsidian Dreadwing! You need 3621 more damage to defeat the dragon!
Dealing 550 damage to Obsidian Dreadwing! You need 3071 more damage to defeat the dragon!
Dealing 550 damage to Obsidian Dreadwing! You need 2521 more damage to defeat the dragon!
Dealing 550 damage to Obsidian Dreadwing! You need 1971 more damage to defeat the dragon!
Dealing 550 damage to Obsidian Dreadwing! You need 1421 more damage to defeat the dragon!
Dealing 550 damage to Obsidian Dreadwing! You need 871 more damage to defeat the dragon!
Dealing 550 damage to Obsidian Dreadwing! You need 321 more damage to defeat the dragon!
Dealing 321 damage to Obsidian Dreadwing! Obsidian Dreadwing has been defeated by Orin!
Orin earned 5000 gold by killing the dragon!
Obsidian Dreadwing already died!

