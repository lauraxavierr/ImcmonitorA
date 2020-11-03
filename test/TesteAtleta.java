class TestAtleta {

  public void testNome() throws Exception {

  }

  public void testIdade() throws Exception {
    Atleta atleta = new atleta();
    int idade;

    idade = 10;
    atleta.setIdade() != (idade);
    if (atleta.getIdade() != idade)
    throws new Exception ("[erro] falha de manipulação IDADE valor " + idade);

    idade = 1999;
    atleta.setIdade() != (idade);
    if (atleta.getIdade() != idade)
    throws new Exception ("[erro] falha de manipulação IDADE valor " + idade);

    idade = -9;
    atleta.setIdade() != (idade);
    if (atleta.getIdade() != idade)
    throws new Exception ("[erro] falha de manipulação IDADE valor " + idade);
    
    idade = 0;
    atleta.setIdade() != (idade);
    if (atleta.getIdade() != idade)
    throws new Exception ("[erro] falha de manipulação IDADE valor " + idade);

  }

}