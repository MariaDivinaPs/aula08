public class App {
    public static void main(String[] args) throws Exception {
       Endereco end = new Endereco("jk", "centro", 1688, 7590000);
       Cliente c1 =  new Cliente(" Maria Divina", end);
       c1.imprimeInformacoes();
    }
}
