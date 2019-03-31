package charactor;
import property.Armor;
import property.Item;
import property.Weapon;;
public class Hero {
 String name;
 float hp;
 float armor;
 int moveSpeed;
 public Hero(){};
 public Hero(String name){
	 this.name=name;
 };
 public Hero(String name,float hp,float armor,int moveSpeed){
	 this(name);
	 this.hp=hp;
	 this.armor=armor;
	 this.moveSpeed=moveSpeed;
	 
 }
 void keng(){
	 System.out.println("¿Ó¶ÓÓÑ");
 }
 float getmoveSpeed(){
	 return moveSpeed;
 }
 void addSpeed(int speed){
	 moveSpeed= moveSpeed+speed;
 }
 
 
 
 public static void main(String[] args) {
	
	 Hero h1 = new Hero();
	 Hero h2 = new Hero();
	 
	 h1.name="Ð¡¶¡";
	 h2.name="´ó¶¡";
	 
	ADHero garen = new ADHero();
	garen.name ="¸ÇÂ×";
	garen.hp = 14.5f;
	garen.armor = 36.77f;
	garen.moveSpeed =500;
	
	SupportHero teemo = new SupportHero();
	teemo.name = "ÌáÄª";
	teemo.hp = 40.33f;
	teemo.armor = 78.44f;
	teemo.moveSpeed = 600;
	
	garen.keng();
	garen.addSpeed(200);
	System.out.println(garen.getmoveSpeed());
	
	Armor clothArmor = new Armor();
	clothArmor.name="²¼¼×";
	clothArmor.grade=5;
	clothArmor.price=20;
	
	
	garen.attack(h1, h2);

	teemo.heal(h1,h2);

	
	
}
 
}
