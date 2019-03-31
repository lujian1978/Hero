package charactor;

public class SupportHero extends Hero {
	
	public void heal(Hero...heros){
				for(int i=0;i<heros.length;i++){
			System.out.println(name+"жнафак"+heros[i].name+"!");
		}
		 
	}
	

}
