package com.serenitydojo;

public class Cat extends PetAnimal {
    //private String name; // declared in PetAnimal class
    //private int age;
   private String favouriteFood;

   public static final String CAT_NOISE = "Meow";

   public static String usualFood(){
       return "Tuna";
   }

    public Cat(String name, String favouriteFood, int age) {
       super(name,age);
       //this.name=name;
       this.favouriteFood= favouriteFood;
       //this.age= age;
    }

    public Cat(String name, int age) {
       super(name,age);
       //this.name=name;
       //this.age= age;
       this.favouriteFood = Cat.usualFood();
       this.favouriteFood = usualFood();
    }

   /*public String getName() {
        return name;
    }*/

    public String getFavouriteFood() { return favouriteFood; }

    /*public int getAge() {
        return age;
    }*/

    public void setFavouriteFood(String favouriteFood) { this.favouriteFood = favouriteFood; }

    @Override
    public String makeNoise() { return CAT_NOISE;
        // System.out.println(CAT_NOISE);
    }

    public void feed(String food) { System.out.println(getName() + " eats some " + food); }

    public void groom() { lickPaws(); cleanFur(); }

    private void cleanFur() { System.out.println(getName() + " Cleans His Fur"); }

    private void lickPaws() { System.out.println(getName() + " Licks His Paws"); }

    @Override
    public String play(){return " plays with string";}

    //public String setName(String name) {
    //  this.name = name;
    //}

}
