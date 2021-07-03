public class Client {

    int _id;
    String _name;
    int _soldeCompte;

    public Client(int id, String name, int soldeCompte){
        _id = id;
        _name = name;
        _soldeCompte = soldeCompte;
    }

    public String GetName(){
        return _name;
    }
}
