package creational.builder;

public interface SqlQueryBuilder {

  SqlQueryBuilder select(String column);

  SqlQueryBuilder from(String table);

  SqlQueryBuilder where(boolean condition);

  String getSqlQuery();

}
