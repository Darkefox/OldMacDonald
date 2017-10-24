class Chick implements Animal 
{     
     private String myType;
     private String mySound;

     public Chick(String type, String Sound1, String Sound2)
     {
       myType =type;
       Sound1 ="Cluck";
       Sound2="Cheep";
       mySound=(int)(Math.random()*2)+1;
       
     }
    
     public String getSound()
     {
       
       
     }
     public String getType() {
       return myType;
     }
}