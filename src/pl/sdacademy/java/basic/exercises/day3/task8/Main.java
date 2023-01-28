package pl.sdacademy.java.basic.exercises.day3.task8;

public class Main {

    public static void main(String[] args) {
        Poem[] poems = new Poem[3];
        Author author1 = new Author("Tuwim", "PL");
        Author author2 = new Author("Chotomska", "PL");
        Author author3 = new Author("Keats", "GB");

        poems[0] = new Poem(author1, 25);
        poems[1] = new Poem(author2, 30);
        poems[2] = new Poem(author3, 15);

        String author = getSurnameWithMaxStropheNumbersV1(poems);
        System.out.println(author);

        author = getSurnameWithMaxStropheNumbersV2(poems);
        System.out.println(author);
    }

    private static String getSurnameWithMaxStropheNumbersV1(Poem[] poems) {
        int max = 0;
        Author author = null;
        for (Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumbers();
            if(max < currentStropheNumbers) {
                max = currentStropheNumbers;
                author = poem.getCreator();
            }
        }
        return author.getSurname();
    }

    private static String getSurnameWithMaxStropheNumbersV2(Poem[] poems) {
        int max = 0;
        String authorAsString = null;
        for (Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumbers();
            if(max < currentStropheNumbers) {
                max = currentStropheNumbers;
                authorAsString = poem.getCreator().getSurname();
            }
        }
        return authorAsString;
    }
}