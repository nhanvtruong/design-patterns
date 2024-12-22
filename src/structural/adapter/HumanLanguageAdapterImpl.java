package structural.adapter;

public class HumanLanguageAdapterImpl implements HumanLanguageAdapter {

  @Override
  public EnglishReadable alienToEnglish(CosmicLanguage alien) {
    return new EnglishReadable(alien.getCosmicMessage());
  }

  @Override
  public VietnameseReadable alienToVietnamese(CosmicLanguage alien) {
    return new VietnameseReadable(alien.getCosmicMessage());
  }
}
