/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

/**
 *
 * @author Usuário
 */
public class Imovel {

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }

    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

    public Imovel(String endereco, int area, Bairro bairro, Finalidade finalidade) {
        setEndereco(endereco);
        setArea(area);
        setBairro(bairro);
        setFinalidade(finalidade);
    }
    
    public double calcularIptu(){
        if (bairro == null) {
            throw new IllegalArgumentException("Bairro não definido.");
        }
        if (bairro.getCoeficienteIptu() < 0) {
            throw new IllegalArgumentException("Coeficiente do bairro não pode ser negativo.");
        }
        if (finalidade == null) {
            throw new IllegalArgumentException("Finalidade não definida.");
        }
        double iptu = 0;
        switch (finalidade){
            case RESIDENCIAL:
                iptu = area;
                break;
            case COMERCIAL:
                if(area<=100){
                    iptu = 500;
                    break;
                }else if(area>100&&area<=400){
                    iptu = 1000;
                    break;
                }else{
                    iptu = (area*2.55);
                    break;
                }
            case INDUSTRIAL:
                if(area<=2000){
                    iptu = 1000;
                    break;
                }else{
                    iptu = (area*0.55);
                    break;
                }
        }
        
        return iptu * bairro.getCoeficienteIptu();
    }
}
