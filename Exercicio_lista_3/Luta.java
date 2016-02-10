import javax.swing.JOptionPane;

public class Luta{
  public static void main(String args[]) {

  	String Nome = JOptionPane.showInputDialog("Digite o nome do guerreiro:");
  	String Tipo = JOptionPane.showInputDialog("Digite o tipo do guerreiro:");
  	int Vida = Integer.parseInt(JOptionPane.showInputDialog("Digite a vida do guerreiro:"));
  	int Ataque = Integer.parseInt(JOptionPane.showInputDialog("Digite o ataque do guerreiro:"));
  	int Defesa = Integer.parseInt(JOptionPane.showInputDialog("Digite a defesa do guerreiro:"));


    Warrior guerreiro = new blueWarrior(Nome,Tipo,Vida,Ataque,Defesa);
    Monster monstro = new zumbi("Kevin","Monstro",10,20,50);

    guerreiro.mostraInfo();

    guerreiro.attackWarrior(monstro);



    guerreiro.mostraInfo();

  }
}