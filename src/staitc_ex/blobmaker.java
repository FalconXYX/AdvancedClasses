
package staitc_ex;


public class blobmaker {

   
    public static void main(String[] args) {
        blob a,b,c;
        a  = new blob("pog");
        b  = new blob("bob");
        c  = new blob("joe");
        System.out.println("Blobs are called");
        System.out.println(a.getstring());
        System.out.println(b.getstring());
        System.out.println(c.getstring());
        //how you accses a staic method you use class name instead of instance name. 
        System.out.println("blobs: "+blob.getblobcount());
        
    }
    
}
