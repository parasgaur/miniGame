package miniGame;

public class Main {
	public static void main(String[] args) {
		Player1 player  = new Player1("Raj","sword",500);
		//System.out.println(player.getName());
		//System.out.println(player.getHealth());
		//System.out.println(player.getWeapon());
		
		player.damageByGun1();
		player.damageByGun1();
		player.damageByGun2();
		
		player.heal();
		
	}
}
