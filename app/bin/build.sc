import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object Spring extends ScalaModule {
    def scalaVersion = "2.12.9"

    def ivyDeps = Agg(
      ivy"org.springframework.boot:spring-boot-starter-web:2.4.2",
      ivy"org.joinfaces:primefaces-spring-boot-starter:4.3.12",
      ivy"javax.enterprise:cdi-api:1.2"
    )
}
