public class ParametrosInvalidosException extends RuntimeException {
  ParametrosInvalidosException() {
    super(" Segundo parâmetro deve ser maior que o primeiro.");
  }
}
