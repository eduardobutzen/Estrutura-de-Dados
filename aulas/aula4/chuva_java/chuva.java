public class chuva {

    public String ano;
    public String mes;
    public String temperatura;
    public String precipitacao;

    public chuva(String ano, String mes, String temperatura, String precipitacao) {
        this.ano = ano;
        this.mes = mes;
        this.temperatura = temperatura;
        this.precipitacao = precipitacao;
    }

    //reescrevemos toString para exibir um objeto completo da classe
    @Override
    public String toString() {
        return "ano: " + this.ano + " | mes: " + this.mes + " | temperatura: " + this.temperatura + " | precipitacao: " + this.precipitacao;
    }

    //reescrevemos para definir os atributos identificadores
    @Override
    public boolean equals(Object obj) {
     
        chuva c = (chuva)obj;
        return this.ano.equals(c.ano) && this.mes.equals(c.mes);

    }
}