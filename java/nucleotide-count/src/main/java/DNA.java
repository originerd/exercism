import java.util.Arrays;

public class DNA {
  private String dna;

  DNA(String dna) {
    this.dna = dna;
  }

  long count(char c) {
    return Arrays.stream(dna.split(""))
                 .filter(x -> x.charAt(0) == c)
                 .count();
  }
}
