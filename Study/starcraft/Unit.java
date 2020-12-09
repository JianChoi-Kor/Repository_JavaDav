package Study.starcraft;

public abstract class Unit {
	
	 protected final int MAX_HP;
	 protected int hp;
	 
	 public Unit(int hp) {
		 this.MAX_HP = hp;
		 this.hp = hp;
	 }
	 
	 public void showMyHp() {
		 System.out.printf("hp : %d \n", hp);
	 }
}