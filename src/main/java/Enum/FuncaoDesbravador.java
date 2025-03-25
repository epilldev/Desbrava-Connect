package Enum;

public enum FuncaoDesbravador {
    DIRETOR_CLUBE(1, "Diretor do Clube"),
    DIRETOR_ASSOCIADO(2, "Diretor Associado"),
    SECRETARIO(3, "Secretário"),
    TESOUREIRO(4, "Tesoureiro"),
    CAPELAO(5, "Capelão"),
    CONSELHEIRO_UNIDADE(6, "Conselheiro de Unidade"),
    CONSELHEIRO_ASSOCIADO(7, "Conselheiro Associado"),
    INSTRUTOR(8, "Instrutor"),
    CAPITAO_UNIDADE(9, "Capitão de Unidade"),
    SECRETARIO_UNIDADE(10, "Secretário de Unidade"),
    TESOUREIRO_UNIDADE(11, "Tesoureiro de Unidade"),
    PADIOLEIRO(12, "Padioleiro"),
    ALMOXARIFE(13, "Almoxarife"),
    COORDENADOR_REGIONAL(14, "Coordenador Regional"),
    DESBRAVADOR(15, "Desbravador");

    private final int codigo;
    private final String descricao;

    FuncaoDesbravador(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static FuncaoDesbravador fromCodigo(int codigo) {
        for (FuncaoDesbravador funcao : values()) {
            if (funcao.getCodigo() == codigo) {
                return funcao;
            }
        }
        throw new IllegalArgumentException("Código inválido para Função de Desbravador: " + codigo);
    }
}

