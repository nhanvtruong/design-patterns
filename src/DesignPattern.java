import structural.adapter.AlienLanguage;
import structural.adapter.EnglishReadable;
import structural.adapter.HumanLanguageAdapter;
import structural.adapter.HumanLanguageAdapterImpl;
import structural.adapter.VietnameseReadable;

public class DesignPattern {

  public static void main(String[] args) {

    AlienLanguage alienLanguage = new AlienLanguage("aef970830c05910b8f376d51a8c8502c");

    HumanLanguageAdapter humanLanguageAdapter= new HumanLanguageAdapterImpl();

    EnglishReadable englishReadable = humanLanguageAdapter.alienToEnglish(alienLanguage);
    System.out.println(englishReadable.getTranslatedMessage());

    VietnameseReadable vietnameseReadable = humanLanguageAdapter.alienToVietnamese(alienLanguage);
    System.out.println(vietnameseReadable.getTranslatedMessage());
  }

}
