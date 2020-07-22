class BaseDatosClientes{  
    
    void getClientes(){ 
}

class ConsultaClientes {

    private BaseDatosClientes basedatosclientes;

    public ConsultaClientes(BaseDatosClientes basedatosclientes){
        this.basedatosclientes = basedatosclientes;
    }

    Dato getClientes(){
        basedatosclientes.getClientes();
        
    }
}