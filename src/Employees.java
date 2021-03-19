public abstract class Employees  {
   private String name;

   public Employees(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public  void  voice(){
      System.out.println(name);
   }
}