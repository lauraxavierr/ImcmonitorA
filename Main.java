class Main {
  public static void main(String[] args) throws Exception {
    
    TesteUnitario tu = new TesteUnitario();  
    tu.executarAll();

    TelaConsoleMenu tela = new TelaConsoleMenu();
    tela.executar();

  }
}