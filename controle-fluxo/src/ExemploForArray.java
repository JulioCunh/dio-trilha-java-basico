public class ExemploForArray {
  public static void main(String[] args) {
    String alunos[] = { "Felipe", "Jonas", "Julia", "Marcos" };

    for (String aluno : alunos) {
      System.out.println("Nome do aluno  " + aluno);
    }

    /*
     * for (int x = 0; x < alunos.length; x++) {
     * System.out.println("O aluno no indice X = " + x + " é " + alunos[x]);
     * }
     */

  }
}
