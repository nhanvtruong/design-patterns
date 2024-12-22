package structural.adapter;

public interface HumanLanguageAdapter {

  EnglishReadable alienToEnglish(CosmicLanguage alien);

  VietnameseReadable alienToVietnamese(CosmicLanguage alien);

}

