
package Interface;
public class zombie implements Monster {
    private String name;
    zombie(String n){
        name = n;
    }
    
    
    public void attack() {
        System.out.println("Zombie Used eat Brains");
    }

    
    public void identify() {
        System.out.println("I am"+name+" the zombie");
        
    }
    
    
}
