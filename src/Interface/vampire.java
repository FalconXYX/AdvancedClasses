
package Interface;
public class vampire implements Monster {
    private String name;
    vampire(String n){
        name = n;
    }
    
    
    public void attack() {
        System.out.println("Vampire Used Bite");
    }

    
    public void identify() {
        System.out.println("I am"+name+" the vampire");
        
    }
    public void changebat(){
         System.out.println("Vapmire Evolved into bat");
    }
    
}
