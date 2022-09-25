public class TypesOfVariables {
    
  public  static String St = "Static Varible";         //Declared static variable
    
     public String IV  = "Instance Variable"; // Declared Instance Variable
 
   
           //Main Method
    public static void main(String[] args)
    {
        int var = 10; // Declared a Local Variable
        System.out.println("Local Variable: " + var);  // Displaying O/P
        
          
        TypesOfVariables name = new TypesOfVariables();  // Object Creation
        System.out.println("Varible Type is: " + name.IV);  // Displaying O/P
        
      
        System.out.println("Varible Type is : "+TypesOfVariables.St);  // static variable
    }
}