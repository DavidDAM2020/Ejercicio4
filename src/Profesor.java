import java.util.List;

public class Profesor extends Persona {

    String str;
    int edad;
    String numeroDeTelefono;
    List<Persona> personaList;
   
    public Profesor(String numeroDeTelefono) {
        super(numeroDeTelefono);
    }

  public void printInformacionPersonal(){

      System.out.println("nombre: " + str);
      System.out.println("edad: " +edad);
      System.out.println("Telefono: " + numeroDeTelefono);
  }

  public void printTodaLaInformacion(){

      System.out.println("nombre: " + str);
      System.out.println("edad: " +edad);
      System.out.println("Telefono: " + this.numeroDeTelefono);
      for(Persona p:personaList){
          System.out.println(p);

      }

  }

}
