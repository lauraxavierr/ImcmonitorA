class testeunitario{

  public void executarAll(){

    this.testNome();
    this.testIdade();
  }

  public void testNome(){

    Atleta atleta = new Atleta();
    atleta.setNome("ABC");

    if (!atleta.getNome().equals("ABC"))
    System.out.println("erro! falha!");

  }

  public void testIdade(){

    Atleta atleta = new Atleta();
    atleta.setIdade(10);

    if (atleta.getIdade()  != 10)
    System.out.println("erro! falha no campo idade!");

  }
  

}