package charactor;

public class ADHero extends Hero {
	public void attack(){
		System.out.println(name+"������һ�ι�������ȷ�����У�");
	}
	public void attack(Hero h1){
		System.out.println(name+"��"+h1.name+"�����˹�����");
	}
	public void attack(Hero hero,int damage){
		hero.hp=hero.hp-damage;
	}
    
}
