public class Evento {
    String nomeEvento;
    String dataEvento;
    String localEvento;
    int numeroMaximo;

    Evento(){
        
    }

    Evento(String nomeEvento,String dataEvento,String localEvento,int numeroMaximo){
        this.numeroMaximo = numeroMaximo;
        this.localEvento = localEvento;
        this.dataEvento = dataEvento;
        this.nomeEvento = nomeEvento;
    }
}

