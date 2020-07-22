interface ProductoFactura {  
    void Referencia();
	void Precio();
}
interface ProductoEmpaquetadoFactura {  
    void Cantidad();
}

interface ProductoGranelFactura {  
    void Peso();
}

class Arroz_Diana implements ProductoFactura, ProductoEmpaquetadoFactura{

    @Override
    public void Referencia() {
        //...
    }

	@Override
    public void Cantidad() {
        //...
    }
	
    @Override
    public void Precio() {
        //...
    }
	
}

class Arroz_Granel implements ProductoFactura, ProductoGranelFactura{

    @Override
    public void Referencia() {
        //...
    }
	
	@Override
    public void Peso() {
        //...
    }
	
	@Override
    public void Precio() {
        //...
    }
}