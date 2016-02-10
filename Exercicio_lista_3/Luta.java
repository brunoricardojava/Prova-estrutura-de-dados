public class Luta{
  public static void main(String args[]) {

    Warrior guerreiro = new blueWarrior("Bruno","Guerreiro",200,200,300);
    Monster monstro = new zumbi("Kevin","Monstro",10,20,50);

    guerreiro.mostraInfo();

    guerreiro.attackWarrior(monstro);



    guerreiro.mostraInfo();

  }
}