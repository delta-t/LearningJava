public class JarvisBeginning {

    public void sayHi(String...names) {
        for (String name:names){
            System.out.println("Good evening, " + name + ", how are you?");
        }
    }

    public static void main(String[] args) {
        JarvisBeginning jarvis = new JarvisBeginning();
        jarvis.sayHi("Tony Stark", "Black Widow", "Captain America", "Hulk", "Thor");
    }
}
