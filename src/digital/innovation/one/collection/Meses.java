package digital.innovation.one.collection;

public class Meses{
        private Integer mes;
        private String nome;
        private Double temperatura;

        public Meses(Integer mes, String nome, Double temperatura) {
            this.mes = mes;
            this.nome = nome;
            this.temperatura = temperatura;
        }

        public Integer getMes() {
            return mes;
        }

        public String getNome() {
            return nome;
        }

        public Double getTemperatura() {
            return temperatura;
        }

        @Override
        public String toString() {
            return "{" +
                    "mes=" + mes +
                    ", nome='" + nome + '\'' +
                    ", temperatura=" + temperatura +
                    '}';
        }
    }

