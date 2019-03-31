package charactor;

public class ADHero extends Hero {
	public void attack(){
		System.out.println(name+"进行了一次攻击，并确定打中！");
	}
	public void attack(Hero h1){
		System.out.println(name+"对"+h1.name+"进行了攻击！");
	}
	public void attack(Hero hero,int damage){
		hero.hp=hero.hp-damage;
	}
    
}
