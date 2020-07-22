class BaseDatosClientes implements Consulta{

    @Override
    public Dato getClientes() { //... }

    @Override
    public void setClientes() { //... }
}

class Factura implements Consulta{

    @Override
    public Dato getClientes() { //... }

    @Override
    public void setClientes() { //... }
}

interface Consulta {  
    Dato getClientes();
    void setClientes();
	}

class ConsultaClientes {

    private Consulta consulta;

    public ConsultaClientes(Consulta consulta){
        this.consulta = consulta;
    }

    Dato getClientes(){
        consulta.getClientes();
    }
}