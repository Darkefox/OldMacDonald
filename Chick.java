class Chick implements Animal 
{     
     private String myType;
     private String mySound1,mySound2;

     public Chick(String type)
     {
       myType =type;
       //mySound =sound;
     }
    
     public String getSound()
     {
       return mySound;
     }
     public String getType() {
       return myType;
     }
}