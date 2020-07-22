public static void main(String[] args) {  
    Cliente[] arrayCliente = {
            new Cliente("Pedro"),
            new Cliente("Juan")
			new Cliente("Martin")
    };
    imprimirNumCedula(arrayCliente);
}

public static void imprimirNumCedula(Cliente[] arrayCliente){  
    for (Cliente cliente : arrayCliente) {
        if(cliente.nombre.equals("Pedro")) System.out.println(1015245896);
        if(cliente.nombre.equals("Juan")) System.out.println(1022456897);
		if(cliente.nombre.equals("Martin")) System.out.println(36456589);
    }
}