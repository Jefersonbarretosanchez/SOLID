class Cliente {  
    String Cedula;
	Int Nombre;

    Cliente(Int Cedula){ this.Cedula = Cedula; }
	Cliente(String Nombre){ this.Nombre = Nombre; }

    String getCedulaCliente(){ return Cedula; }
	String getNombreCliente(){ return Nombre; }
	

    void agregarClienteBD(Cliente cliente){ ... }
	void eliminarClienteBD(Cliente cliente){ ... }
}