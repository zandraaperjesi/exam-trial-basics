import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountAs {
  private String filename;
  private String pathToFile = "src/";
  private List<String> rawLines;

  public CountAs(String filename) {
    this.filename = filename;
    this.pathToFile += filename;
  }

  public static void main(String[] args) {

    CountAs countAs = new CountAs("afile.txt");
    System.out.println(countAs.readFile());
    CountAs countZero = new CountAs("not-a-file.txt");
    System.out.println(countZero.readFile());
  }

  public int readFile() {
    Path path = Paths.get(pathToFile);
    int numOfAs = 0;
    try {
      rawLines = Files.readAllLines(path);
    } catch (Exception e) {
      return 0;
    }
    for(String s : rawLines) {
      for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == 'a' || s.charAt(i) == 'A') {
          numOfAs += 1;
        }
      }
    }
    return numOfAs;
  }
}