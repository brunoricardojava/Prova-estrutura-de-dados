import javax.swing.JOptionPane;

//Class abstract of character
abstract class character{

	//Atributos dos personagens
	private String name; //Name of character
	private String tipo; //type of player
	private int vida;
	private int attack;  //Value of attack
	private int defense;  //Value of defense

	character(String Name, String Tipo, int Vida, int Attack, int Defense){
		this.name = Name;
		this.tipo = Tipo;
		this.vida = Vida;
		this.attack = Attack;
		this.defense = Defense;
	}

	//Metodos Set
	public void setName(String Name){
		this.name = Name;
	}

	public void setTipo(String Tipo){
		this.tipo = Tipo;
	}

	public void setVida(int Vida){
		this.vida = Vida;
	}

	public void setAttack(int Attack){
		this.attack = Attack;
	}

	public void setDefense(int Defense){
		this.defense = Defense;
	}

	//Metodos Get
	public String getName(){
		return this.name;
	}

	public String getTipo(){
		return this.tipo;
	}

	public int getVida(){
		return this.vida;
	}

	public int getAttack(){
		return this.attack;
	}

	public int getDefense(){
		return this.defense;
	}

	public void mostraInfo(){

		JOptionPane.showMessageDialog(null, "Nome: "+this.getName()+"\n"+
											"Tipo: "+this.tipo+"\n"+
											"Vida: "+this.vida+"\n"+
											"Ataque: "+this.getAttack()+"\n"+
											"Defesa: "+this.getDefense()+"\n");

		/*System.out.println("Nome: "+this.getName());
		System.out.println("Tipo: "+this.tipo);
		System.out.println("Ataque: "+this.getAttack());
		System.out.println("Defesa: "+this.getDefense());*/

	}

}





//Class abstract of warrior
abstract class Warrior extends character{

	private int points = 0;

	Warrior(String Name, String Tipo, int Vida, int Attack, int Defense){
		super(Name, Tipo, Vida, Attack, Defense);
	}

	public void attackWarrior(character Monster1){

		if(Monster1.getDefense()<this.getAttack()){
			//System.out.println("O guerreiro venceu!!!");
			JOptionPane.showMessageDialog(null, "O guerreiro venceu!!!");
			super.setVida(super.getVida()+10);
			super.setAttack(super.getAttack()+10);
			super.setDefense(super.getDefense()+5);
		}
		else{
			
			if(Monster1.getDefense()>this.getAttack() && this.getDefense()<Monster1.getAttack()){
				//System.out.println("O guerreiro morreu :(...");
				JOptionPane.showMessageDialog(null, "O guerreiro morreu :(");
				super.setVida(0);
			}

			else{
				JOptionPane.showMessageDialog(null, "Empate, aceitem as diferencas...");
			}
			/*if(Monster1.getAttack()<this.getAttack()){
					System.out.println("O guerreiro venceu!!!");
					super.setAttack(super.getAttack()+10);
					super.setDefense(super.getDefense()+5);
				}
				else{
					System.out.println("O guerreiro morreu :(...");
			}*/
		}
	}
}






//Class abstract of Monsters
abstract class Monster extends character{

	//Attributes of Monsters
	private int points = 100;

	Monster(String Name, String Tipo, int Vida, int Attack, int Defense){
		super(Name, Tipo, Vida, Attack, Defense);
	}

	public void attackMonster(character Warrior1){

		if(Warrior1.getDefense()<this.getAttack()){
			System.out.println("O mosntro venceu!!!");
		}
		else{
			
			if(Warrior1.getDefense()>this.getAttack()){
				System.out.println("O monstro morreu :(...");
			}

			if(Warrior1.getDefense()==this.getAttack()){
				if(Warrior1.getAttack()<this.getAttack()){
					System.out.println("O monstro venceu!!!");
				}
				else{
					System.out.println("O monstro morreu :(...");
				}
			}

		}

	}
}


//Interface habilidade Fogo
interface habilidadeFogo{
	public abstract void habilidade_fogo();
}




//Interface habilidade Vida
interface habilidadeVida{
	public abstract void habilidade_vida();
}


//Criando as classes que serão instanciadas

class blueWarrior extends Warrior implements habilidadeVida{

	blueWarrior(String Name, String Tipo, int Vida, int Attack, int Defense){
		super(Name, Tipo, Vida, Attack, Defense);
	}

	public void golpe(){
		System.out.println("Chute!");
	}

	@Override
	public void habilidade_vida(){
		System.out.println("Habilidade Vida!!!");
	}

}

class redWarrior extends Warrior implements habilidadeFogo{

	redWarrior(String Name, String Tipo, int Vida, int Attack, int Defense){
		super(Name, Tipo, Vida, Attack, Defense);
	}

	public void golpe(){
		System.out.println("Soco!");
	}

	@Override
	public void habilidade_fogo(){
		System.out.println("Habilidade Fogo!");
	}
}

class dragao extends Monster implements habilidadeFogo{

	dragao(String Name, String Tipo, int Vida, int Attack, int Defense){
		super(Name, Tipo, Vida, Attack, Defense);
	}

	public void golpe(){
		System.out.println("Golpe com Calda!!!");
	}

	@Override
	public void habilidade_fogo(){
		System.out.println("Habilidade Fogo!");
	}

}

class zumbi extends Monster implements habilidadeVida{

	zumbi(String Name, String Tipo, int Vida, int Attack, int Defense){
		super(Name, Tipo, Vida, Attack, Defense);
	}

	public void golpe(){
		System.out.println("Reviver!!!");
	}

	@Override
	public void habilidade_vida(){
		System.out.println("Habilidade Vida!!!");
	}

}

class gigante extends Monster{

	gigante(String Name, String Tipo, int Vida, int Attack, int Defense){
		super(Name, Tipo, Vida, Attack, Defense);
	}

	public void golpe(){
		System.out.println("Pisar!!!");
	}
}

