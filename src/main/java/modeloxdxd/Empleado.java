package modeloxdxd;


import javax.persistence.*;

@Entity
@Table(name = "persona")

public class Empleado {
    String Usuario;
    String contraseña;
    int edad;

    public Empleado(String usuario, String contraseña, int edad) {
        Usuario = usuario;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
