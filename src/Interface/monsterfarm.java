package Interface;

public class monsterfarm {

    public static void main(String args[]) {
        Monster x[] = new Monster[6];
        for (int i = 0; i < 10; i++) {
            if (i <2) {
                x[i] = new vampire("Monster"+(i+1));
                
            }
            if (i <4) {
                x[i] = new zombie("Monster"+(i+1));
                
            }
            else{ x[i] = new werewolf("Monster"+(i+1));}
            
        }
        for (int j = 0; j < 6; j++) {
                x[j].attack();
                 x[j].identify();
                 if (x[j] instanceof vampire) {
                     ((vampire)x[j]).changebat();
                
            }
                 
            }

    }
}
