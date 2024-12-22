package creational.builder;

public class MySqlQueryBuilder implements SqlQueryBuilder {

  private static StringBuilder query;

  public static MySqlQueryBuilder build() {
    query = new StringBuilder();
    return new MySqlQueryBuilder();
  }

  @Override
  public SqlQueryBuilder select(String column) {
    query.append("SELECT ").append(column);
    return this;
  }

  @Override
  public SqlQueryBuilder from(String table) {
    query.append(" FROM ").append(table);
    return this;
  }

  @Override
  public SqlQueryBuilder where(boolean condition) {
    query.append(" WHERE ").append(condition);
    return this;
  }

  @Override
  public String getSqlQuery() {
    return query.toString();
  }
}
