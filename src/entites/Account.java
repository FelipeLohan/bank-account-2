package entites;

public class Account {
  int id;
  String usuario;
  Double saldo;
  boolean aberta;
  
    //Constructor
  public Account(String usuario, int id) {
    this.usuario = usuario;
    aberta = true;
    saldo = 0.0;
    this.id = id;
  }

  //Methods
  public void deposit(double depositValue){
    setSaldo(getSaldo() + depositValue);
  }

  public void withdraw(double withdrawValue){
    if (aberta && getSaldo() > withdrawValue) {
      setSaldo(getSaldo() - withdrawValue);
      System.out.println("Saque realizado com sucesso no valor de: r$" + withdrawValue);
    } else{
      System.out.println("Saldo insuficiente!");
      System.out.println("Saldo Atual: r$" + getSaldo());
    }
  }



  //Getters and Setters
  public int getId() {
    return id;
  }

  private void setId(int id) {
    this.id = id;
  }

  public String getUsuario() {
    return usuario;
  }

  private void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public Double getSaldo() {
    return saldo;
  }

  private void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  public boolean isAberta() {
    return aberta;
  }

  private void setAberta(boolean aberta) {
    this.aberta = aberta;
  }
}
