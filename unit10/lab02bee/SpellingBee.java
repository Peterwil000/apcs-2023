import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class SpellingBee {
    // TODO construct me!
    private char[] letetrs;
    private char mustUse;

    public boolean checkWord(String word) {
        if (word.length() < 4 || word.length() < word.indexOf(mustUse)){
            return false;
        }
        else 
        return true;
    }

    public SpellingBee(char[] letetrs, char mustUse) {
        this.letetrs = letetrs;
        this.mustUse = mustUse;
    }


    /**
     * Loads the contents of file "filename" as a String.
     * 
     * @param filename the file to load
     * @return the contents of file "filename"
     */
    public static String loadFile(String filename) {
        String contents = "";
        Path path = Paths.get(filename);
        try {
            path = Path.of(ClassLoader.getSystemResource(filename).toURI());
            contents = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return contents;
    }

        public static double Picalc(double num) {
            if(num == 1) {
                return 3;
            } else {
                return (num);
            }
        }

    public static void main(String[] args) {
        String[] words = loadFile("words_dropped.txt").split("\n");
        System.out.println("Loaded " + words.length + " words");
        // TODO solve me!
        // SpellingBee bee = new SpellingBee("ranglty".toCharArray(), 'y');

        // TODO sort words!

        // TODO what position in the sorted list is the word "search" ?

        // Linear Search
        Arrays.sort(words);
        int n = 0;
        for(String word:words){
            n++;
            if(words.equals("potato")){
                //System.out.println("found potato at " + n);
            }
        }

        String findMe = "potato";        

        int begin = 0;
        int end = words.length - 1;
        int guess = (begin + end) / 2;
        int check = words[guess].compareTo(findMe);
        System.out.println("word is ");
        System.out.println("check is " + check);

        System.out.println(Picalc(10));

    }
}

    