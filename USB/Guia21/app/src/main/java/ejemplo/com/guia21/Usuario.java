package ejemplo.com.guia21;

/**
 * Created by Internet on 09/10/2017.
 */

public class Usuario{
        private String nombre;
        private String correo;

        public Usuario(String nombre, String correo) {
            this.nombre = nombre;
            this.correo = correo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }
}
