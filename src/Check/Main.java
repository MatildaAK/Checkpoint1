package Check;

public class Main {
    public static void main(String[] args) {
       Step step = new Step();

       step.name = "Matilda";
       step.word = "Hello";
       step.num = 11;

       System.out.println("Checkpoint");

        System.out.println(step.word + " " + step.name + ".");
        System.out.println("number: " + step.num);
        Step step2 = new Step();

        step2.word = "Roses are red, violets are blue";
        System.out.println(step2.word);




    }
}