public class Attire {
    public static void main(String[] args) {
        Clothing[] clothings = {
            new Clothing("a hat"),
            new Clothing("a jumpsuit"),
            new Clothing("shoes")
        };

        String[] clothesNames = new String[clothings.length];
        for (int i=0; i<clothings.length; i++) {
            clothesNames[i] = clothings[i].getName();
        }

        System.out.println(String.format("You are wearing %s.", String.join(", ", clothesNames)));
    }
}
