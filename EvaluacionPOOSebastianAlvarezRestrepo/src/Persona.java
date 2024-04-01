
public abstract class Persona {
	String nombre;
	String direccion;
	String telefono;
	String email;
	
	public Persona(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
	}
	
	 
	 public String toString() {
	        return "Nombre: " + nombre + "\nDirección: " + direccion + "\nTeléfono: " + telefono + "\nCorreo electrónico: " + email;
	    }
	

	 public void SetNombre (String nombre) {
			this.nombre = nombre;
		}
		
	 public void SetDireccion (String direccion) {
			this.direccion = direccion;
		}
	 public void SetTelefono (String telefono) {
			this.telefono = telefono;
		}
	 public void SetEMalil (String email) {
			this.email = email;
		}
	 
	 
	 
	 public String getNombre (String nombre) {
		 return this.nombre;
		 
	 }
	 
	 public String getDireccion (String direccion) {
		 return this.direccion;
		 
	 }
	 
	 public String getTelefono (String telefono) {
		 return this.nombre;
		 
	 }

	 public String getEmail (String Email) {
		 return this.email;
		 
	 }




}




