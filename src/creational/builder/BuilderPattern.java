package creational.builder;

public class BuilderPattern {

  public static void main(String[] args) {
    SqlQueryBuilder sqlQueryBuilder = new MySqlQueryBuilder();
    String query = sqlQueryBuilder
        .select("name")
        .from("student")
        .where("name".equals("NHAN"))
        .getSqlQuery();
    System.out.println(query);
  }

}
