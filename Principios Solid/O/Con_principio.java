abstract class Cliente {
    // ...
    abstract int NumCedula();
}

class Pedro extends Cliente {
    @Override
    int NumCedula() { return 1015245896; }
}

class Juan extends Cliente {
    @Override
    int NumCedula() { return 1022456897; }
}

class Martin extends Cliente {
    @Override
    int NumCedula() { return 36456589; }
}

public static void main(String[] args) {

    Cliente[] arrayClientes = {
            new Pedro(),
            new Juan(),
            new Martin()
    };

    imprimirNumCedula(arrayClientes);
}

public static void imprimirNumCedula(Cliente[] arrayClientes){
    for (Cliente cliente : arrayClientes) {
        System.out.println(cliente.NumCedula());
    }
}