
package Interface;
public class werewolf implements Monster {
    private String name;
    werewolf(String n){
        name = n;
    }
    
    
    public void attack() {
        System.out.println("Werewolf Used Claw");
    }

    
    public void identify() {
        System.out.println("I am"+name+" the werewolf");
        
    }
    
    
}
