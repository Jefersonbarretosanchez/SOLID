abstract class Cliente {
    // ...
    abstract int Edad();
}
class Pedro extends Cliente {
    @Override
    int Edad() { return 25; }
}

class Juan extends Cliente {
    @Override
    int Edad() { return 45; }
}

class Martin extends Cliente {
    @Override
    int Edad() { return 52; }
}

class Carlos extends Cliente {
    @Override
    int Edad() { return 18; }
}

Cliente[] arrayClientes = {  
        new Pedro(),
        new Juan(),
        new Martin(),
        new Carlos()
};

public static void imprimirEdad(Cliente[] arrayClientes){  
    for (Cliente cliente : arrayClientes) {
        System.out.println(cliente.Edad());
    }
}
imprimirEdad(arrayClientes); 