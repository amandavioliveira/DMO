package br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.model;

import br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.constantes.Constantes;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Login {
    private int prontuario;
    private int senha;

    public Login(int prontuario, int senha) {
        setProntuario(prontuario);
        setSenha(senha);
    }

    public double getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario < 0 ? prontuario * -1 : prontuario;
    }

    public double getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha < 0 ? senha * -1 : senha;
    }

    public boolean verificarLogin(){
        boolean login;
        if(this.prontuario == Constantes.prontuario){
            if(this.senha == Constantes.senha){
                login = TRUE;
            } else {
                login = FALSE;
            }
        } else {
            login = FALSE;
        }
        return login;
    }
}
