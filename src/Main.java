public class Main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("Chaki",1,25,"man");
        Sheep sheep2 = new Sheep("Chaki",1,25,"man");
        Sheep sheep3 = new Sheep("Chaki",1,25,"man");

        Sheep[] sheepArray = new Sheep[]{sheep, sheep2, sheep3};
        for (int i = 0; i < sheepArray.length; i++) {
            System.out.println(sheepArray[i]);
        }
        Sheep[] sheepArray2 = new Sheep[]{sheep};

        Horse horse1=new Horse("Roze", 1, 20, "man","black" );
        Horse horse2=new Horse("Roze", 1, 20, "man","black" );

        Horse[] horsesArray=new Horse[]{horse1,horse2};
        for (int i = 0; i < horsesArray.length; i++) {
            System.out.println(horsesArray[i]);
        }
        Horse[] horsesArray2=new Horse[]{horse1};

        Cow cow1= new Cow("Mu -mu",2,60,"man");
        Cow cow2= new Cow("Mu -mu",2,60,"man");
        Cow cow3= new Cow("Mu -mu",2,60,"man");
        Cow cow4= new Cow("Mu -mu",2,60,"man");
        Cow cow5= new Cow("Mu -mu",2,60,"man");

        Cow[] cowsArray=new Cow[]{cow1,cow2,cow3,cow4,cow5};
        for (int i = 0; i < cowsArray.length; i++) {
            System.out.println(cowsArray[i]);
        }
        Cow[] cowsArray2=new Cow[]{cow1};

        Farm farm= new Farm("Moscow",cowsArray,horsesArray,sheepArray,"Dima Adam");
        Farm farm1=new Farm("Bishkek",cowsArray2,horsesArray2,sheepArray2,"Vlad Topalov");


    }
}