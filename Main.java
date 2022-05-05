    class Main {


    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(1, "pedro");
        Aluno aluno2 = new Aluno(2, "Leonardo" );





      
        aluno1.curso.nome = "Ciencia da computação";
        aluno1.curso.disciplina1.nome = "Estatistica";
        aluno1.curso.disciplina1.notaFinal = 90;
        aluno1.curso.disciplina1.professor.nome = "Pelejado";

        aluno1.curso.disciplina2.nome = "Logica de Programação";
        aluno1.curso.disciplina2.notaFinal = 75;
        aluno1.curso.disciplina2.professor.nome = "Joani";

        aluno1.curso.disciplina3.nome = "Redes";
        aluno1.curso.disciplina3.notaFinal = 100;
        aluno1.curso.disciplina3.professor.nome = "Camila";


        aluno2.curso.nome = "Ciencia da computação";
        aluno2.curso.disciplina2.nome = "Logica de Programação";
        aluno2.curso.disciplina2.notaFinal = 75;
        aluno2.curso.disciplina2.professor.nome = "Joani";

        aluno2.curso.disciplina1.nome = "Estatistica";
        aluno2.curso.disciplina1.notaFinal = 70;
        aluno2.curso.disciplina1.professor.nome = "Pelejado";


        aluno2.curso.disciplina3.nome = "Redes";
        aluno2.curso.disciplina3.notaFinal = 30;
        aluno2.curso.disciplina3.professor.nome = "Camila";

        aluno1.curso.calcularMedia();
        aluno2.curso.calcularMedia();

        aluno1.curso.disciplina1.retornarNotaFinal();

        aluno1.curso.disciplina1.exibirRelatorioDisc();
        aluno1.curso.disciplina2.exibirRelatorioDisc();

        aluno1.exibirRelatorio();
        aluno2.exibirRelatorio();



    }
    }