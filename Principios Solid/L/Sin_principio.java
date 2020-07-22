Cliente[] arrayClientes = {  
        new Pedro(),
        new Juan(),
        new Martin(),
        new Carlos()
};

public static void imprimirEdad(Cliente[] arrayClientes){  
    for (Cliente cliente : arrayClientes) {
        if(cliente instanceof Pedro)
            System.out.println(Edad(cliente));
        if(cliente instanceof Juan)
            System.out.println(Edad(cliente));
        if(cliente instanceof Martin)
            System.out.println(Edad(cliente));
        if(cliente instanceof Carlos)
            System.out.println(Edad(cliente));
    }
}
imprimirEdad(arrayClientes); 