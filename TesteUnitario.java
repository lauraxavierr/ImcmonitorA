class testeunitario{

  public void testNome(){

    Atleta atleta = new atleta();
    atleta.setNome("LauraXiz");

    if (atleta.getNome()  != "ABC")
    Sytem.out.prinln("erro! falha!");

  }

  public void testIdade(){

    Atleta atleta = new atleta();
    atleta.setIdade(10);

    if (atleta.getIdade()  != "10")
    Sytem.out.prinln("erro! falha no campo idade!");

  }

}