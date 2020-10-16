
package staitc_ex;

/**
 Static Variables are not instance variables, they are class level variables that apply to the entire class
 
 Static methods are abilities of the entire class and not of an individual object, these are run through the class not through an object 
 
 */
public class blob {
    private String name;
    //blobcount applies to the entire class
    private static int blobcount=0;
    //instances of blob can modify blobcount
    
    public blob(String n){
        name = n;
        blobcount++;
    
    }
    public String getstring(){
        return name;
    
    }
    // use static method to interact with staic private variable
    public static int getblobcount(){
        return blobcount;
    }
}
