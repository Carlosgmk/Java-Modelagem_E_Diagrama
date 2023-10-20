# Desafio Dio

@startuml IPhone

package IPhone { 

class ReprodutorMusical {
     <<abstract>>
	SelecionarMusica()
	Reproduzir()
	Pausar()
}

interface NavegadorInternet {
     <<abstract>>
	ExibirPagina()
	AdicionarAba()
	AtualizarPagina()
}

interface AparelhoTelefonico {
     <<abstract>>
	Ligar
	Atender(boolean)
     iniciarCorrerioVoz
}




}

@enduml
