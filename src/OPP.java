public class OPP {
    public static void main(String[] args) {
        Bear b=new Bear();
        b.Carnivore();
        b.Herbivore();
    }
}
interface  Herbivore {

}
interface Carnivore{

}
class Bear implements Herbivore,Carnivore{
    void Herbivore(){
        System.out.println("grep");
    }
    void Carnivore(){
        System.out.println("meet");
    }
}

interface ChessPlayer{
    void movies();
}
class Queen implements ChessPlayer{
   public void movies (){
       System.out.println("all code");
    }
}
class king implements ChessPlayer{
    public void movies (){
        System.out.println("all code king ");
    }
}
class Rook implements ChessPlayer{
    public void movies (){
        System.out.println("only one code");
    }
}

