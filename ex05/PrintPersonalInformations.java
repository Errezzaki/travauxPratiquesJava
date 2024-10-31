package ex05;

public class PrintPersonalInformations {

    public String name;
    public int age;

    PrintPersonalInformations(String name, int age)
    
    {
        this.age=age;
        this.name=name;


    }
    public void afficherInfos(){

        System.out.println("Nom : "+ this.name);
        System.out.println("Age : "+ this.age);
    }


    public static void main(String[] args) {
        PrintPersonalInformations personne = new PrintPersonalInformations("Jean Dupont", 25);
        personne.afficherInfos();
    }
    
}
