/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetSet1;

/**
 *
 * @author ASUS
 */
class GetSet {
    private String name;
    
    //Method 1 - Getter
    public String getName() { return name;}
    
    // Method 2 - Setter
    public void setName(String N)
    {
        this.name = N;
    }
}

class GFG {
    public static void main(String[] args)
    {
        GetSet obj = new GetSet();
        
        obj.setName("Geeks for Geeks");
        System.out.println(obj.getName());
    }
}
