import org.apache.camel.builder.RouteBuilder;

public class AppWithDeps extends RouteBuilder {
  @Override
  public void configure() throws Exception {
    from("timer:tick?period=3000").setBody().constant("Hello world from Camel K").to("log:info");
  }
}
