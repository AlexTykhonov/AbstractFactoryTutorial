public class AbstractFactoryTutorial {
    public static void main(String[] args) {


        AbstractFactory chocolateFactory = new ChocolateFactory();
        AbstractFactory creamyFactory = new CreamyFactory();

        chocolateFactory.getCake().printName();
        chocolateFactory.getCake().printPrice();
        chocolateFactory.getMilkCocktail().printNameCo();
        chocolateFactory.getMilkCocktail().printPriceCo();

        creamyFactory.getCake().printName();
        creamyFactory.getCake().printPrice();
        creamyFactory.getMilkCocktail().printNameCo();
        creamyFactory.getMilkCocktail().printPriceCo();
    }

}

    interface AbstractFactory {
        Cake getCake ();
        MilkCoctail getMilkCocktail ();
    }

    class ChocolateFactory implements AbstractFactory {

        @Override
        public Cake getCake() {
            return new ChocolateCake();
        }

        @Override
        public MilkCoctail getMilkCocktail() {
            return new ChocolateMilkCocktail();
        }
    }


    class CreamyFactory implements AbstractFactory {

        @Override
        public Cake getCake() {
            return new CreamyCake();
        }

        @Override
        public MilkCoctail getMilkCocktail() {
            return new CreamyMilkCocktail();
        }
    }


    // ПИРОЖНЫЕ

    interface Cake {
        void printName ();
        void printPrice ();
    }


    class ChocolateCake implements Cake {

        @Override
        public void printName() {
            System.out.println("WE produced 1 ChocoCake!");
        }

        @Override
        public void printPrice() {
            System.out.println("Price for 1 ChocoCake is $12.00");
        }
    }

    class CreamyCake implements Cake {

        @Override
        public void printName() {
            System.out.println("WE produced 1 CREAMYCake!");
        }

        @Override
        public void printPrice() {
            System.out.println("Price for 1 CREAMYCake is $9.00");
        }
    }


    // КОКТЕЙЛИ

    interface MilkCoctail {
        void printNameCo ();
        void printPriceCo ();
    }
    class ChocolateMilkCocktail implements MilkCoctail {

        @Override
        public void printNameCo() {
            System.out.println("WE produced 1 Chocolate MilkCocktail!");

        }

        @Override
        public void printPriceCo() {
            System.out.println("Price for 1 Chocolate MilkCocktail is $3.00");

        }
    }

    class CreamyMilkCocktail implements MilkCoctail {

        @Override
        public void printNameCo() {
            System.out.println("WE produced 1 CREAMY MilkCocktail!");

        }

        @Override
        public void printPriceCo() {
            System.out.println("Price for 1 CREAMY MilkCocktail is $2.00");

        }
    }


