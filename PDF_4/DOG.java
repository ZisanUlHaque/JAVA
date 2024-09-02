
package PDF_4;

public class DOG {
    String breed,size,color;
    int age;
    
    public void getInfo(){
        System.out.println("Breed is: "+breed+" Size is:"+size+" Age is:"+age+" color is: "+color);
    }
}

class Execute{
    public static void main(String ar[]){
        DOG d = new DOG();
        
        d.breed = "Maltese";
        d.size = "Small";
        d.age = 3;
        d.color = "white";
        
       d.getInfo();
    }
}