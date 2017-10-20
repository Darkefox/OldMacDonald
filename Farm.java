class Farm 
{     
   private Animal[] bunch = new Animal[3];
   public Farm()
   {
     bunch[0]=new NamedCow("cow", "moo", "Frenchy");
     bunch[1]=new Chick("chick", "cluck");
     bunch[2]=new Pig("pig", "oink");
   }
   public void animalSound()
   {
     for(int i=0; i< bunch.length;i++)
     {
       System.out.println( bunch[i].getType()+" goes "+ bunch[i].getSound());
     }
     System.out.println("The cow is known as " + ((NamedCow)bunch[0]).getName() );
   }
}