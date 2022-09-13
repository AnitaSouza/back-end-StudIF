package br.edu.ifsp.studif.repository;

import java.util.ArrayList;

import br.edu.ifsp.studif.model.Dicas;

public class DicasRepository {
    private static DicasRepository repo;

    private ArrayList<Dicas> dicas;

    private DicasRepository() {
        this.dicas = new ArrayList<>();
    }

    public static void init() {
        if (DicasRepository.repo == null) {
            DicasRepository.repo = new DicasRepository();

            DicasRepository.add(
                    new Dicas(
                            "Claudia dos Santos",
                            "Aposte na aprendizagem contextual:a proposta é associar as ideias, relacionando as informações de um jeito que faça sentido para você compreender.",
                            "14/06/2022"));

            DicasRepository.add(
                    new Dicas(
                            "Larissa Rodrigues",
                            "Revise os temas mais importantes antes de dormir: durante o sono que o processo de memorização fica mais intenso.",
                            "04/06/2022"));

            DicasRepository.add(
                    new Dicas(
                            "Giovane Gonçalves",
                            "Faça pausas intercaladas durante os períodos de estudo:O ideal é fazer algumas pausas para você não sobrecarregar o seu cérebro. Aproveite os intervalos para esticar o corpo, comer alguma coisa e relaxar.",
                            "21/06/2022"));

            DicasRepository.add(
                    new Dicas(
                            "Fernando Alberto",
                            "Crie conexões entre o tema estudado e a sua vida:Dessa forma, é mais fácil compreender conceitos abstratos, pois você busca referências reais para entender como funcionam na prática.",
                            "08/07/2022"));

            DicasRepository.add(
                    new Dicas(
                            "Regina Sanctis",
                            " Tenha paciência:nem sempre entendemos o assunto na primeira leitura, o que pode gerar ansiedade e frustração. Por isso, a paciência tem papel fundamental em todas as tarefas ",
                            "10/07/2022"));

            DicasRepository.add(
                    new Dicas(
                            "Bruno da Silva",
                            "Escolha um ambiente calmo e com boa iluminação:um local de estudos fixo, no qual você tenha a sua própria mesa ajuda a manter um hábito. ",
                            "17/07/2022"));

            DicasRepository.add(
                    new Dicas(
                            "Caroline Rossatto",
                            "Mantenha-se longe de distrações:o ideal é manter o celular e outros aparelhos eletrônicos longe na hora de estudar.",
                            "23/07/2022"));

        } else {
            System.out.println("Lista de dicas");
        }
    }

    public static void add(Dicas dicas) {
        DicasRepository.repo.dicas.add(dicas);

    }

    public static ArrayList<Dicas> all() {
        return DicasRepository.repo.dicas;

    }

    public static Dicas getById(int id) {
        return DicasRepository.repo.dicas.stream().filter((dicas) -> dicas.getId() == id).toList().get(0);
    }

    public static boolean deleteById(int id) {
        Dicas userToDelete = getById(id);
        DicasRepository.repo.dicas.remove(userToDelete);
        return true;
    }
}
